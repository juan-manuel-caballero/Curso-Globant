import java.util.InputMismatchException;
import java.util.Scanner;
// [°F] = ([°C] × 9 ⁄ 5) + 32
// [°C] = ([°F] − 32) × 5 ⁄ 9

public class IntegradorJava1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double temp;
        try {
            System.out.println("Ingrese la temperatura");
            temp = sc.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Temperatura invalida boludazo");
            temp = sc.nextDouble();
        }
        System.out.println("Celsius (C) o Farenheit (F)");
        sc.nextLine();
        String tipo = sc.nextLine();

        if (tipo.equals("C")) {
            double resultado = ((temp * (9.0 / 5.0)) + 32);
            System.out.println("La temperatura en Farenheit es: " + resultado);
        } else if (tipo.equals("F")) {
            double resultado = ((temp - 32) * (5.0 / 9.0));
            System.out.println("La temperatura en Celsius es: " + resultado);
        } else {
            System.out.println("Opcion no valida");
        }
        sc.close();
    }
}