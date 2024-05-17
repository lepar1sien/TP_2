import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
public class CalculatorTimeTests {
    private List<Integer> generateList(int size) {
        List<Integer> nums = new ArrayList<>(size);
        for (int i = 1; i <= size; i++) {
            nums.add(i);
        }
        return nums;
    }

    @Test
    public void main() {
        int[] sizes = {10, 100, 1000, 10000, 100000, 1000000};
        for (int size : sizes) {
            List<Integer> numbers = generateList(size);

            BigDecimal startTime = new BigDecimal(System.nanoTime());
            Calculator._min(numbers);
            BigDecimal endTime = new BigDecimal(System.nanoTime());
            System.out.println("Минимум на " + size + " числах: " + (endTime.subtract(startTime)) + " нс");

            startTime = new BigDecimal(System.nanoTime());
            Calculator._max(numbers);
            endTime = new BigDecimal(System.nanoTime());
            System.out.println("Максимум на " + size + " числах: " + (endTime.subtract(startTime)) + " нс");

            startTime = new BigDecimal(System.nanoTime());
            Calculator._sum(numbers);
            endTime = new BigDecimal(System.nanoTime());
            System.out.println("Сумма на " + size + " числах: " + (endTime.subtract(startTime)) + " нс");

            startTime = new BigDecimal(System.nanoTime());
            Calculator._mult(numbers);
            endTime = new BigDecimal(System.nanoTime());
            System.out.println("Произведение на " + size + " числах: " + (endTime.subtract(startTime)) + " нс\n");

            System.out.println("------------------------------------------------------------------------------");


        }
    }
}
