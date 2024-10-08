import org.example.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testSum() {
        Calculator calculation = new Calculator();
        int sum = calculation.sum(2, 5);
        int testSum = 7;
        assertEquals(sum, testSum);
    }
}
