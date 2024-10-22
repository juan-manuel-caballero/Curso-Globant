
import java.util.Scanner;

public class AreaPerimetro {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese una opcion del 1 al 2:");
            int opcion = scanner.nextInt();
            double area, perimetro;
            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese el radio del círculo");
                    double radio = scanner.nextInt();
                    area = (radio * radio) * Math.PI;
                    perimetro = 2 * radio * Math.PI;
                }
                case 2 -> {
                    System.out.println("Ingrese la base del rectangulo");
                    double base = scanner.nextInt();
                    System.out.println("Ingrese la altura del rectangulo");
                    double altura = scanner.nextInt();
                    area = base * altura;
                    perimetro = (2 * base) + (2 * altura);
                }
                default -> {
                    System.out.println("Opcion no valida");
                    area = 0;
                    perimetro = 0;
                }
            }   System.out.println("Ingresa una opcion: '1.-area' o '2.-perimetro'");
            int operacion = scanner.nextInt();
            switch (operacion) {
                case 1 -> System.out.println("El area es :" + area);
                case 2 -> System.out.println("El perimetro es :" + perimetro);
                default -> System.out.println("Opcion no valida");
            }
        }
    }
;
}