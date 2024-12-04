// Escribe un programa que solicite al usuario ingresar una frase y dos caracteres. Utiliza el método replace()
// de la clase String para reemplazar todas las ocurrencias del primer carácter con el segundo carácter en la
// frase ingresada por el usuario. Muestra la frase resultante en pantalla.

import java.util.Scanner;

public class Remplazo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = scan.nextLine();
        System.out.println("Ingrese el caracter que desea reemplazar");
        char car1 = scan.next().charAt(0);
        System.out.println("Ingrese el caracter nuevo por el que desea reemplazar el anterior");
        char car2 = scan.next().charAt(0);

        System.out.println(frase.replace(String.valueOf(car1).toLowerCase(), String.valueOf(car2).toLowerCase()).replace(String.valueOf(car1).toUpperCase(), String.valueOf(car2).toUpperCase()));
        scan.close();
    }
}