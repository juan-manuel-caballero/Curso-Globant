package POO.modelos;

public class Auto {

    String marca;
    String modelo;
    Integer anio;

    public Auto() {
        this("Desconocido", "Desconocido", 0);
        }

    public Auto(String marca, String modelo, Integer anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Auto(String marca) {
        this.marca = marca;
    }

    public void imprimirDatos() {
        if (marca != null) {
            System.out.println("Marca: " + marca);
        } else {
            System.out.println("Marca no especificada.");
        }

        if (modelo != null) {
            System.out.println("Modelo: " + modelo);
        } else {
            System.out.println("Modelo no especificado.");
        }

        if (anio != null) {
            System.out.println("Año: " + anio);
        } else {
            System.out.println("Año no especificado.");
        }
        System.out.println("------------------");
    }
}