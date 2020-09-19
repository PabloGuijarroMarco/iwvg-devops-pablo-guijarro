package es.upm.miw.iwvg_devops.rest.code;

import es.upm.miw.iwvg_devops.code.Fraction;
import es.upm.miw.iwvg_devops.code.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {
    Fraction fraction;

    @BeforeEach
    void execute(){
        fraction = new Fraction(3, 4);
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
