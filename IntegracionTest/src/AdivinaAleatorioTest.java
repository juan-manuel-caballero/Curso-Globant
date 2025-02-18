import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class AdivinaAleatorioTest {

    @RepeatedTest(100)
    void testNumeroAleatorio() {
        Integer aleatorio = AdivinaAleatorio.numeroAleatorio();
        assertTrue(aleatorio >= 15 && aleatorio <= 35);
    }
}