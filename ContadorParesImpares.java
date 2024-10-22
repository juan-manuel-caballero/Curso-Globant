import java.util.Scanner;

 public class ContadorParesImpares {

    public static void main(String[] args) {
        try (Scanner myScanner = new Scanner(System.in)) {
            int contadorPar = 0;
            int ContadorImpar = 0;
            String respuesta;
            
            System.out.println("Contando números Pares e Impares");
            
            do {
                System.out.println("Ingrese un número:");
                int num = myScanner.nextInt();
                
                if (num % 2 == 0) {
                    contadorPar++;
                } else {
                    ContadorImpar++;
                }
                System.out.println("desea ingresar mas números? (si/no): ");
                respuesta = myScanner.next();
            } while (respuesta.equalsIgnoreCase("si"));
            
            System.out.println("Total número pares :" + contadorPar);
            System.out.println("Total números Impares: " + ContadorImpar);
        }
    }
}