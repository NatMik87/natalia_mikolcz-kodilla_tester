package com.kodilla.abstracts.homework;

public class Sqare extends Shape {
    private double side = 0;

    public Sqare(double side) {this.side =side;}

    @Override
    public double getCircuit() {
        return 4 * side;
    }

    @Override
    public double getFieldArea() {
        return side * side;
    }
}
