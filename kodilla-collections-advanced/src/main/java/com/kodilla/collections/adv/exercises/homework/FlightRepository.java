package com.kodilla.collections.adv.exercises.homework;

import com.kodilla.collections.adv.exercises.homework.Flight;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightTable() {
        List<Flight> fligths = new ArrayList<>();
        fligths.add(new Flight("Warszawa", "Singapur"));
        fligths.add(new Flight("Madryt", "Bogota"));
        fligths.add(new Flight("Amsterdam", "Chicago"));
        fligths.add(new Flight("Warszawa", "Ateny"));
        return fligths;
    }
}




