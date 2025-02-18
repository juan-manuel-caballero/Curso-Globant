import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la posicion para buscar");
        int posicion = sc.nextInt();

        int resultado = buscarPosicion(posicion);

        System.out.println(resultado);
        sc.close();
    }

    public static int buscarPosicion(int numero) {
        return switch (numero) {
            case 1 -> 0;
            case 2, 3 -> 1;
            default -> buscarPosicion(numero - 1) + buscarPosicion(numero - 2);
        };
    }
}