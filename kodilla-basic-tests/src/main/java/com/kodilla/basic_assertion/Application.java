package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int c = 0;
        int d = -2;
        int sumResult = calculator.sum(a, b);
        int subtractResult = calculator.subtract(a,b);
        int squareResult = calculator.square(a);
        int squareResultC = calculator.squareC(c);
        int squareResultD = calculator.squareD(d);

        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        }else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        boolean correct2 = ResultChecker.assertEquals(-3, subtractResult);
        if (correct2) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        }else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        boolean correct3 = ResultChecker.assertEquals(25, squareResult);
        if (correct3) {
            System.out.println("Metoda Square działa poprawnie dla liczb " + a);
        }else {
            System.out.println("Metoda Square nie działa poprawnie dla liczb " + a );
        }

        boolean correct4 = ResultChecker.assertEquals(0, squareResultC);
        if (correct4) {
            System.out.println("Metoda Square działa poprawnie dla liczb " + c);
        }else {
            System.out.println("Metoda Square nie działa poprawnie dla liczb " + c );
        }

        boolean correct5 = ResultChecker.assertEquals(4, squareResultD);
        if (correct5) {
            System.out.println("Metoda Square działa poprawnie dla liczb " + d);
        }else {
            System.out.println("Metoda Square nie działa poprawnie dla liczb " + d);
        }

    }
}
