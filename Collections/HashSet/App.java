import clases.Invitado;
import clases.RegistroDeInvitados;
import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("""
                REGISTRO DE INVITADOS
                ---------------------
                """);

        menuOpciones();

        sc.close();
    }

    public static void menuOpciones() {
        System.out.println("""
                1. Agregar invitado.
                2. Eliminar invitado.
                3. Mostrar lista de invitados.
                4. Salir.
                """);

        int opcionIngresada;

        do {
            System.out.print("Ingrese una opción (número entre 1 y 4): ");
            opcionIngresada = Integer.parseInt(sc.nextLine());

            System.out.println();

            switch (opcionIngresada) {
                case 1 -> {
                    System.out.print("Ingrese el nombre del invitado: ");
                    String nombreInvitado = sc.nextLine();

                    System.out.println();

                    Invitado nuevoInvitado = new Invitado(nombreInvitado);

                    if (RegistroDeInvitados.agregarInvitado(nuevoInvitado)) {
                        System.out.println("Invitado creado y registrado.");
                    } else {
                        System.out.println("Invitado no pudo ser creado y registrado.\n");
                    }
                }
                case 2 -> {
                    System.out.println("Invitados Registrados:");
                    RegistroDeInvitados.mostrarInvitados();

                    System.out.println();

                    System.out.print("¿Qué invitado deseas eliminar?: ");
                    String nombreIngresado = sc.nextLine().toLowerCase();

                    System.out.println();

                    Invitado invitadoEncontrado = null;

                    for (Invitado invitado : RegistroDeInvitados.registroInvitados) {
                        if (invitado.nombre.equals(nombreIngresado)) {
                            invitadoEncontrado = invitado;
                            break;
                        }
                    }

                    if (invitadoEncontrado != null) {
                        RegistroDeInvitados.eliminarInvitado(invitadoEncontrado);
                        System.out.println("El invitado ingresado fue eliminado.\n");
                    } else {
                        System.out.println("El invitado ingresado no fue encontrado.\n");
                    }
                }
                case 3 -> {
                    System.out.println("Invitados Registrados:");
                    RegistroDeInvitados.mostrarInvitados();
                }
                case 4 -> System.out.println("Saliendo...");
                default -> System.out.println("Ingrese por favor una opción válida.");
            }
        } while (opcionIngresada != 4);
    }
}