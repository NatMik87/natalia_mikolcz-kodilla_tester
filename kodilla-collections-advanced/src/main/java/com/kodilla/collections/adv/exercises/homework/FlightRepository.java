package com.kodilla.collections.adv.exercises.homework.DictionaryTestSuite;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static void main(String[] args) {
        List<Flight> fligths = new ArrayList<>();
        fligths.add(new Flight("Warszawa", "Singapur"));
        fligths.add(new Flight("Madryt", "Bogota"));
        fligths.add(new Flight("Amsterdam", "Chicago"));
        fligths.add(new Flight("Warszawa", "Ateny"));
    }

        public String getFlightsTable(String departure) {
            return departure ;
        }


}
