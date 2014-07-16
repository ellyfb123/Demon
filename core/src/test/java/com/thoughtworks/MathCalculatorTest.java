package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fxie on 7/10/14.
 */
public class MathCalculatorTest {
    @Test
    public void shouldAdd11And23ThenGet34() {
        MathCalculator calculator = new MathCalculator();
        String result = calculator.add("11", "23");
        assertEquals("34", result);
    }

    @Test
    public void shouldAddAAnd23ThenGetError() {
        MathCalculator calculator = new MathCalculator();
        String result = calculator.add("A", "23");
        assertEquals("ERROR", result);
    }
    @Test
    public void shouldAdd100And23ThenGetError() {
        MathCalculator calculator = new MathCalculator();
        String result = calculator.add("100", "23");
        assertEquals("ERROR", result);
    }
}

