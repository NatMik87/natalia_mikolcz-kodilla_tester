package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<School, Principal> directory = new HashMap<>();
        Principal dylan = new Principal("Dylan", "Wells");
        Principal joanna = new Principal("Joanna", "Smith");
        Principal pablo = new Principal("Pablo", "Jackson");


        School elementary = new School(12, 15 ,16);
        School primary = new School(18 ,20, 17);
        School high = new School(25, 30, 24, 28);

        directory.put(high, dylan);
        directory.put(elementary, joanna);
        directory.put(primary, pablo);

        for (Map.Entry<School,Principal> principalEntry: directory.entrySet()) {
            System.out.println(School.class + " with the number of students: " +
                    principalEntry.getKey().getSum() + "  is managed by the headmaster: "
                            + principalEntry.getValue().getFirstname() +" " + principalEntry.getValue().getLastname());
        }
    }
}

//for (Map.Entry<Student, Grades> studentEntry : school.entrySet()) {
//            System.out.println(studentEntry.getKey().getFirstname()+ " , average: "
//                    + studentEntry.getValue().getAverage());
