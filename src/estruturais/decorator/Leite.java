package estruturais.decorator;

// Adicionais
class Leite extends CafeDecorator {
    public Leite(Cafe cafe) {
        super(cafe);
    }

    public String descricao() {
        return super.descricao() + " com leite";
    }

    public double preco() {
        return super.preco() + 2.00;
    }
}
