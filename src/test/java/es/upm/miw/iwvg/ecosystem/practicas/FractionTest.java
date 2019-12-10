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
        fractionOperation.setDenominator(80);
        assertFalse(fraction.isPropia());
        assertTrue(fractionOperation.isPropia());
    }

    @Test
    void testIsImpropia() {
        fractionOperation.setDenominator(80);
        assertTrue(fraction.isImpropia());
        assertFalse(fractionOperation.isImpropia());
    }

    @Test
    void testIsEquivalent() {
        Fraction fractionTest = new Fraction(8,4);
        assertFalse(fraction.isEquivalent(fractionOperation));
        assertTrue(fraction.isEquivalent(fractionTest));
    }

    @Test
    void testIsMajor() {
        Fraction fractionTest = new Fraction(8,15);
        assertFalse(fraction.isMajor(fractionOperation));
        assertTrue(fraction.isMajor(fractionTest));
    }

    @Test
    void testIsMinor() {
        Fraction fractionTest = new Fraction(1,4);
        assertTrue(fraction.isMinor(fractionOperation));
        assertFalse(fraction.isMinor(fractionTest));
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




