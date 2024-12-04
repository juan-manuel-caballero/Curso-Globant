import java.util.Scanner;

public class SaludarUsuario {

    public static void main(String[] args) {
        saludar();
    }

    public static void saludar() {
        Scanner miscanner = new Scanner(System.in);

        try {
            String nombre = solicitarNombre(miscanner);
            System.out.println("¡Hola, " + nombre + "!");
        } catch (IllegalArgumentException e) {
            System.err.println("Error: El nombre debe tener al menos 2 caracteres.");
        } finally {
            miscanner.close();
            System.out.println();
        }
    }

    public static String solicitarNombre(Scanner miscanner) {
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = miscanner.nextLine();

        if (nombre.length() < 2) {
            throw new IllegalArgumentException();
        }
        return nombre;
    }
}