package estruturais.decorator;

class CafeSimples implements Cafe {
    public String descricao() {
        return "Café simples";
    }

    public double preco() {
        return 5.00;
    }
}
