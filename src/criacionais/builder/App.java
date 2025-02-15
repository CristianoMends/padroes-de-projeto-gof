package criacionais.builder;
/*
* 2️⃣ Builder
Separa a construção de um objeto complexo da sua representação, permitindo diferentes configurações.

✅ Exemplo: Construção de um hambúrguer personalizado.
* */
public class App {
    public static void main(String[] args) {
        Hamburguer meuBurger = new Hamburguer
                .HamburguerBuilder("Brioche", "Bovina")
                .comQueijo()
                .comAlface()
                .build();

        meuBurger.mostrar();  // Saída: Hambúrguer: Brioche, Bovina, queijo, alface
    }
}

