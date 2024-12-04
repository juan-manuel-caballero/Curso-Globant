package POO.modelos;
public class Persona{
    public String nombre;
    public int edad;

    public Persona() {
    }

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public void imprimirNombreYEdad(){
        System.out.println("Nombre: " + nombre + " y edad: "+ edad);
    }
}