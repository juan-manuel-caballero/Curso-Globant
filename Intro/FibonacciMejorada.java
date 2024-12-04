import java.util.Scanner;

public class FibonacciMejorada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = 0;
        int B = 1;
        int C = 0;
        int D = 0;
        int F = 0;
        System.out.println("Ingrese la posicion para buscar");
        int G = sc.nextInt();
        if (G != 0 && G != 1) {
            while (F <= G - 2) {
                C = A;
                D = B;
                A = B;
                B = C + D;
                F++;
            }
            System.out.println((F + 1) + " : " + (C + D));
        }
        if (G == 0) {
            System.out.println("0" + " : " + "0"); 
        }else if (G == 1) {
            System.out.println("1" + " : " + "1");
        }
        sc.close();
    }
}