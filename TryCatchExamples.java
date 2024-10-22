import java.util.Scanner;

public class TryCatchExamples {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = scanner.nextInt();
        try {
            float division = (float) num1 / (float) num2;
            System.out.println("Resultado: " + division);
        } catch (ArithmeticException e) {
            System.out.println("No se puede divir por 0");
        }
    }
}