package com.kodilla.collections.interfaces.homework;

public class Skoda implements Car{
    private int speed;
    private int increaseSpeed;
    private int decreaseSpeed;

    public Skoda(int speed, int increaseSpeed, int decreaseSpeed) {
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

    @Override
    public String toString() {
        return "Skoda{" +
                "speed=" + speed +
                ", increaseSpeed=" + increaseSpeed +
                ", decreaseSpeed=" + decreaseSpeed +
                '}';
    }
}
