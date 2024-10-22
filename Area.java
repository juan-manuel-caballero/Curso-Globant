import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una opcion del 1 al 3:");
        int opcion = scanner.nextInt();
        double area = switch (opcion) {
            case 1 -> {
                System.out.println("Ingrese el radio del círculo");
                double radio = scanner.nextInt();
                double areaCirculo = (radio * radio) * Math.PI;
                yield areaCirculo;
            }
            case 2 -> {
                System.out.println("Ingrese el lado del cuadrado");
                double lado = scanner.nextInt();
                double areaCuadrado = lado * lado;
                yield areaCuadrado;
            }
            case 3 -> {
                System.out.println("Ingrese la base del triangulo");
                double base = scanner.nextInt();
                System.out.println("Ingrese la altura del triangulo");
                double altura = scanner.nextInt();
                double areaTriangulo = (base * altura) / 2;
                yield areaTriangulo;
            }
            default ->
                0;
        };
        System.out.println("El área de su figura seleccionada es: " + area);

        scanner.close();
    }
}