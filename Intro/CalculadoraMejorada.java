import java.util.Scanner;

public class CalculadoraMejorada {

    public static Scanner sc = new Scanner(System.in);

    public static int pedirNumero() {
        System.out.println("Ingrese un numero: ");
        return sc.nextInt();
    }

    public static int Multiplicar(int a, int b) {
        return a * b;
    }

    public static int Suma(int a, int b) {
        return a + b;
    }

    public static double Dividir(double a, double b) {
        return a / b;
    }

    public static int Resta(int a, int b) {
        return a - b;
    }

    public static void Menu() {

        int opcion;
        do {
            System.out.println("""
Ingrese la operacion:
1 - Sumar
2 - Restar
3 - Multiplicar
4 - Dividir
5 - Salir
""");
            opcion = sc.nextInt();
            double resultado = 0;

            switch (opcion) {
                case 1:
                    resultado = Suma(pedirNumero(), pedirNumero());
                    break;
                case 2:
                    resultado = Resta(pedirNumero(), pedirNumero());
                    break;
                case 3:
                    resultado = Multiplicar(pedirNumero(), pedirNumero());
                    break;
                case 4:
                    try {
                        resultado = Dividir((double) pedirNumero(), (double) pedirNumero());
                    } catch (ArithmeticException e) {
                        System.out.println("No puede dividir por cero. No merece existir");
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("No valido.");
                    break;
            }
            System.out.println(resultado);

        } while (opcion >= 5);
    }

    public static void main(String[] args) {
        Menu();

    }
}