package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int c = 0;
        int d = -2;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
        int subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult);
        int squareResult = calculator.square(a);
        assertEquals(25, squareResult);
        int squareResultC = calculator.square(c);
        assertEquals(0, squareResultC);
        int squareResultD = calculator.square(d);
        assertEquals(4, squareResultD);

    }
}
