package com.kodilla.collections.adv.exercises;

import com.kodilla.collections.adv.exercises.homework.Flight;
import com.kodilla.collections.adv.exercises.homework.FlightFinder;
import com.kodilla.collections.adv.exercises.homework.FlightRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightFinderTestSuite {

    @Test
    public void findDeparture(){
        //given
        FlightFinder flightFinder = new FlightFinder();
        Flight flight = new Flight("MAdryt", "Bogota");

        //when
        List<Flight> result = flightFinder.findFlightsFrom("Madryt");

        //then
       List<Flight> expectedList = new ArrayList<>();
       expectedList.contains(flight);
       assertEquals(expectedList, result);

    }

    @Test
    public void findArrival(){
        //given
        FlightFinder flightFinder = new FlightFinder();
        Flight flight = new Flight("Warszawa","Bogota");

        //when
        List<Flight> result = flightFinder.findFlightsTo("Singapur");

        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.contains(flight);
        assertEquals(expectedList, result);
    }
}
