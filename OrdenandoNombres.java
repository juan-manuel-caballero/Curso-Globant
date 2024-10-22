import java.util.Scanner;

public class OrdenandoNombres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa cuatro nombres:");
        String temp = "";
        String arrayNombres[] = new String[4];

        arrayNombres[0] = scanner.nextLine();
        arrayNombres[1] = scanner.nextLine();
        arrayNombres[2] = scanner.nextLine();
        arrayNombres[3] = scanner.nextLine();

        if (arrayNombres[0].compareTo(arrayNombres[1]) > 0) {
            temp = arrayNombres[0];
            arrayNombres[0] = arrayNombres[1];
            arrayNombres[1] = temp;

        }
        if (arrayNombres[0].compareTo(arrayNombres[2]) > 0) {
            temp = arrayNombres[0];
            arrayNombres[0] = arrayNombres[2];
            arrayNombres[2] = temp;

        }
        if (arrayNombres[0].compareTo(arrayNombres[3]) > 0) {
            temp = arrayNombres[0];
            arrayNombres[0] = arrayNombres[3];
            arrayNombres[3] = temp;

        }
        if (arrayNombres[1].compareTo(arrayNombres[2]) > 0) {
            temp = arrayNombres[1];
            arrayNombres[1] = arrayNombres[2];
            arrayNombres[2] = temp;

        }
        if (arrayNombres[1].compareTo(arrayNombres[3]) > 0) {
            temp = arrayNombres[1];
            arrayNombres[1] = arrayNombres[3];
            arrayNombres[3] = temp;
        }

        if (arrayNombres[2].compareTo(arrayNombres[3]) > 0) {
            temp = arrayNombres[2];
            arrayNombres[2] = arrayNombres[3];
            arrayNombres[3] = temp;
        }

        System.out.println("El nuevo orden es:" + arrayNombres[0] + " , " + arrayNombres[1] + " , " + arrayNombres[2] + " , " + arrayNombres[3]);

        scanner.close();
    }
}