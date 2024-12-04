
import java.util.Arrays;
import java.util.Scanner;

public class MetodosMultiplicar {
    public static void main(String[] args) {
        
        int n = pedirNumero();
        imprimirTablaMultiplicar(n);
        }
        
        public static int pedirNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un nro");
        int n = sc.nextInt();
        sc.close();
        return n;
        }
        
        public static void imprimirTablaMultiplicar(int n) {
        int[] tabla = new int[10];
        
        for(int i = 0; i < tabla.length; i++){
        tabla[i] = n * (i + 1);
        }
        
        System.out.println(Arrays.toString(tabla));
        }
}