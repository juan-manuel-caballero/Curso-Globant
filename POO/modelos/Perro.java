package modelos;

import java.util.Objects;

public class Perro extends Animal{
    private String color;
    private int peso;

    public Perro(){
        super();
    }

    public Perro(String color, int peso) {
        this.color = color;
        this.peso = peso;
    }

    public Perro(String nombre, int edad, String color, int peso) {
        super(nombre, edad);
        this.color = color;
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public void ladrar(){
        System.out.println("Guau");
    }

    @Override
    public void comer(){
        System.out.println("Estoy comiendo carne");
    }

    @Override
    public void dormir(){
        System.out.println("Estoy durmiendo en el sillón");
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.color);
        hash = 97 * hash + this.peso;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Perro other = (Perro) obj;
        if (this.peso != other.peso) {
            return false;
        }
        return Objects.equals(this.color, other.color);
    }
}