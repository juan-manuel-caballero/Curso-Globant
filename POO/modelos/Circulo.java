package POO.modelos;

public class Circulo extends Figuras implements Dibujable {

    private Integer radio;

    public Circulo() {

    }

    public Circulo(Integer radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double area = (Math.PI * radio * radio);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = (Math.PI * 2 * radio);
        return perimetro;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un circulo ...");
        radio = 5;
        for (int i = -radio; i <= radio; i++) {
            for (int j = -radio; j <= radio; j++) {
                if (i * i + j * j <= radio * radio) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public Integer getRadio() {
        return radio;
    }

    public void setRadio(Integer radio) {
        this.radio = radio;
    }

    public double area() {
        double ar = Math.PI * radio * radio;
        return ar;
    }

    public double perimetro() {
        double pe = 2 * Math.PI * radio;
        return pe;
    }

    public void imprimirArea() {
        System.out.println("El area es de: " + this.area());
    }

    public void imprimirPerimetro() {
        System.out.println("El area es de: " + this.perimetro());
    }

}
