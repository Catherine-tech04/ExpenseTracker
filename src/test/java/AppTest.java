import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testConstructor() {
        App expense = new App("Food", 200);

        assertEquals("Food", expense.getCategory());
        assertEquals(200, expense.getAmount());
    }

    @Test
    void testGetCategory() {
        App expense = new App("Travel", 500);

        assertEquals("Travel", expense.getCategory());
    }

    @Test
    void testGetAmount() {
        App expense = new App("Shopping", 1000);

        assertEquals(1000, expense.getAmount());
    }

    @Test
    void testDifferentValues() {
        App expense = new App("Bills", 300);

        assertNotEquals("Food", expense.getCategory());
        assertNotEquals(100, expense.getAmount());
    }
}