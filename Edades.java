import java.util.Scanner;

public class Edades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        if((edad >=0) && (edad <18)) {
            System.out.println("Eres menor de edad");
        }else if (edad >= 18 && edad <= 64) {
            System.out.println("Eres adulto");
        }else if (edad >=65) {
            System.out.println("Eres adulto mayor");
        }else {
            System.out.println("Edad incorrecta");
        }

        scanner.close();
    }
}