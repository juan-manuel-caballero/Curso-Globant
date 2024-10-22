import java.util.Scanner;

public class Condicionales_Switch {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("Ingrese un número del 1 al 7:");
        int num = myScan.nextInt();
        myScan.close();
        
        String dia = switch (num) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sabado";
            case 7 -> "Domingo";
            default -> "Opción no valida";
        };
        System.out.println(dia);

    }
}