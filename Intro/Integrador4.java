import java.util.Scanner;

public class Integrador4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, ingrese el tamaño del cuadrado: ");
        int cantidad = sc.nextInt();

        for (int i = 0; i < cantidad; i++) {
            for (int j = 0; j < cantidad; j++) {
                if (i == 0 || i == cantidad - 1 || j == 0 || j == cantidad - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}