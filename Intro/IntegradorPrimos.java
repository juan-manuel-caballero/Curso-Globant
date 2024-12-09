import java.util.Arrays;
import java.util.Scanner;

public class IntegradorPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de primos: ");
        int cantidad = sc.nextInt();
        int[] primos = new int[cantidad];
        int contador = 0;
        sc.close();
        do {
            //Completar
        } while (contador <= primos.length);
        System.out.println(Arrays.toString(primos));
    }   
}