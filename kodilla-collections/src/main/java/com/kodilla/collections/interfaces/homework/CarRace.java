package com.kodilla.collections.interfaces.homework;

import com.kodilla.collections.interfaces.Shape;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(110, 40 , 30);
        doRace(ford);

        Seat seat = new Seat(130, 60, 60);
        doRace(seat);

        Skoda skoda = new Skoda(100, 30, 20);
        doRace(skoda);
    }


    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}
