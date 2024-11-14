package POO;

import java.util.Scanner;

import POO.modelos.Auto;

public class AutoOpciones {
    public static void main(String[] args) {
        int opcion, anio;
        String marca, modelo;
        Auto auto1 = new Auto();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ingrese 1 para crear un auto");
            System.out.println("Ingrese 2 para mostrar el auto");
            System.out.println("Ingrese 3 para salir");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1 ->{
                    System.out.println("Ingrese la marca del automovil: ");
                    marca = sc.nextLine();
                    auto1.marca = marca;
                    System.out.println("Ingrese el modelo del automovil: ");
                    modelo = sc.nextLine();
                    auto1.modelo = modelo;
                    System.out.println("Ingrese el año del automovil: ");
                    anio = sc.nextInt();
                    sc.nextLine();
                    auto1.anio = anio;
                }
                case 2 -> auto1.imprimirDatos();
                case 3 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción incorrecta");
            }
        } while (opcion != 3);
        sc.close();
    }
}