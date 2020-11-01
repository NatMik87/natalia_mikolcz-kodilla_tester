package com.kodilla.bank.homework;

import java.util.Arrays;

public class CashMachine {

    private int [] values;
    private int size;

    public CashMachine(){
        this.size=0;
        this.values = new int[0];
    }

    public void add(int value) {
        this.size++;
        int[] depositeTab = new int[this.size];
        System.arraycopy(values, 0, depositeTab, 0, values.length);
        depositeTab[this.size -1] = value;
        this.values = depositeTab;
    }



    public int[] getValues() {
        return values;
    }

}
