import java.util.Scanner;

public class Comparacion2 {

    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            int a, b, c, d;
            System.out.println("\n Ahora ingresa dos números que quisieras operar: ");
            a = scan.nextInt();
            b = scan.nextInt();
            System.out.println(a != b ? "Son distintos" : "Son iguales");
            System.out.println(a % 2 == 0 ? "Es divisible entre dos" : "No es divisible");
            System.out.println("\n Ingrese otros dos números: ");
            c = scan.nextInt();
            d = scan.nextInt();
            System.out.println(a > b && c > d ? "El primero y tercer numero son mayores" : "El primero y tercer numero no son mayores");
            System.out.println(a > b || c > d ? "El primero o tercer numero son mayores" : "El primero o tercer numero no son mayores");
            scan.close();
        }
    }
}