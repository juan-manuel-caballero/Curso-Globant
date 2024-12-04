package POO.modelos;

public class Rectangulo extends Figuras implements Dibujable {

    private Integer ancho;
    private Integer alto;

    public static int contadorRectangulos = 0;

    public Rectangulo() {

    }

    public Rectangulo(Integer ancho, Integer alto) {
        this.ancho = ancho;
        this.alto = alto;
        contadorRectangulos++;
    }

    @Override
    public double calcularArea() {
        double area = (ancho * alto);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = ((ancho * 2) + (alto * 2));
        return perimetro;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectangulo ...");
        ancho = 10;
        alto = 5;
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                if (i == 0 || i == alto - 1 || j == 0 || j == ancho
                        - 1) {

                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public Integer area() {
        return ancho * alto;
    }

    public Integer perimetro() {
        return 2 * (ancho + alto);
    }

    public void imprimirArea() {
        System.out.println("El area es de: " + this.area());
    }

    public void imprimirPerimetro() {
        System.out.println("El Perimetro es de: " + this.perimetro());
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public static int getContadorRectangulos() {
        return contadorRectangulos;
    }

    public static void setContadorRectangulos(int contadorRectangulos) {
        Rectangulo.contadorRectangulos = contadorRectangulos;
    }

    public static int numTotal() {
        return contadorRectangulos;
    }
}
