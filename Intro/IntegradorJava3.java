import java.util.Scanner;

public class IntegradorJava3 {
    public static void main(String[] args) {
        
        int longContra;
        boolean mayus = false;
        boolean minus = false;
        boolean digito = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, ingrese la longitud de la contraseña: ");
        longContra = sc.nextInt();
        sc.close();
        char contra[] = new char[longContra];
        double valor;

        while((mayus ==false) || (minus == false) || (digito == false)){ 
            for(int i = 0; i < contra.length; i++){
                do{
                    valor = Math.floor(Math.random() * (123 - 0 + 1) + 1);
                } while (!((valor > 47 && valor < 58) 
                || (valor > 64 && valor < 90) 
                || (valor > 96 && valor < 122)));
            contra[i] = (char) valor;
            if(Character.isUpperCase(contra[i])){
                mayus = true;
            }
            if(Character.isLowerCase(contra[i])){
                minus = true;
            }        
            if(Character.isDigit(contra[i])){
                digito = true;
            }
            }
    }
    
    String password = "";
    for(char letra: contra){
        password = password + letra;
    }
    System.out.println("La contraseña es: " + password);
}
}