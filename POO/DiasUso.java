import java.util.Arrays;
public class DiasUso {

    public static void main(String[] args) {
        DiaSemana[] dias = new DiaSemana[10];
        for (int i = 0; i < 10; i++) {
            int diaRandom = (int) (Math.random() * 7);
            dias[i] = DiaSemana.values()[diaRandom];
        }
        System.out.println(Arrays.toString(dias));
        for (DiaSemana d : dias) {
            imprimirDiaLaboral(d);
        }
    }

    public static void imprimirDiaLaboral(DiaSemana dia) {
        if (dia.esDiaLaboral()) {
            System.out.println("Es dia laboral");
        } else {
            System.out.println("No es día laboral");
        };
    }
}
