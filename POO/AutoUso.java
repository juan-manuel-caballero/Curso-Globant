package POO;

import POO.modelos.Auto;

public class AutoUso {

    public static void main(String[] args) {
        Auto carro = new Auto("Chevrolet", "p", 2020);
        Auto carro2 = new Auto("Chevrolet", "hola");
        Auto carro3 = new Auto("Nissan");
        carro.imprimirDatos();
        carro2.imprimirDatos();
        carro3.imprimirDatos();

    }
}