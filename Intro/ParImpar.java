import java.util.Scanner;

public class ParImpar{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\n Ingrese un número: ");
            int numero = sc.nextInt();
            System.out.println(numero%2==0 ? "El número es par" : "El número es impar");
        }
    }
}