
import java.util.Scanner;

public class FactorialMetodos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la posicion para buscar");
        int posicion = sc.nextInt();

        long resultado = buscarPosicion(posicion);

        System.out.println(resultado);
        sc.close();
    }

    public static int buscarPosicion(int numero) {
        if (numero == 1) {
            return 1;
        } else {
            return buscarPosicion(numero - 1) * numero;
        }
    }
}