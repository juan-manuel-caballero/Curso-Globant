import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class testApp {

    @Test
    void testMain() {

    }

    @Test
    void testNumeroAleatorio() {
        int resultado = App.numeroAleatorio();
        assertTrue(1 <= resultado && resultado <= 355);
    }
}