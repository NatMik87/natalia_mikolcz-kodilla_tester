package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Circle circle = new Circle(5);

        double circuit = circle.getCircuit();
        double fieldArea = circle.getFieldArea();

        System.out.println("Circuit of circle has value: "+ circuit + " and field area has value: " + fieldArea );

        Sqare sqare = new Sqare(5);

        double squareCircuit = sqare.getCircuit();
        double squareFieldArea = sqare.getFieldArea();

        System.out.println("Circuit of square has value: " + squareCircuit + " and square field area has value: " + squareFieldArea);

        Rectangle rectangle = new Rectangle(4, 10);

        double rectangleCircuit = rectangle.getCircuit();
        double rectangleFieldArea =rectangle.getFieldArea();

        System.out.println("Circuit of rectangle has value: " + rectangleCircuit + " and rectangle field area has value: " + rectangleFieldArea);
    }
}
