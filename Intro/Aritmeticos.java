import java.util.Scanner;

public class Aritmeticos {

    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            int a = 2, b = 5;
            System.out.println("La suma de los numeros da: " + (a + b));
            System.out.println("La resta de los numeros da: " + (a - b));
            System.out.println("La multiplicacion de los numeros da: " + (a * b));
            System.out.println("La division de los numeros da: " + (a / b));
            System.out.println("El modulo de los numeros da: " + (a % b));
            System.out.println("\n Ahora ingresa los números que quisieras operar: ");
            a = scan.nextInt();
            b = scan.nextInt();
            System.out.println("La suma de los numeros da: " + (a + b));
            System.out.println("La resta de los numeros da: " + (a - b));
            System.out.println("La multiplicacion de los numeros da: " + (a * b));
            System.out.println("La division de los numeros da: " + (a / b));
            System.out.println("El modulo de los numeros da: " + (a % b));
        }
    }
}