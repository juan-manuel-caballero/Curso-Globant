import java.util.Scanner;

public class MetodosMultiplicar2Mejorado {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingresar cantidad de numeros para calcular sus tablas: ");
        int n = sc.nextInt();
        int[] numeros = pedirNumeros(n);
        imprimirTablasMultiplicar(numeros);
    }

    public static int[] pedirNumeros(int n) {
        int[] numeros = new int[n];
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf((i + 1) + " - ingresar numero: ");
            numeros[i] = sc.nextInt();
        }
        return numeros;
    }

    public static void imprimirTablasMultiplicar(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Tabla del " + numeros[i] + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(numeros[i] * j);
            }
        }
    }
}