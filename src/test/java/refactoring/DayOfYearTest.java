package refactoring;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Write your tests for the DayOfYear.dayOfYear method here. Write each test
 * case
 * in its own method annotated with @Test, for example:
 *
 * @Test
 *       void firstDayOfJanuaryIsDayOne() {
 *       assertEquals(1, DayOfYear.dayOfYear(1, 1, 2023));
 *       }
 */
public class DayOfYearTest {

    @Test
    void firstDayOfJanuaryIsDayOne() {
        assertEquals(1, DayOfYear.dayOfYear(1, 1, 2026));
    }

    @Test
    void lastDayOfDecemberIsDay365() {
        assertEquals(365, DayOfYear.dayOfYear(12, 31, 2026));
    }

    @Test
    void lastDayOfDecemberIsDay366() {
        assertEquals(366, DayOfYear.dayOfYear(12, 31, 2024));
    }

    @Test
    void firstDayOfMarchIsDay60() {
        assertEquals(60, DayOfYear.dayOfYear(3, 1, 2026));
    }

    @Test
    void firstDayOfMarchIsDay61() {
        assertEquals(61, DayOfYear.dayOfYear(3, 1, 2024));
    }

    @Test
    void february29DoesExist() {
        int result = DayOfYear.dayOfYear(2, 29, 2020);
        assertTrue(result == 60);
    }

    @Test
    void february29DoesNotExist() {
        assertThrows(IllegalArgumentException.class,
                () -> DayOfYear.dayOfYearFixed(2, 29, 2019));
    }
}