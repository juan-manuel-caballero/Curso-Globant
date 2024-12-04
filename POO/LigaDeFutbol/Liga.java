
import java.util.ArrayList;
import java.util.Scanner;

public class Liga {

    static public ArrayList<Equipo> equipos = new ArrayList<>();
    static public ArrayList<Jugador> jugadores = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Equipo equipoGlobal;
        int op;
        do {
            System.out.println("""
                Ingrese una opcion
                1.Crear jugador
                2.Crear equipo
                3.Asignar jugador
                4.Lista de jugadores
                5.Lista de equipos""");
            op = Integer.parseInt(sc.nextLine());
            switch (op) {
                case 1:
                    listaDeEquipos();
                    System.out.println("Ingrese el nombre del jugador");
                    String nombreJugador = sc.nextLine();
                    System.out.println("Ingrese el nombre del equipo");
                    String nombreEquipo2 = sc.nextLine();
                    equipoGlobal = buscarEquipo(nombreEquipo2);
                    if (equipoGlobal.getNombre() != null) {
                        Jugador jugador = new Jugador(nombreJugador);
                        jugador.setEquipo(equipoGlobal);
                        jugadores.add(jugador);
                    } else {
                        System.out.println("El equipo no existe");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del equipo");
                    String nombreEquipo = sc.nextLine();
                    Equipo equipo = new Equipo(nombreEquipo);
                    equipos.add(equipo);
                    break;
                case 3:
                    listaDeJugadores();
                    listaDeEquipos();
                    System.out.println("Ingrese el nombre del jugador");
                    String nombreBuscado = sc.nextLine();
                    Jugador jugador2 = new Jugador(nombreBuscado);
                    for (Jugador j : jugadores) {
                        if (j.getNombre().equals(nombreBuscado)) {
                            jugador2 = j;
                        }
                        System.out.println("Ingrese el nombre del equipo");
                        String equipoBuscado = sc.nextLine();
                        Equipo equipo2 = new Equipo(equipoBuscado);
                        for (Equipo e : equipos) {
                            if (e.getNombre().equals(equipoBuscado)) {
                                equipo2 = e;
                            }
                        }
                        jugador2.setEquipo(equipo2);
                        break;
                    }
            }
        } while (op != 0);
    }

    static Jugador buscarJugador(String nombre) {
        Jugador jugador = new Jugador(nombre);
        for (Jugador j : jugadores) {
            if (j.getNombre().equals(nombre)) {
                jugador = j;
            }
        }
        return jugador;
    }

    static Equipo buscarEquipo(String nombre) {
        Equipo equipo = new Equipo();
        for (Equipo e : equipos) {
            if (e.getNombre().equals(nombre)) {
                equipo = e;
            }
        }
        return equipo;
    }

    static void listaDeEquipos() {
        System.out.println("Lista de equipos");
        for (Equipo e : equipos) {
            System.out.println(e.getNombre());
        }
    }

    static void listaDeJugadores() {
        System.out.println("Lista de jugadores");
        for (Jugador j : jugadores) {
            if (j.getEquipo() != null) {
                System.out.println(j.getNombre() + " " + j.getEquipo().getNombre());
            } else {
                System.out.println(j.getNombre() + " " + "Sin equipo");
            }
        }
    }
}
