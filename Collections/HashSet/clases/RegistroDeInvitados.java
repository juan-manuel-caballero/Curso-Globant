package clases;

import java.util.HashSet;

public class RegistroDeInvitados {
    public static HashSet<Invitado> registroInvitados = new HashSet<Invitado>();

    public static boolean agregarInvitado(Invitado nuevoInvitado) {
        return registroInvitados.add(nuevoInvitado);
    }

    public static boolean eliminarInvitado(Invitado invitadoEliminar) {
        return registroInvitados.remove(invitadoEliminar);
    }

    public static void mostrarInvitados() {
        for (Invitado invitado : registroInvitados) {
            System.out.println(invitado.toString());
        }
    }
}