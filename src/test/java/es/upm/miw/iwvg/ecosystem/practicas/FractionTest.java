package es.upm.miw.iwvg.ecosystem.practicas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {

    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(4, 2);
    }

    @Test
    void testFraction() {
        fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    void testFractionIntInt() {
        assertEquals(4, fraction.getNumerator());
        assertEquals(2, fraction.getDenominator());
    }
    @Test
    void testDecimal() {
        assertEquals(2, fraction.decimal(), 10e-5);
    }
    @Test
    void testIsPropia() {
        assertFalse(fraction.isPropia());
    }
    @Test
    void testIsImpropia() {
        assertTrue(fraction.isImpropia());
    }
}
