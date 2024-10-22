import java.util.Scanner;

public class BuscandoElementos {

    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        int[] array = {1, 2, 3};

        System.out.println("Intrese el número para buscar en el array: ");
        int num = miScanner.nextInt();

        if (num == array[0]) {
            System.out.println("El número se encuentra en el array en el índice 0.");
        } else if (num == array[1]) {
            System.out.println("El número se encuentra en el array en el índice 1.");
        } else if (num == array[2]) {
            System.out.println("El número se encuentra en el array en el índice 2.");
        } else {
            System.out.println("El número buscado no se encuentra en el array.");
        }
        miScanner.close();
    }
}