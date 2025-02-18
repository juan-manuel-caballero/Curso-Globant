import java.util.Scanner;

public class AdivinaAleatorio {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int adivinado;
        do {
            System.out.println("Adivine el número entre 15 y 35. Presione 0 para salir: ");
            adivinado = Integer.parseInt(sc.nextLine());

            if(adivinado > numeroAleatorio()){
                System.out.println("El número es menor que " + adivinado);
            }
            else if(adivinado < numeroAleatorio()){
                System.out.println("El número es mayor que " + adivinado);
            }
            else{
                System.out.println("Adivinaste!");
            }
        } while (adivinado != 0);
        
    }

    public static int numeroAleatorio(){
        return (int) (Math.random()*(35-15+1)+15);
    }
}
