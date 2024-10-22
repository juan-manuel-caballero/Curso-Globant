import java.util.Scanner;

public class ValidacionContrasenna {

    public static void main(String[] args) {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.println("Validación de contraseña:");
            String contrasenna = myScanner.nextLine();
            String correcta = "secreto";
            
            while (!contrasenna.equals(correcta)) {
                System.out.println("La contraseña es incorrecta intente nuevamente: ");
                contrasenna = myScanner.nextLine();
            }
            System.out.println("La contraseña es correcta Bienvenido!");
        }
    }
}