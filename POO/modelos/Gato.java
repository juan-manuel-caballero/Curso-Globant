package modelos;

public class Gato extends Animal{
    
    private String raza;
    private String color;
    public Gato(){
        super();
        this.raza = "Naranja";
        this.color = "Naranja";
    }
    public Gato(String raza, String color) {
        this.raza = raza;
        this.color = color;
    }
    public Gato(String nombre, int edad, String raza, String color) {
        super(nombre, edad);
        this.raza = raza;
        this.color = color;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void maullar(){
        System.out.println("Miau");
    }

    @Override
    public void comer(){
        System.out.println("Estoy comiendo atún");
    }

    @Override
    public void dormir(){
        System.out.println("Estoy durmiendo en la cama");
    }
}
