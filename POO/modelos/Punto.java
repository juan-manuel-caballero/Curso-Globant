package POO.modelos;

public class Punto {
    private int x,y;

    public Punto(){
        setX(0);
        setY(0);
    }

    public Punto(int x, int y){
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distanciaDesdeOrigen(){
        double distancia = (Math.sqrt((Math.pow(this.x, 2))+(Math.pow(this.y,2))));
        return distancia;
    }

    public double distanciaEntrePuntos(int x, int y){
        double distancia = (Math.sqrt((Math.pow(this.x - x, 2))+(Math.pow(this.y - y,2))));
        return distancia;
    }

    public boolean estanAlineados(int x2, int y2, int x3, int y3){
        boolean alineados = false;
        if ((x2-this.x) * (y3-this.y) == (y2-this.y) * (x3-this.x)) {
            alineados = true;
        }
        return alineados;
    }
}