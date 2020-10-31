package com.kodilla.abstracts.homework;

public abstract class Job {

    private int salary = 0;

    public Job (int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public abstract void getResponsibilities();
}
