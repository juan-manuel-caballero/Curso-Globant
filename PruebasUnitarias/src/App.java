public class App{ 

    public static void main(String[] args) {
        System.out.println(numeroAleatorio());
    }
    
    public static int numeroAleatorio(){
        return (int) ((Math.random()*(355))+1);
    }
}