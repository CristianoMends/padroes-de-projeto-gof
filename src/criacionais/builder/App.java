package criacionais.builder;

/*
* 2️⃣ Builder
Separa a construção de um objeto complexo da sua representação, permitindo diferentes configurações.

✅ Exemplo: Construção de um hambúrguer personalizado.
*
* */
public class App {
    public static void main(String[] args) {
        Lanche meuLanche = new Lanche.Builder()
                .comPao("Brioche")
                .comCarne("Frango")
                .comQueijo(true)
                .build();

        meuLanche.mostrar();
    }
}
