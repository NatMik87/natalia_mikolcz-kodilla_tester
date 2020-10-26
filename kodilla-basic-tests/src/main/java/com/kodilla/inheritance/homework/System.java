package com.kodilla.inheritance.homework;

public class System {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1995);
        operatingSystem.turnOn();

        Database database = new Database(2003);
        database.displayYear();
    }
}
