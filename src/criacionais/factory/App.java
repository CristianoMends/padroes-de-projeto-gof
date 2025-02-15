package criacionais.factory;
/*
*
1️⃣ Factory Method
Permite criar objetos sem expor a lógica de criação ao cliente. A subclasse decide qual objeto criar.

✅ Exemplo: Uma fábrica de transportes que pode criar carros ou motos sem expor os detalhes.
* */

public class App {

    public static void main(String[] args) {
        TransporteFactory factory = new CarroFactory();
        Transporte transporte = factory.criarTransporte();
        transporte.entregar();  // Saída: Entrega feita de carro.
    }

}
