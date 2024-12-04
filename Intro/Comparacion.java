import java.util.Scanner;

public class Comparacion {

    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            int a, b;
            System.out.println("\n Ahora ingresa dos números que quisieras operar: ");
            a = scan.nextInt();
            b = scan.nextInt();
            System.out.println("El numero mayor es: " + (a > b ? a : b));
            System.out.println(a != b ? "Son distintos" : "Son iguales");
            System.out.println(a % 2 == 0 ? "Es divisible entre dos" : "No es divisible");
            scan.close();
        }
    }
}