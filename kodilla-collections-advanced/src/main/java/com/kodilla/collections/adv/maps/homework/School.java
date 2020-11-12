package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {


    private List<Double> school = new ArrayList<>();



  public School(double... school ){
   for (double classes : school)
       this.school.add(classes);
    }

  public double getSum(){
        double sum =0;
        for (double classes : school)
            sum += classes;
        return sum;
    }

   // @Override
    public String toString() {
        return "School{" +
                "school=" + school +
                '}';
    }
}
