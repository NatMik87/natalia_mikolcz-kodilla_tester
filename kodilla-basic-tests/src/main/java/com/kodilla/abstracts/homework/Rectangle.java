package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{

    private double sideA = 0;
    private double sideB = 0;

    public Rectangle(double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;

    }

    @Override
    public double getCircuit() {
        return 2* (sideA + sideB);
    }

    @Override
    public double getFieldArea() {
        return sideA* sideB;
    }
}
