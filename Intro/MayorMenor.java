import java.util.Scanner;

public class MayorMenor {
    public static void main(String[] args) {
        int aleatorio = (int) (Math.random() * (20 - 0 + 1) + 0);
        Scanner scan = new Scanner(System.in);
        System.out.println(aleatorio);
        int num = 0;
        do {
            System.out.println("Ingrese un número");
            num = scan.nextInt();
            if (num < aleatorio) {
                System.out.println("el número ingresado es menor al aleario");
            } else if (num > aleatorio) {
                System.out.println("El número ingresado es mayor al aleatorio");
            }
        } while (num != aleatorio);
            System.out.println("Número correcto!");
            scan.close();
    }
}