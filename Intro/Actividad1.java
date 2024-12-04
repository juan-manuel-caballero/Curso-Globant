
import java.util.Scanner;

public class Actividad1 {

    public static void main(String[] args) {

        try (Scanner miScanner = new Scanner(System.in)) {
            System.out.println("Ingrese su edad: ");
            int edad = miScanner.nextInt();
            System.out.print("Su edad es: " + edad);
        }
    }
}