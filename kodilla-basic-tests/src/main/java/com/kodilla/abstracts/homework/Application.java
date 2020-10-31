package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Circle circle = new Circle(5);

        double circuit = circle.getCircuit();

        double fieldArea = circle.getFieldArea();


        System.out.println("Circuit has value: "+ circuit + " and field area has value: " + fieldArea );
    }
}
