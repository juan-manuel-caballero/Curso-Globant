package POO.modelos;

public class Triangulo extends Figuras implements Dibujable {

    private Integer base;
    private Integer altura, lado1, lado2, lado3;

    public Triangulo() {

    }

    public Triangulo(Integer base, Integer altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double area = ((altura * base) / 2);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = (lado1 + lado2 + base);
        return perimetro;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un triangulo ...");
        if (esTrianguloValido(lado1, lado2, lado3)) {
            // Dibujamos el triángulo
            for (int i = 0; i < lado1; i++) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Los lados proporcionados no forman un triángulo válido.");

        }
    }

    public boolean esTrianguloValido(int lado1, int lado2, int lado3) {
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2)
                && (lado2 + lado3 > lado1);
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public Integer area() {
        return (base * altura) / 2;
    }

    public void imprimirArea() {
        System.out.println("El area es de: " + this.area());

    }

}
