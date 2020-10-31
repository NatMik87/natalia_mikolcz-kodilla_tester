package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    int a = 5;
    int b = 8;
    int c = 0;
    int d = -2;

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int sumResult = calculator.sum(5, 8);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int subtractResult = calculator.subtract(5, 8);
        assertEquals(-3, subtractResult);
    }

    @Test
    public void testSquare() {
        Calculator calculator = new Calculator();
        int squareResult = calculator.square(5);
        assertEquals(25, squareResult);
        int squareResultC = calculator.square(0);
        assertEquals(0, squareResultC);
        int squareResultD = calculator.square(-2);
        assertEquals(4, squareResultD);
    }
}
