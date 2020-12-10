package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks(){
        List<Task> tasks = new ArrayList<>();
            tasks.add(new Task("Stream", LocalDate.of(9,12,2020), LocalDate.of(24,12,2020)));
            tasks.add(new Task("sql", LocalDate.of(20,12,2020), LocalDate.of(20,12,2020)));
        tasks.add(new Task("selenium", LocalDate.of(20,12,2020), LocalDate.of(19,12,2020)));
        return tasks;

    }
}
