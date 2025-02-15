package criacionais.sigleton;

class Logger {
    private static Logger instancia;

    private Logger() { } // Construtor privado

    public static Logger getInstancia() {
        if (instancia == null) {
            instancia = new Logger();
        }
        return instancia;
    }

    public void log(String mensagem) {
        System.out.println("[LOG]: " + mensagem);
    }
}
