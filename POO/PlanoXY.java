package POO;

import POO.modelos.Punto;
public class PlanoXY {
    public static void main(String[] args) {
        Punto[] arrayPuntos = new Punto[3];
        Punto punto1 = new Punto(1,1);
        Punto punto2 = new Punto(3,3);
        Punto punto3 = new Punto(4,5);

        arrayPuntos[0] = punto1;
        arrayPuntos[1] = punto2;
        arrayPuntos[2] = punto3;

        System.out.println(punto3.distanciaDesdeOrigen());
        System.out.println(punto1.distanciaEntrePuntos(punto2.getX(), punto2.getY()));
        System.out.println(punto1.estanAlineados(punto2.getX(), punto2.getY(), punto3.getX(), punto3.getY()));
    }
}