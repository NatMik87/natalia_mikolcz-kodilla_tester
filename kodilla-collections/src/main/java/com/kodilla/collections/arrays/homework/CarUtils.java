package com.kodilla.collections.arrays.homework;


import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Seat;
import com.kodilla.collections.interfaces.homework.Skoda;

public class CarUtils {
    public static String describeCar(Car car) {
        System.out.println(" __________________");
        System.out.println("Name of car is: " + getCarName(car));
        System.out.println("Car speed is: " + car.getSpeed());
        car.increaseSpeed();
        System.out.println("Increase speed car: " + car.getSpeed());
        car.decreaseSpeed();
        System.out.println("Decrease speed car: " + car.getSpeed());
        return null;
    }

    private static String getCarName(Car car) {
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Seat)
            return "Seat";
        else if (car instanceof Skoda)
            return "Skoda";
        else
            return "Unknown car name";
    }
}
