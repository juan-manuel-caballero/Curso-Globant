package POO;

import POO.modelos.Persona;

public class PersonaUso {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "José";
        persona1.edad = 30;
        persona1.imprimirNombreYEdad();
    }
}
