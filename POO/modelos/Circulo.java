package modelos;

public class Circulo {
private Integer radio;

public Circulo(){

}

public Circulo(Integer radio) {
this.radio = radio;
}
public Integer getRadio() {
return radio;
}

public void setRadio(Integer radio) {
this.radio = radio;
}

public double area() {
double ar = Math.PI * radio*radio;
return ar;
}

public double perimetro() {
double pe= 2* Math.PI * radio;
return pe;
}

public void imprimirArea() {
System.out.println("El area es de: " + this.area());
}
public void imprimirPerimetro() {
System.out.println("El area es de: " + this.perimetro());
}

}