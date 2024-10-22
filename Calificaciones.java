
import java.util.*;

public class Calificaciones {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su calificación: ");

        int calificacion = sc.nextInt();
        if (calificacion >= 90 && calificacion <= 100) {
            System.out.println("A");
        } else if (calificacion >= 80 && calificacion <= 89) {
            System.out.println("B");
        } else if (calificacion >= 70 && calificacion <= 79) {
            System.out.println("C");
        } else if (calificacion >= 60 && calificacion <= 69) {
            System.out.println("D");
        } else if (calificacion >= 0 && calificacion <= 59) {
            System.out.println("E");
        } else {
            System.out.println("Calificación  incorrecta.");
        }
        sc.close();
    }
}
