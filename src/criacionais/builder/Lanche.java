package criacionais.builder;

class Lanche {
    private String pao;
    private String carne;
    private boolean queijo;

    // Construtor privado para impedir instância direta
    private Lanche(String pao, String carne, boolean queijo) {
        this.pao = pao;
        this.carne = carne;
        this.queijo = queijo;
    }

    // Exibir o lanche pronto
    public void mostrar() {
        System.out.println("Lanche: " + pao + ", " + carne + ", " + (queijo ? "com queijo" : "sem queijo"));
    }

    // Classe Builder
    static class Builder {
        private String pao;
        private String carne;
        private boolean queijo;

        public Builder comPao(String pao) {
            this.pao = pao;
            return this;
        }

        public Builder comCarne(String carne) {
            this.carne = carne;
            return this;
        }

        public Builder comQueijo(boolean queijo) {
            this.queijo = queijo;
            return this;
        }

        public Lanche build() {
            return new Lanche(pao, carne, queijo);
        }
    }
}
