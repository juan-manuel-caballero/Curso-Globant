package modelos;

public class Triangulo {
private Integer base;
private Integer altura;

public Triangulo(){

}
public Triangulo(Integer base, Integer altura) {
this.base = base;
this.altura = altura;
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

public Integer area(){
return (base*altura)/2;
}
public void imprimirArea() {
System.out.println("El area es de: " + this.area());
}

}