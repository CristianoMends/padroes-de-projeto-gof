package criacionais.factory;

class CarroFactory extends TransporteFactory {
    @Override
    Transporte criarTransporte() {
        return new Carro();
    }
}
