package modelos;
public class Rectangulo {
private Integer ancho;
private Integer alto;

public static int contadorRectangulos = 0;


public Rectangulo () {

}
public Rectangulo(Integer ancho, Integer alto) {
this.ancho = ancho;
this.alto = alto;
contadorRectangulos++;
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