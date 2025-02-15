package criacionais.sigleton;

public class App {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstancia();
        Logger logger2 = Logger.getInstancia();

        logger1.log("Iniciando o sistema...");
        logger2.log("Erro ao conectar ao banco de dados.");

        System.out.println(logger1 == logger2); // true (mesma instância)
    }
}
