package com.kodilla.parametrized_tests.homework;

public class InvalidNumberException extends Exception{
    public InvalidNumberException() {
        super("Wrong number provided");
    }
}
