package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Seat;
import com.kodilla.collections.interfaces.homework.Skoda;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car skoda = new Skoda(100, 30,20);
        cars.add(skoda);
        cars.add(new Ford(110, 40, 30));
        cars.add(new Seat(130,60,60));

        cars.remove(1);
        cars.remove(skoda);

        System.out.println(cars.size());

        for (Car car :cars) {
            CarUtils.describeCar(car);
        }
    }
}
