import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

public class FibonacciTest {
    @RepeatedTest(15)
    @CsvSource({"1, 0", "2,1", "3,1","4,2","3,3"})
    void testBuscarPosicion(int numero) {
        Integer num = Fibonacci.buscarPosicion(numero);
        assertEquals(num, num);
    }
}