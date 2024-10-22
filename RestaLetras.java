import java.util.InputMismatchException;
import java.util.Scanner;

public class RestaLetras {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            try {
                System.out.print("Ingresa un numero: ");
                int num1 = sc.nextInt();
                System.out.println("Ingresa otro numero");
                int num2 = sc.nextInt();
                int resutado = num1 - num2;
                System.out.println("El resultado de " + num1 + " - " + num2 + " es " + resutado);
            }
            catch (InputMismatchException e) {
                System.out.println("Oye amiguito no restes letras");
            }
        }
    }
}