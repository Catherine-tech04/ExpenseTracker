import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FraudTest {

    @Test
    void testAddition() {
        int result = 1 + 1;
        assertEquals(2, result);
    }

    @Test
    void testTrueCondition() {
        assertTrue(5 > 3);
    }

    @Test
    void testString() {
        String name = "fraud";
        assertEquals("fraud", name);
    }
}