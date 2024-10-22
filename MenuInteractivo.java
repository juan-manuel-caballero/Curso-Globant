import java.util.Scanner;

public class MenuInteractivo {

    public static void main(String[] args) {
        try (Scanner myScanner = new Scanner(System.in)) {
            boolean condition = true;
            while (condition) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                
                System.out.println("Menu");
                System.out.println("1 - Comprar Producto");
                System.out.println("2 - Realizar devolucion");
                System.out.println("3 - Ver mis pedidos");
                System.out.println("4 - Preguntas frecuentes");
                System.out.println("5 - Salir");
                System.out.print("Selecciona una opcion: ");
                int opcion = myScanner.nextInt();
                
                switch (opcion) {
                    case 1 -> System.out.println("Opcion seleccionada <Comprar productos>");
                    case 2 -> System.out.println("Opcion seleccionada <Realizar devolucion>");
                    case 3 -> System.out.println("Opcion seleccionada <Ver mis pedidos>");
                    case 4 -> System.out.println("Opcion seleccionada <Preguntas frecuentes>");
                    case 5 -> {
                        System.out.println("Opcion seleccionada <Salir>");
                        condition = false;
                    }
                    default -> System.out.println("Opcion seleccionada <No Valida>");
                }
                myScanner.nextLine();
                System.out.println("Presione una tecla para continuar...");
                myScanner.nextLine();
            }
        }
    }
}