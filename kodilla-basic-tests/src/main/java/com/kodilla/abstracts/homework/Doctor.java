package com.kodilla.abstracts.homework;

public class Doctor extends Job{
    public Doctor() {
        super(15000);
    }


    @Override
    public void getResponsibilities() {
        System.out.println("Treatment and diagnosis of patients");}
}
