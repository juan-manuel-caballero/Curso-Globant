import java.util.Scanner;

public class PrimosMetodos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Ingrese el numero");
            numero = sc.nextInt();
            if (numero == 0) {
                System.out.println("Saliendo del programa");
                break;
            }
            System.out.println(esPrimo(numero) ? "El numero es primo" : "El numero no es primo");
        } while (numero != 0 && !esPrimo(numero));
        sc.close();
    }

    public static boolean esPrimo(int numero) {
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}