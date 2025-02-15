package criacionais.builder;

class Hamburguer {
    private String pao;
    private String carne;
    private boolean queijo;
    private boolean alface;

    private Hamburguer(HamburguerBuilder builder) {
        this.pao = builder.pao;
        this.carne = builder.carne;
        this.queijo = builder.queijo;
        this.alface = builder.alface;
    }

    public void mostrar() {
        System.out.println("Hambúrguer: " + pao + ", " + carne +
                (queijo ? ", queijo" : "") + (alface ? ", alface" : ""));
    }

    // Builder interno
    static class HamburguerBuilder {
        private String pao;
        private String carne;
        private boolean queijo;
        private boolean alface;

        HamburguerBuilder(String pao, String carne) {
            this.pao = pao;
            this.carne = carne;
        }

        HamburguerBuilder comQueijo() {
            this.queijo = true;
            return this;
        }

        HamburguerBuilder comAlface() {
            this.alface = true;
            return this;
        }

        Hamburguer build() {
            return new Hamburguer(this);
        }
    }
}
