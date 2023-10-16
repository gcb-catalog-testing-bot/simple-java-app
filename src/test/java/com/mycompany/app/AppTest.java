package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void testAppConstructor() {
        SpecialCalculator app1 = new SpecialCalculator();
        SpecialCalculator app2 = new SpecialCalculator();
    }

    @Test
    public void testAppMessage()
    {
        SpecialCalculator app = new SpecialCalculator();
        assertEquals(2, app.sum(1, 1));
    }
}
