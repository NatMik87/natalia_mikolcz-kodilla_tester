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

        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed = this.speed + this.increaseSpeed;
    }

    @Override
    public void decreaseSpeed() {

        this.speed = this.speed - this.decreaseSpeed;
    }
}
