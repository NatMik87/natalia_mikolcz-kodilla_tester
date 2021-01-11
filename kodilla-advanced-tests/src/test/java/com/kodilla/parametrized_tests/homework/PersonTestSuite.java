package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTestSuite {

    Person manipulator;

    @ParameterizedTest
    @MethodSource (value = "com.kodilla.parametrized_tests.homework.WeightSources#provideWeightForTestingBmi")
    public void shouldCalculateBMI(double height, double weight, double expected){
        Person manipulator = new Person(height, weight);
        assertEquals(expected, manipulator.getBMI());
    }

}