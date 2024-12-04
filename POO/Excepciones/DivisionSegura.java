import java.util.Scanner;

public class DivisionSegura {

    public static void main(String[] args) throws Exception {
        obtenerNumeros();
    }

    public static void obtenerNumeros() {

        Scanner miscanner = new Scanner(System.in);

        System.out.print("Ingrese el dividendo: ");
        int dividendo = miscanner.nextInt();
        System.out.print("Ingrese el divisor: ");
        int divisor = miscanner.nextInt();

        realizarDivision(dividendo, divisor);
        miscanner.close();
    }

    public static void realizarDivision(int dividendo, int divisor) {
        try {
            double resultado = dividendo / divisor;
            //double resultado = dividir(dividendo, divisor);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }
    }
}