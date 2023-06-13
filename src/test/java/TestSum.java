import org.hw.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSum {
    private SumCalculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new SumCalculator();
    }

    @Test
    public void testSumCalculatorWorksCorrect1() {
        Assertions.assertEquals(1, calculator.sum(1));

    }
    @Test
    public void testSumCalculatorWorksCorrect2() {

        Assertions.assertEquals(6, calculator.sum(3));

    }
    @Test
    public void testSumCalculatorWorksCorrect3() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.sum(0);
        });
    }
}