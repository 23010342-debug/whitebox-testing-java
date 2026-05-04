import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Practice04Test {

    @Test
    void testRectangleArea() {
        assertEquals(12, Practice04.rectangleArea(3, 4));
    }

    @Test
    void testRectangleAreaException() {
        assertThrows(IllegalArgumentException.class,
                () -> Practice04.rectangleArea(-1, 4));
    }

    @Test
    void testIsPrime() {
        assertTrue(Practice04.isPrime(7));
        assertFalse(Practice04.isPrime(8));
        assertFalse(Practice04.isPrime(1));
    }
}
