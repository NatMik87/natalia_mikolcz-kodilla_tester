package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class WeightSources {

    static Stream<Arguments> provideWeightForTestingBmi(){
        return Stream.of(
                Arguments.of(170, 45, "Very severely underweight"),
                Arguments.of(180, 55, "Severely underweight"),
                Arguments.of(165, 49, "Underweight"),
                Arguments.of(168, 57, "Normal (healthy weight)"),
                Arguments.of(170, 80, "Overweight"),
                Arguments.of(170, 100, "Obese Class I (Moderately obese)"),
                Arguments.of(170, 110, "Obese Class II (Severely obese)"),
                Arguments.of(170, 120, "Obese Class III (Very severely obese)"),
                Arguments.of(170, 140, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(170, 200, "Obese Class V (Super Obese)"),
                Arguments.of(170, 350, "Obese Class VI (Hyper Obese)")
        );
    }
}
