package com.kodilla.abstracts.homework;

public class Developer extends Job{
    public Developer() {
        super(10000);
    }

    @Override
    public void getResponsibilities(){
        System.out.println("software development");
    }
}
