package com.kodilla.stream.optional.homework;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Adam Kowalski", new Teacher("Kamil Woźny")));
        studentList.add(new Student("Maria Sandomierska", new Teacher("Paweł Nowak")));
        studentList.add(new Student("Adrian Bolt", new Teacher("Anna Malinowska")));
        studentList.add(new Student("Maria Mak", null));
        studentList.add(new Student("Barbara Materka", new Teacher("Jacek Kowalczyk")));
        studentList.add(new Student("Bartosz Zebrowski", null));

        for (int s = 0; s< studentList.size(); s++){
            Student student = studentList.get(s);
            if (student.getTeacher() == null)
                System.out.println("For student name: " + student.getName()+ " " + "teacher in undefined");
            else
                System.out.println("For student name: " + student.getName()+ " assigned teacher is: " + student.getTeacher());
        }
    }
}
