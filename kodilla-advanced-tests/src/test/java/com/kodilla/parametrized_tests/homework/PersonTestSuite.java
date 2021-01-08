package com.kodilla.parametrized_tests.homework;

import com.kodilla.parametrized_tests.StringSources;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {

    Person manipulator = new Person();

    @ParameterizedTest
    @MethodSource (value = "com.kodilla.parametrized_tests.homework.WeightSources#provideWeightForTestingBmi")
    public void shouldCalculateBMI(double input, double expected){
        assertEquals(expected, manipulator.getBMI());
    }

}