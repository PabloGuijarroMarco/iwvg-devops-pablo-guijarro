package es.upm.miw.iwvg_devops.rest.code;

import es.upm.miw.iwvg_devops.code.Fraction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {
    Fraction fraction;
    Fraction fraction2;

    @BeforeEach
    void execute() {
        fraction = new Fraction(3, 4);
        fraction2 = new Fraction(5, 4);
    }

    @Test
    void testGetNumerator() {
        assertEquals(3, fraction.getNumerator());
    }

    @Test
    void testSetNumerator() {
        fraction.setNumerator(4);
        assertEquals(4, fraction.getNumerator());
    }

    @Test
    void testGetDenominator() {
        assertEquals(4, fraction.getDenominator());
    }

    @Test
    void testSetDenominator() {
        fraction.setDenominator(5);
        assertEquals(5, fraction.getDenominator());
    }

    @Test
    void testDecimal() {
        assertEquals(0.75, fraction.decimal());
    }

    @Test
    void testIsProper() {
        assertEquals(true, fraction.isProper());
    }

    @Test
    void testIsImproper() {
        assertEquals(false, fraction.isImproper());
    }

    @Test
    void testIsEquivalent() {
        assertEquals(false, fraction.isEquivalent(fraction, fraction2));
    }

    @Test
    void testAdd() {
        assertEquals(2, fraction.add(fraction, fraction2).decimal());
    }

    @Test
    void testMultiply() {
        assertEquals(0.9375, fraction.multiply(fraction, fraction2).decimal());
    }

    @Test
    void testDivide() {
        assertEquals(0.6, fraction.divide(fraction, fraction2).decimal());
    }

    @Test
    void testToString() {
        assertEquals("Fraction{" +
                        "numerator=" + 3 +
                        ", denominator=" + 4 +
                        '}',
                "Fraction{" +
                        "numerator=" + fraction.getNumerator() +
                        ", denominator=" + fraction.getDenominator() +
                        '}');
    }
}
