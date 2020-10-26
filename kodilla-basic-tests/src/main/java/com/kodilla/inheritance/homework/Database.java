package com.kodilla.inheritance.homework;

    public class Database extends OperatingSystem {
        public void update(){
            java.lang.System.out.println("Data date was updated in: ");
        }

        @Override
        public void turnOff() {
            super.turnOff();
        }

        @Override
        public void turnOn() {
            super.turnOn();
        }

        public Database(int year){
            super(year);
        }
    }
