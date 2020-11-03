package com.kodilla.collections.arrays.homework;


import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Seat;
import com.kodilla.collections.interfaces.homework.Skoda;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println(" __________________");
        System.out.println("Name of car is: " + getCarName(car));
        System.out.println("Car speed is: " + car.getSpeed());
        System.out.println("Increase speed car: " + car.increaseSpeed());
        System.out.println("Decrease speed car: " + car.decreaseSpeed());
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
