package modelos;

public class Animal {
    protected String nombre;
    protected int edad;

    public Animal(){

    }
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void comer(){
        System.out.println("Estoy comiendo");
    }
    public void dormir(){
        System.out.println("Estoy durmiendo");
    }
}