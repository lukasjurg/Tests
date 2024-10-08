import org.example.Counter;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CounterTest {

    private Counter counter;

    @BeforeEach
    public void setup() {
        counter = new Counter();
    }

    @Test
    public void testDigitAverage() {
        assertEquals(2.5,   counter.digitAverage(1234));
        assertEquals(1.0, counter.digitAverage(1111));
    }
}
