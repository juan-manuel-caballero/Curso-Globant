import java.util.Scanner;

public class PassValidator {

    public static void main(String[] args) {
        try (Scanner escaner = new Scanner(System.in)) {
            boolean esSegura = false;
            String contrasenia;
            
//System.out.println(contrasenia.matches("[!@#$%&*()_+=|<>?{}\\\\[\\\\]~-]"));
do {
    System.out.println("Ingrese una contraseña");
    contrasenia = escaner.nextLine();
    if (contrasenia.length() >= 8) {
        if (contrasenia.matches(".*[A-Z].*")) {
            if (contrasenia.matches(".*[a-z].*")) {
                if (contrasenia.matches(".*[0-9].*")) {
                    if (contrasenia.matches(".*[^a-zA-Z0-9].*")) {
                        System.out.println("La contraseña es segura, cumple todos los criterios");
                        esSegura = true;
                    } else {
                        System.out.println("La contraseña debe contener al menos un carácter especial");
                    }
                } else {
                    System.out.println("La contraseña debe contener al menos un número");
                }
            } else {
                System.out.println("La contraseña debe contener al menos una letra minúscula.");
            }
        } else {
            System.out.println("La contraseña debe contener al menos una letra mayúscula.");
        }
    } else {
        System.out.println("La contraseña debe tener al menos 8 caracteres.");
    }
} while (!esSegura);
        }

    }
}