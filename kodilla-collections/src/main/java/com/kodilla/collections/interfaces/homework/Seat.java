package com.kodilla.collections.interfaces.homework;

public class Seat implements Car{
    private int speed;
    private int increaseSpeed;
    private int decreaseSpeed;

    public Seat(int speed, int increaseSpeed, int decreaseSpeed) {
        this.speed = speed;
        this.increaseSpeed = increaseSpeed;
        this.decreaseSpeed = decreaseSpeed;
    }

    @Override
    public int getSpeed() {
        return 3 *increaseSpeed() -  2 *decreaseSpeed();
    }

    @Override
    public int increaseSpeed() {
        return speed + increaseSpeed;
    }

    @Override
    public int decreaseSpeed() {
        return speed - decreaseSpeed;
    }
}
