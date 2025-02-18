import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int ingreso = 0;
        do {
            System.out.println("Bienvenido al sistema de gestión de estancias");
            System.out.println("Por favor ingrese el número de la opción seleccionada:");
            System.out.println("""
                    1.- Buscar y listar aquellas familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años. 

                    2.- Buscar y listar las casas disponibles para el periodo comprendido entre el 1 de agosto de 2020 y el 31 de agosto de 2020 en Reino Unido. 

                    3.- Buscar y listar  todas aquellas familias cuya dirección de email sea Hotmail. 

                    4.- Consulta la BD para que te devuelva aquellas casas disponibles a partir de una fecha dada y un número de días específico. 

                    5.- Buscar y listar los datos de todos los clientes que en algún momento realizaron una estancia y la descripción de la casa donde la realizaron. 

                    6.- Buscar y listar todas las estancias que han sido reservadas por un cliente, mostrar el nombre, país y ciudad del cliente y además la información de la casa que reservó. La que reemplazaría a la anterior 

                    7.- Crear un método para incrementar el precio por día. El mismo debe recibir como parámetro el % de aumento. En esta ocasión, debido a la devaluación de la libra esterlina con respecto al euro se desea incrementar el precio por día en un 5% de todas las casas del Reino Unido. Mostrar los precios actualizados. 

                    8.- Obtener el número de casas que existen para cada uno de los países diferentes.

                    9.- Buscar y listar aquellas casas del Reino Unido de las que se ha dicho de ellas (comentarios) que están ‘limpias’. 

                    10.- Insertar nuevos datos en la tabla estancias verificando la disponibilidad de las fechas.

                    Ingrese '0' para salir del sistema.
                    """);
            ingreso = Integer.parseInt(sc.nextLine());

            
        } while (ingreso != 0);
    }
}
