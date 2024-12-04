import java.util.InputMismatchException;
import java.util.Scanner;

public class Integrador6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        System.out.println("¿Cuantos alumnos quiere registrar?");
        int tamanioAlumnos = Integer.parseInt(sc.nextLine());//para limpiar el buffer
        String[] alumnos = new String[tamanioAlumnos];
        double[] notas = new double[tamanioAlumnos];

        try {
            do {
                System.out.println("""
                ---------------------
                Menú de opciones
                1. Registrar alumno y nota
                2. Mostrar alumnos
                3. Mostrar promedio de notas
                4. Buscar alumno
                5. Modificar nota
                6. Eliminar alumno
                7. Salir
                """);
                option = Integer.parseInt(sc.nextLine());

                switch (option) {
                    case 1 -> {

                        for (int i = 0; i < tamanioAlumnos; i++) {
                            do {
                                System.out.println("Ingrese el nombre del alumno " + (i + 1) + ": ");
                                alumnos[i] = sc.nextLine();
                            } while (alumnos[i].isBlank());
                            do {
                                System.out.println("Ingrese la nota del alumno " + (i + 1) + ": ");
                                notas[i] = Double.parseDouble(sc.nextLine());
                            } while (notas[i] < 0 || notas[i] > 10);
                        }
                    }
                    case 2 -> {
                        for (int i = 0; i < tamanioAlumnos; i++) {
                            System.out.println("Alumno: " + alumnos[i] + " - Nota: " + notas[i]);
                        }
                    }
                    case 3 -> {
                        double suma = 0;
                        for (int i = 0; i < tamanioAlumnos; i++) {
                            suma += notas[i];
                        }
                        double promedio = suma / tamanioAlumnos;
                        System.out.println("El promedio de notas es: " + promedio);
                    }
                    case 4 -> {
                        System.out.println("Ingrese el nombre del alumno a buscar: ");
                        String alumno = sc.nextLine().toLowerCase();
                        int i;
                        for (i = 0; i < alumnos.length; i++) {
                            if (alumnos[i].toLowerCase().contains(alumno)) {
                                System.out.println("La nota del alumno " + alumnos[i] + " es: " + notas[i]);
                                break;
                            }
                        }
                        if (i == alumnos.length) {
                            System.out.println("Alumno no encontrado.");
                        }
                    }
                    case 5 -> {
                        System.out.println("Ingrese el nombre del alumno cuya nota quieres modificar: ");
                        String alumno = sc.nextLine().toLowerCase();
                        int i;
                        for (i = 0; i < alumnos.length; i++) {
                            if (alumnos[i].toLowerCase().contains(alumno)) {
                                System.out.println("La nota del alumno " + alumnos[i] + " es: " + notas[i]);
                                System.out.println("Ingrese la nueva nota del alumno: ");
                                notas[i] = Double.parseDouble(sc.nextLine());
                                System.out.println("La nueva nota es: " + notas[i]);
                                break;
                            }
                        }
                        if (i == alumnos.length) {
                            System.out.println("Alumno no encontrado.");
                        }
                    }
                    case 6 -> {
                        System.out.println("Ingrese el nombre del alumno que quieres borrar: ");
                        String alumno = sc.nextLine().toLowerCase();
                        int i;
                        for (i = 0; i < alumnos.length; i++) {
                            if (alumnos[i].toLowerCase().contains(alumno)) {
                                alumnos[i] = "";
                                notas[i] = 0;
                                System.out.println("Alumno borrado");
                                break;
                            }
                        }
                        if (i == alumnos.length) {
                            System.out.println("Alumno no encontrado.");
                        }
                    }
                    case 7 ->
                        System.out.println("Gracias por utilizar el sistema");
                }
            } while (option != 7);
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("Tipo de dato inválido: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}