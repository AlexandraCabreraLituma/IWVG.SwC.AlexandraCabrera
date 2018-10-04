package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class FractionTest {

    private Fraction fraction;


    @BeforeEach
    void before() {
        //establecer los valores de prueba
        fraction = new Fraction(4, 2);

    }

    @Test
    void decimalTest() {
        assertEquals(2, fraction.decimal());
    }

    @Test
    void testIsPropia() {
        this.fraction = new Fraction(1, 3);
        assertEquals(true, this.fraction.isPropia());
    }

    @Test
    void testInvertir() {
        assertEquals(2, fraction.invertir().getNumerator());
        assertEquals(4, fraction.invertir().getDenominator());
    }
}
