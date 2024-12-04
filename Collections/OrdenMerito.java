import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenMerito{

    public static void main(String[] args) {
        ArrayList<Integer> meritos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        boolean condition = false;
        do {
            System.out.print("Ingrese una nota entre 1 y 10. Con 0 sale del programa:");
            Integer nota = Integer.valueOf(sc.nextLine());
            if (nota == 0) {
                condition = true;
            } else if (nota >= 1 && nota <= 10) {
                meritos.add(nota);
            } else {
                System.out.println("Nota mal ingresada.");
            }

        } while (!condition);

        Collections.sort(meritos);
        System.out.println("Orden ascendente: " + meritos);

        Collections.reverse(meritos);
        System.out.println("Orden descendente: " + meritos);

        sc.close();
    }
}