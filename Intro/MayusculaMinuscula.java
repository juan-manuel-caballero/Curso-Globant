import java.util.Scanner;

public class MayusculaMinuscula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();
        sc.close();
        System.out.println("Su frase en mayúsculas es: " + frase.toUpperCase());
        System.out.println("Su frase en minúsculas es: " + frase.toLowerCase());
    }
}