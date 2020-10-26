package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

public OperatingSystem(int year){
    this.year = year;
}

    public void turnOn() {
        java.lang.System.out.println("System is turn on");
    }

    public void turnOff() {
        java.lang.System.out.println("System is off");
    }

    public int getYear() {
        return year;
    }

    public void displayYear(){
        java.lang.System.out.println("The year of release of the system is " + year);
    }

}


