//Escribe un programa que pida al usuario ingresar una palabra y un carácter,
//y determine si el carácter ingresado se encuentra en la palabra utilizando el método indexOf()
//de la clase String. Muestra un mensaje adecuado en pantalla indicando si el carácter
//se encuentra o no en la palabra.

import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String palabra;
        char caracter;
        int posicion;
        System.out.println("Ingrese una palabra");
        palabra = scn.nextLine();

        System.out.println("Ingrese un caracter");

        caracter = scn.next().charAt(0);

        posicion = palabra.indexOf(caracter);

        if (posicion != -1) {
            System.out.println("El caracter encuentra en la palabra en la posición " + posicion);

        } else {
            System.out.println("El caracter no se encuentra en la palabra");

        }
        scn.close();
    }
}
