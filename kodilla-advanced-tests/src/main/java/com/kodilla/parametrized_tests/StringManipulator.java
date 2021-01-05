package com.kodilla.parametrized_tests;

import jdk.nashorn.internal.runtime.regexp.joni.constants.Arguments;

import java.util.stream.Stream;

public class StringManipulator {
    public String reverseWithLowerCase(String input) {
        StringBuilder builder = new StringBuilder(input);
        return builder.reverse().toString().toLowerCase();
    }

    public int getStringLengthWithoutSpaces(String input) {
        String value = input.replaceAll(" ", "");
        return value.length();
    }
    private static Stream<Arguments> provideStringsForTestingLength() {
        return Stream.of(
                Arguments.of("test", 4),
                Arguments.of("OtHEr ", 5),
                Arguments.of("E V e n t", 5),
                Arguments.of("null ", 4),
                Arguments.of("A", 1)
        );
    }

    public int countNumberOfCommas(String text) {
        int count = text.length() - text.replace(",", "").length();
        return count;
    }
}
