package com.kodilla.abstracts.homework;

public class Circle extends Shape{

    private static double PI = 3.14;
    private double radius = 0;

    public Circle (double radius){
        this.radius = radius;
    }

    @Override
    public double getCircuit() {
        return 2 * PI * radius;
    }

    @Override
    public double getFieldArea() {
        return PI * radius * 2;
    }
}
