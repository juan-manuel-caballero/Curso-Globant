package Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        ArrayList<String> city_names = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        String city_name;
        int condition   ;
        do {
            System.out.println("ingresa el nombre de la ciudad");
            city_name = sc.nextLine();
            city_names.add(city_name);
            System.out.println("1: agregar ciudad, 2: salir");
            condition = Integer.valueOf(sc.nextLine()); // o parseInt
        } while (condition == 1);

        sc.close();

        System.out.println(city_names.get(0));
        System.out.println(city_names);
    }
}
