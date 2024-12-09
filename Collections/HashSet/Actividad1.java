import java.util.HashMap;
import java.util.Scanner;

public class Actividad1 {

    public static void main(String[] args) {
        HashMap<Integer,String> mapa = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int codigoPostal;
        String ciudad;
        for(int i=0; i<2; i++){
            System.out.print("Ingrese el codigo postal: ");
            codigoPostal = sc.nextInt();
            sc.nextLine();
            System.out.print("Ingrese el nombre de la ciudad: ");
            ciudad = sc.nextLine();
            mapa.put(codigoPostal, ciudad);
        }

        System.out.println("--------------------------");
        System.out.print("Ingrese el codigo postal a buscar: ");
        codigoPostal = sc.nextInt();
        System.out.println(mapa.get(codigoPostal));
        System.out.println("--------------------------");

        System.out.print("Ingrese el codigo postal a eliminar: ");
        codigoPostal = sc.nextInt();
        if(mapa.remove(codigoPostal)!=null){
            System.out.println("Exito");
        }else{
            System.out.println("Ciudad no encontrada");
        }
       
        System.out.println("--------------------------");
        System.out.print("Ingrese el codigo postal a modificar: ");
        codigoPostal = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese el nuevo nombre de la ciudad: ");
        ciudad = sc.nextLine();
        mapa.replace(codigoPostal, ciudad);  
        
        System.out.println("--------------------------");
        System.out.println(mapa);
        
        sc.close();
    }
}