//Escribe un programa en el que se cree una variable de tipo array que
//contenga seis elementos de tipo entero. El programa debe contar la cantidad
//de elementos pares presentes en el array y mostrar el resultado por consola 
//utilizando solo las herramientas aprendidas hasta el momento.

public class LimitesArray {
    public static void main(String[] args) {
        int[] num = new int[6];

        num[0] = (int) (Math.random()*((20)+1));
        num[1] = (int) (Math.random()*((20)+1));
        num[2] = (int) (Math.random()*((20)+1));
        num[3] = (int) (Math.random()*((20)+1));
        num[4] = (int) (Math.random()*((20)+1));
        num[5] = (int) (Math.random()*((20)+1));
        int pares = 0;

        if(num[0]%2 == 0){
            pares ++;
            System.out.println("El número " + num[0] + " es par.");
        }
        if(num[1]%2 == 0){
            pares ++;
            System.out.println("El número " + num[1] + " es par.");
        }
        if(num[2]%2 == 0){
            pares ++;
            System.out.println("El número " + num[2] + " es par.");
        }
        if(num[3]%2 == 0){
            pares ++;
            System.out.println("El número " + num[3] + " es par.");
        }
        if(num[4]%2 == 0){
            pares ++;
            System.out.println("El número " + num[4] + " es par.");
        }
        if(num[5]%2 == 0){
            pares ++;
            System.out.println("El número " + num[5] + " es par.");
        }

        System.out.println("El array tiene " + pares + " números pares.");

    }
}