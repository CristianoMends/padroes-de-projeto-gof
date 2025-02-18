# 🎭 Padrão Decorator
O Decorator é um padrão estrutural que permite adicionar funcionalidades a um objeto dinamicamente, sem modificar sua estrutura original.

## 🏗 Passo 1: Por que usar Decorator?
Imagine que temos um sistema de café. Podemos ter diferentes tipos de café, como café normal e café com leite.
Se fôssemos criar uma classe para cada variação (ex: CaféSimples, CaféComLeite, CaféComChocolate...), rapidamente teríamos muitas classes diferentes.

O Decorator resolve isso permitindo adicionar funcionalidades sem criar subclasses para cada combinação.

## 🏗 Passo 2: Estrutura do Decorator
No padrão Decorator, temos:

- Interface Base → Define o comportamento básico.
- Classe Concreta → Implementa a interface base.
- Decorador Abstrato → Mantém uma referência para a interface base.
- Decoradores Concretos → Adicionam novas funcionalidades.

## ☕ Exemplo Prático – Cafeteria
📌 Passo 1: Criamos a Interface Base
```java
// Define a interface base para café
public interface Cafe {
    String getDescricao();
    double getCusto();
}
```
📌 Passo 2: Criamos a Implementação Concreta
```java
// Classe concreta - Café simples
public class CafeSimples implements Cafe {
    @Override
    public String getDescricao() {
        return "Café Simples";
    }

    @Override
    public double getCusto() {
        return 5.0;
    }
}
```
📌 Passo 3: Criamos um Decorador Abstrato
```java
// Classe abstrata para os decoradores
public abstract class CafeDecorator implements Cafe {
protected Cafe cafeDecorado;

    public CafeDecorator(Cafe cafe) {
        this.cafeDecorado = cafe;
    }

    @Override
    public String getDescricao() {
        return cafeDecorado.getDescricao();
    }

    @Override
    public double getCusto() {
        return cafeDecorado.getCusto();
    }
}
```
📌 Passo 4: Criamos Decoradores Concretos
```java
// Decorador que adiciona leite ao café
public class ComLeite extends CafeDecorator {
    public ComLeite(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafeDecorado.getDescricao() + ", com leite";
    }

    @Override
    public double getCusto() {
        return cafeDecorado.getCusto() + 2.0; // Leite custa 2 reais
    }
}
```
```java
// Decorador que adiciona chocolate ao café
public class ComChocolate extends CafeDecorator {
    public ComChocolate(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafeDecorado.getDescricao() + ", com chocolate";
    }

    @Override
    public double getCusto() {
        return cafeDecorado.getCusto() + 3.0; // Chocolate custa 3 reais
    }
}
```
📌 Passo 5: Testamos o Decorator
```java
public class Main {
    public static void main(String[] args) {
        // Criando um café simples
        Cafe meuCafe = new CafeSimples();
        System.out.println(meuCafe.getDescricao() + " - R$" + meuCafe.getCusto());

        // Adicionando leite ao café
        meuCafe = new ComLeite(meuCafe);
        System.out.println(meuCafe.getDescricao() + " - R$" + meuCafe.getCusto());

        // Adicionando chocolate ao café com leite
        meuCafe = new ComChocolate(meuCafe);
        System.out.println(meuCafe.getDescricao() + " - R$" + meuCafe.getCusto());
    }
}
```
🔥 Saída do Código
```bash
    Café Simples - R$5.0
    Café Simples, com leite - R$7.0
    Café Simples, com leite, com chocolate - R$10.0
```
## 🎯 Vantagens do Decorator
- ✅ Evita muitas subclasses → Em vez de criar CafeComLeite e CafeComChocolate, usamos decoradores.
- ✅ Flexível → Podemos adicionar novas funcionalidades sem modificar o código original.
- ✅ Extensível → Podemos combinar múltiplos decoradores sem modificar as classes existentes.