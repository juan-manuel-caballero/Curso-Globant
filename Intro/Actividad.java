import java.util.Scanner;
public class Actividad {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese un número entero: ");
            int numero = sc.nextInt();

            System.out.println("El valor absoluto de su número es: " + Math.abs(numero));
        }
    }
}