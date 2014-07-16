package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fxie on 7/10/14.
 */
public class LinkCalculatorTest {
    @Test
    public void shouldLink11And23ThenGet1123() {
        LinkCalculator calculator = new LinkCalculator();
        String result = calculator.add("11", "23");
        assertEquals("1123", result);
    }

    @Test
    public void shouldLink100And23ThenGetError() {
        LinkCalculator calculator = new LinkCalculator();
        String result = calculator.add("100", "23");
        assertEquals("ERROR", result);
    }
    @Test
    public void shouldLinkAAnd23ThenGetError() {
        LinkCalculator calculator = new LinkCalculator();
        String result = calculator.add("A", "23");
        assertEquals("ERROR", result);
    }
}
