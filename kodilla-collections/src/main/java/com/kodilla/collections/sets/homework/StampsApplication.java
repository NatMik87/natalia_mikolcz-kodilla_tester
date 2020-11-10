package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("domestic",10, false));
        stamps.add(new Stamp("international",20,false));
        stamps.add(new Stamp("priority",30,true));
        stamps.add(new Stamp("priority",30,true));

        System.out.println(stamps.size());

        for (Stamp stamp: stamps) {
            System.out.println(stamp);
        }
    }
}
