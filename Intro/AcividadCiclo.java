public class AcividadCiclo {
    public static void main(String[] args) {
        float[] numeros = {2,5,6,8,9,10,20,4,59,93,50,29,70,30,23,76,64,63,93,52};
        float suma = 0;

        for(int i = 0; i < numeros.length; i++){
            suma += numeros[i];
            numeros[i] = suma;
            System.out.println("La suma es: " + numeros[i]);
        }
        float promedio = suma / numeros.length;
        System.out.println("La suma total es: " + suma);
        System.out.println("El promedio es: " + promedio);
    }
}