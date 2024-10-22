
import java.util.Scanner;

public class Divisibles {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un número: ");
        int numero = scanner.nextInt();

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("Número divisible entre 3 y 5");
        } else if (numero % 5 == 0) {
            System.out.println("Número divisible entre 5");
        } else if (numero % 3 == 0) {
            System.out.println("Número divisible entre 3");
        } else {
            System.out.println("Número no divisible entre 3 ni 5");
        }

        scanner.close();
    }
}
