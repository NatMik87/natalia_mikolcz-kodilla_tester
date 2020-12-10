package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<Task> currentTasks = TaskRepository.getTasks()
                .stream()
                .filter(t -> t.getDeadline().isBefore(LocalDate.now()))
                .collect(Collectors.toList());
        System.out.println(currentTasks);


    }
}
