import org.example.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {
    private SumCalculator calculator;

    @BeforeEach
    public void beforeEach() {
        calculator = new SumCalculator();
    }

    @Test
    public void testSum1() {
        int actual = calculator.sum(1);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSum3() {
        Assertions.assertEquals(6, calculator.sum(3));
    }

    @Test
    public void testSum0() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
           calculator.sum(0);
        });
    }
}
