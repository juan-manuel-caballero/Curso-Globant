import java.util.*;
import modelos.Empleado;

public class Application {

    public static void main(String[] args) {
        int op;
        Scanner sc = new Scanner(System.in);
        Empleado empleado = new Empleado();
        Empleado empleado1 = new Empleado("Pepe", 26, "Comercio", 4000);
        Empleado empleado2 = new Empleado("Juan", 28, "Compras", 2000);
        Empleado empleado3 = new Empleado("Juan", 28, "Marketing", 2000);
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(empleado1);
        listaEmpleados.add(empleado2);
        listaEmpleados.add(empleado3);
        String dato = "";
        System.out.println("Ingese una opcion 1.Filtrar por nombre 2.Filtrar por depto.");
        do {
            op = sc.nextInt();
            switch (op) {
                case 1:
                    dato = "Juan";
                    listaEmpleados = empleado.filtrarEmpleados("nombre", listaEmpleados, dato);
                    empleado.mostrarEmpleado(listaEmpleados);
                    break;
                case 2:
                    dato = "Compras";
                    listaEmpleados = empleado.filtrarEmpleados("departamento", listaEmpleados, dato);
                    empleado.mostrarEmpleado(listaEmpleados);
                    break;
                case 3:

                    break;
            }

        } while (op != 0);
    }
}
