package estruturais.decorator;

/*
* Permite adicionar funcionalidades a um objeto de forma dinâmica, sem modificar sua estrutura.

✅ Exemplo: Um café com opcionais como leite e chantilly.
* */
public class App {
    public static void main(String[] args) {
        Cafe meuCafe = new Leite(new CafeSimples());
        System.out.println(meuCafe.descricao() + " custa R$ " + meuCafe.preco());
    }
}
