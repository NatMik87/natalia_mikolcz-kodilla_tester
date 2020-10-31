package com.kodilla.abstracts.homework;

public class Person{
    String firstName;
    int age;


    public Person(String firstName, int age){
        this.firstName = firstName;
        this.age = age;
    }



    public static void main(String[] args) {
        Person anna = new Person("Anna", 26);
        Person carl = new Person("Carl", 38);
        Person tom = new Person("Tom", 42);

        Person[] person = {anna, carl, tom};

        Doctor doctor = new Doctor();
        System.out.println(anna.firstName + " age: " + anna.age + " is a doctor with salary: " + doctor.getSalary() + " Her responsibilities are: " );
        doctor.getResponsibilities();

        Developer developer = new Developer();
        System.out.println(carl.firstName + " age: " + carl.age + " is a developer with salary: " + developer.getSalary() + " His responsibilities are: " );
        developer.getResponsibilities();

        Hairdresser hairdresser = new Hairdresser();
        System.out.println(tom.firstName + " age: " + tom.age + " is a hairdresser with salary: " + hairdresser.getSalary() + " His responsibilities are: " );
        hairdresser.getResponsibilities();

    }



}
