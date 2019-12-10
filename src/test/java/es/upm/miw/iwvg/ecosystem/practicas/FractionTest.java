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
        fractionOperation = new Fraction(15,4);
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
    @Test
    void testSum(){
        Fraction fractionResult = fraction.sum(fractionOperation);
        assertEquals(46, fractionResult.getNumerator());
        assertEquals(8, fractionResult.getDenominator());
    }

    @Test
    void testSub(){
        Fraction fractionResult = fraction.sub(fractionOperation);
        assertEquals(-14, fractionResult.getNumerator());
        assertEquals(8, fractionResult.getDenominator());
    }

    @Test
    void testMultiply(){
        Fraction fractionResult = fraction.multiply(fractionOperation);
        assertEquals(60, fractionResult.getNumerator());
        assertEquals(8, fractionResult.getDenominator());
    }

    @Test
    void testDivide(){
        Fraction fractionResult = fraction.divide(fractionOperation);
        assertEquals(16, fractionResult.getNumerator());
        assertEquals(30, fractionResult.getDenominator());
    }

    @Test
    void testSimplify(){
        Fraction fractionResult = fraction.multiply(fractionOperation).simplify();
        assertEquals(15, fractionResult.getNumerator());
        assertEquals(2, fractionResult.getDenominator());
    }
}




