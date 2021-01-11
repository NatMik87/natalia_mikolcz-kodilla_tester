package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class WeightSources {

    static Stream<Arguments> provideWeightForTestingBmi(){
        return Stream.of(
                Arguments.of(170, 60, ""),
                Arguments.of(100, 180),
                Arguments.of(80, 175),
                Arguments.of(50, 168),
                Arguments.of(90, 155),
                Arguments.of(120, 190)
        );
    }
}
