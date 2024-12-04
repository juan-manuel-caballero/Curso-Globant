package POO;

import java.util.Arrays;
import java.util.Scanner;

import POO.modelos.Circulo;
import POO.modelos.Rectangulo;
import POO.modelos.Triangulo;


public class FigurasGeometricas {

    static Rectangulo[] rectangulos = new Rectangulo[0];

    public static void main(String[] args) {
        int opcion, opcionMetodo;
        Integer alto, ancho, base, radio;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("MENU");
            System.out.println("----------");
            System.out.println("1-Crear Rectángulo");
            System.out.println("2-Crear Triangulo");
            System.out.println("3-Crear Circulo");

            System.out.println("4-Salir");
            opcion = scanner.nextInt();
            if (opcion > 4) {
                System.out.println("Ingresa una opción válida");
            }
            if (opcion == 1) {
                rectangulos = Arrays.copyOf(rectangulos, Rectangulo.numTotal() + 1);
                System.out.println("CREACIÓN DEL RECTÁNGULO");
                System.out.println("----------");
                System.out.print("Indica el alto: ");
                alto = scanner.nextInt();
                System.out.print("Indica el ancho: ");
                ancho = scanner.nextInt();
                Rectangulo rectangulo = new Rectangulo(ancho, alto);
                rectangulos[Rectangulo.numTotal() - 1] = rectangulo;
                System.out.println(">> Rectángulo creado");
                do {
                    System.out.println("\nMENU RECTÁNGULO");
                    System.out.println("----------");
                    System.out.println("¿Que deseas hacer?");
                    System.out.println("1- Calcular área");
                    System.out.println("2- Calcular perímetro");
                    System.out.println("3- Cantidad de Rectángulos");
                    System.out.println("4- Volver al menú anterior");
                    opcionMetodo = scanner.nextInt();

                    switch (opcionMetodo) {
                        case 1 -> {
                            rectangulo.imprimirArea();
                        }
                        case 2 -> {
                            rectangulo.imprimirPerimetro();
                        }
                        case 3 -> {
                            System.out.printf("Se han creado %d rectángulo/s \n", Rectangulo.numTotal());
                        }
                        case 4 -> {
                        }
                        default ->
                            System.out.println(">> Selecciona una opción válida");
                    }
                } while (opcionMetodo != 4);

            } else if (opcion == 2) {
                System.out.println("CREACIÓN DEL TRIANGULO");
                System.out.println("--- -------");
                System.out.print("Indica la base: ");
                base = scanner.nextInt();
                System.out.print("Indica la altura: ");
                alto = scanner.nextInt();
                Triangulo triangulo = new Triangulo(base, alto);
                System.out.println(">> Rectángulo creado");
                do {
                    System.out.println("\nMENU TRIANGULO");
                    System.out.println("----------");
                    System.out.println("¿Que deseas hacer?");
                    System.out.println("1- Calcular área");
                    System.out.println("2- Volver al menú anterior");
                    opcionMetodo = scanner.nextInt();

                    switch (opcionMetodo) {
                        case 1 -> {
                            triangulo.area();
                            triangulo.imprimirArea();
                        }
                        case 2 -> {
                        }
                        default ->
                            System.out.println(">> Selecciona una opción válida");
                    }
                } while (opcionMetodo != 2);
            } else if (opcion == 3) {
                System.out.println("CREACIÓN DEL CIRCULO");
                System.out.println(" ----------");
                System.out.print("Indica el radio: ");
                radio = scanner.nextInt();
                Circulo circulo = new Circulo(radio);
                System.out.println(">> Circulo creado");
                do {
                    System.out.println("\nMENU Circulo");
                    System.out.println("----------");
                    System.out.println("¿Que deseas hacer?");
                    System.out.println("1- Calcular área");
                    System.out.println("2- Calcular perimetro");
                    System.out.println("3- Volver al menú anterior");
                    opcionMetodo = scanner.nextInt();

                    switch (opcionMetodo) {
                        case 1 -> {
                            circulo.area();
                            circulo.imprimirArea();
                        }
                        case 2 -> {
                            circulo.perimetro();
                            circulo.imprimirPerimetro();
                        }
                        case 3 -> {

                        }
                        default ->
                            System.out.println(">> Selecciona una opción válida");
                    }
                } while (opcionMetodo != 3);
            }
        } while (opcion != 4);
        scanner.close();
    }
}
