import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SopaNumeros {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros = leerValores();
        calcularSuma(numeros);
    }

    public static ArrayList<Integer> leerValores() {
        ArrayList<Integer> numero = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("Ingrese un numero");
            num = Integer.valueOf(scanner.nextLine());
            if (num != -99) {
                numero.add(num);
            }
        } while (num != -99);
        scanner.close();
        return numero;
    }

    public static void calcularSuma(ArrayList<Integer> numeros) {
        Iterator<Integer> iterator = numeros.iterator();
        int suma = 0;
        while (iterator.hasNext()) {
            suma += iterator.next();
        }
        System.out.println("La suma de todos los elementos de la lista es: " + suma);
    }
}