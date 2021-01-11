package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

class GamblingMachineTest {

    GamblingMachine validator = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingNumbers.csv", numLinesToSkip = 0)
    public void ifNumberIsLessThanSix(int one, int two, int three , int four, int five) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(one);
        numbers.add(two);
        numbers.add(three);
        numbers.add(four);
        numbers.add(five);
        Assertions.assertThrows(InvalidNumberException.class, ()-> validator.howManyWins(numbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/moreThanSix.csv", numLinesToSkip = 0)
    public void ifNumbersIsMoreThanSix(int one, int two, int three , int four, int five, int six, int seven) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(one);
        numbers.add(two);
        numbers.add(three);
        numbers.add(four);
        numbers.add(five);
        numbers.add(six);
        numbers.add(seven);
        Assertions.assertThrows(InvalidNumberException.class, ()-> validator.howManyWins(numbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/numberLowerThanOne.csv")
    public void ifNumberIsLowerThanOne(int one, int two, int three , int four, int five, int six) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(one);
        numbers.add(two);
        numbers.add(three);
        numbers.add(four);
        numbers.add(five);
        numbers.add(six);
        Assertions.assertThrows(InvalidNumberException.class, ()-> validator.howManyWins(numbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/sixNumbers.csv")
    public void revertTrueIfSizeOfNumbersIdValidate(int one, int two, int three , int four, int five, int six) throws InvalidNumberException{
        Set<Integer> numbers = new HashSet<>();
        numbers.add(one);
        numbers.add(two);
        numbers.add(three);
        numbers.add(four);
        numbers.add(five);
        numbers.add(six);
        Assertions.assertEquals(6, numbers.size());


    }

}

