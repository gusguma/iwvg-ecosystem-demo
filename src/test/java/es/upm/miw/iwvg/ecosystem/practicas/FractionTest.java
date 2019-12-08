package es.upm.miw.iwvg.ecosystem.practicas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {

    private Fraction fraction;
    private Fraction fractionOperation;

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

    @BeforeEach
    void beforeOperation() {
        fractionOperation = new Fraction(15,4);
    }

    @Test
    void testIsEquivalent() {
        assertEquals(false, fraction.isEquivalent(fractionOperation));
    }

    @Test
    void testIsMajor() {
        assertEquals(false, fraction.isMajor(fractionOperation));
    }

    @Test
    void testIsMinor() {
         assertEquals(true, fraction.isMinor(fractionOperation));
    }
}
