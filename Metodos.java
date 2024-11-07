// Imprimir nombre: Crea un método llamado imprimeNombre() que reciba por parámetro un nombre y luego imprima el mensaje "Mi nombre es [nombre]". Invocar dicho método desde el método main para ver el mensaje por consola

import java.util.Scanner;

public class Metodos {
public static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
System.out.println("Ingresar nombre");
String name = sc.nextLine();
imprimeNombre(name);
}

public static void imprimeNombre(String name) {
System.out.println("Mi nombre es " + name + ".");
}

}