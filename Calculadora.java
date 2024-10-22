import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese 2 Números");
            float num1 = sc.nextFloat();
            float num2 = sc.nextFloat();
            
            System.out.println("Ingrese la operación deseada");
            String menu = "1: Suma \n2: Resta \n3: Multiplicación \n4: Divición";
            System.out.println(menu);
            int operacion = sc.nextInt();
            float resultado;
            
            resultado = operacion == 1 ? num1 + num2
                    : (operacion == 2 ? num1 - num2
                    : (operacion == 3 ? num1 * num2
                    : (operacion == 4 ? num1 / num2 : 0)));
            
            System.out.println("El resultado es: " + resultado);
        }
    }
}
