
import java.util.Scanner;

public class MetodosIISobrecarga {

    public static Scanner sc = new Scanner(System.in);

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void imprimirArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void imprimirArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" ");
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

    public static void imprimirArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" ");
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[][] arrayB = {{1, 2, 3, 4, 5}, {10, 20, 30, 40, 50}};
        String[] arrayS = {"A", "B", "C", "DEFG"};
        String[][] arraySB = {{"A", "B", "C", "DEFG"}, {"Y", "Z", "X", "V"}};
        imprimirArray(array);
        System.out.println(" ");
        imprimirArray(arrayB);
        System.out.println(" ");
        imprimirArray(arraySB);
        System.out.println(" ");
        imprimirArray(arrayS);
    }
}