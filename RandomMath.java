import java.util.Scanner;

public class RandomMath {

    public static void main(String[] args) {
        double num1;
        int min;
        int max;
        int opc;
        Scanner myScan = new Scanner(System.in);

        System.out.println("Coloque el máximo del rango de números");
        max = myScan.nextInt();
        System.out.println("Coloque el mínimo del rango de números");
        min = myScan.nextInt();

        num1 = Math.random() * (max - min + 1) + min;

        System.out.println("Su número es: " + num1);

        System.out.println("Redondear para arriba(1) - para abajo(2)");
        opc = myScan.nextInt();
        if (opc == 1) {
            System.out.println(Math.ceil(num1));
        } else {
            System.out.println(Math.floor(num1));
        }
    }
}