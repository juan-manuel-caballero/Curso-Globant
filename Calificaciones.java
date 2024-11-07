import java.util.Scanner;

public class Calificaciones {

    public static void main(String[] args) {
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su calificación: ");

        int calificacion = sc.nextInt();
        switch(calificacion/10){
            case 0,1,2,3,4-> System.out.println("F");            
            case 5 -> System.out.println("E");
            case 6 -> System.out.println("D");
            case 7 -> System.out.println("C");
            case 8 -> System.out.println("B");
            case 9 -> System.out.println("A");
            case 10 -> System.out.println("A");
        }
        sc.close();
    }
}