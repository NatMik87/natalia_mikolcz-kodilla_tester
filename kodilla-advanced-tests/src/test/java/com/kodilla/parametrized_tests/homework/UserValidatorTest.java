package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {
    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @CsvSource(value = {"anna", "Hero001", "007_JB", "Smith-Wells"})
    public void shouldReturnTrueIfNameValidate(String username) {
        assertTrue(validator.validateUsername(username));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnFalseIfNameIsEmpty(String username) {
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @CsvSource(value = {"@@@@" , "+.+", "  %%%  "})
    public void shouldReturnFalseIfNameNotValidate(String username) {
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @CsvSource(value = {"anna@op.pl", "hero_001@us.us", "james@007.gb", "smith-wells@suite.io"})
    public void shouldReturnTrueIfEmailValidate(String email) {
        assertTrue(validator.validateEmail(email));
    }

}