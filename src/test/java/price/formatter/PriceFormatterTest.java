package price.formatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Write your tests for the PriceFormatter here. See the specification of the
 * PriceFormatter and formatPrice method in the PriceFormatter class and the
 * readme file.
 */
public class PriceFormatterTest {
    PriceFormatter formatter = new PriceFormatter();

    @Test
    void decimalTest() {
        String formatted = formatter.formatPrice(3.14159);
        assertEquals("3,14 €", formatted);
    }

    @Test
    void spaceSeparatorTest() {
        String formatted = formatter.formatPrice(123456.78);
        assertEquals("123 456,78 €", formatted);
    }

    @Test
    void euroSignTest() {
        String formatted = formatter.formatPrice(123);
        assertEquals("123 €", formatted);
    }

    @Test
    void fractionDigitsTest() {
        String formatted = formatter.formatPrice(6.7);
        assertEquals("6,70 €", formatted);
    }

    @Test
    void fractionRoundingTest() {
        String formatted = formatter.formatPrice(4.567);
        assertEquals("4,57 €", formatted);
    }
}