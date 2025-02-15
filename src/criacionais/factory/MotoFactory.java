package criacionais.factory;

class MotoFactory extends TransporteFactory {
    @Override
    Transporte criarTransporte() {
        return new Moto();
    }
}
