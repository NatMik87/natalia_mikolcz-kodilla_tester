package com.kodilla.abstracts.homework;

public class Hairdresser extends Job{
    public Hairdresser() {
        super(5000);
    }

    @Override
    public void getResponsibilities(){
        System.out.println("Hair care and cutting");
    }
}
