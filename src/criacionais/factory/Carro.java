package criacionais.factory;

// Implementações concretas
class Carro implements Transporte {
    public void entregar() {
        System.out.println("Entrega feita de carro.");
    }
}
