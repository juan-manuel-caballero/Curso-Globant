public class MaximoArray {

    public static void main(String[] args) {
        int[] numeros = {2, 4, 65, 8, 7};

        int maximo = numeros[0];

        if (numeros[1] > maximo) {
            maximo = numeros[1];
        }
        if (numeros[2] > maximo) {
            maximo = numeros[2];
        }
        if (numeros[3] > maximo) {
            maximo = numeros[3];
        }
        if (numeros[4] > maximo) {
            maximo = numeros[4];
        }
        System.out.println("El número mayor es: " + maximo);
    }
}