import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigInteger;

public class CalculatorTest {

    @Test
    public void testMin() {
        List<Integer> numbers = Arrays.asList(1, 2, 6, 3);
        assertEquals(1, Calculator._min(numbers));

        List<Integer> numbers2 = Arrays.asList(-7, 8, 6, 3);
        assertEquals(-7, Calculator._min(numbers2));
    }

    @Test
    public void testMax() {
        List<Integer> numbers = Arrays.asList(1, 2, 6, 3);
        assertEquals(6, Calculator._max(numbers));

        List<Integer> numbers2 = Arrays.asList(-7, 8, 6, 3);
        assertEquals(8, Calculator._max(numbers2));
    }

    @Test
    public void testSum() {
        List<Integer> numbers = Arrays.asList(1, 2, 6, 3);
        assertEquals(new BigInteger("12"), Calculator._sum(numbers));

        List<Integer> numbers2 = Arrays.asList(-7, 8, 6, 3);
        assertEquals(new BigInteger("10"), Calculator._sum(numbers2));
    }

    @Test
    public void testMult() {
        List<Integer> numbers = Arrays.asList(1, 2, 6, 3);
        assertEquals(new BigInteger("36"), Calculator._mult(numbers));

        List<Integer> numbers2 = Arrays.asList(-7, 8, 6, 3);
        assertEquals(new BigInteger("-1008"), Calculator._mult(numbers2));
    }
}