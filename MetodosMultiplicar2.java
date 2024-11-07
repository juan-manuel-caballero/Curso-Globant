
import java.util.Arrays;
import java.util.Scanner;

public class MetodosMultiplicar2 {

    public static void main(String[] args) {
        int[] nros = new int[3];

        for (int i = 0; i < nros.length; i++) {
            nros[i] = pedirNumero();
            imprimirTablaMultiplicar(nros[i]);
        }
        System.out.println(Arrays.toString(nros));
    }

    public static int pedirNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un nro");
        int n = sc.nextInt();
        sc.close();
        return n;
    }

    public static void imprimirTablaMultiplicar(int n) {
        int[] tabla = new int[10];
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = n * (i + 1);
        }

        System.out.println(Arrays.toString(tabla));
    }
}