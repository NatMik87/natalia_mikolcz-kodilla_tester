package com.kodilla.collections.arrays.homework;



import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Seat;
import com.kodilla.collections.interfaces.homework.Skoda;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for ( Car car : cars)
            CarUtils.describeCar(car);
    }

    private static Car drawCar() {
        Random random = new Random();
        int drawnCarKind = random.nextInt(3);
        int speed = random.nextInt() + 10 + 1;

        if (drawnCarKind == 0)
            return new Ford (speed , 5 , 5);
        else if (drawnCarKind == 1)
            return new Seat(speed, 20, 10);
        else
            return new Skoda(speed, 15, 30);
    }
}
