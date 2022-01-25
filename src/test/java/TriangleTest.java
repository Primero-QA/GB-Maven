import lesson4.Area;
import lesson4.NonPositiveException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {
    @Test
    @DisplayName("Проверка метода getArea с однозначными числами")
    void roundNumberTest() throws NonPositiveException {
        double result = Area.getArea(3,4,5);
        assertEquals(6.0, result, 0.1);
    }

    @Test
    @DisplayName("Проверка метода getArea с двузначными числами")
    void roundNumberTest2() throws NonPositiveException {
        double result = Area.getArea(61,55,43);
        assertEquals(1146.82, result, 0.1);
    }

    @Test
    @DisplayName("Проверка метода getArea с негативными числами")
    void negativeNumberTest() {
        assertThrows(Exception.class, () -> {
            double result = Area.getArea(-1,-5,-3);
        });
    }
}

