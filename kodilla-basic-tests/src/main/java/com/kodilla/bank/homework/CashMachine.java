package com.kodilla.bank.homework;

import java.util.Arrays;

public class CashMachine {

    private int [] transaction;
    private int size;

    public CashMachine(){
        this.size=0;
        this.transaction = new int[0];
    }

    public void add(int deposite) {
        this.size++;
        int[] depositeTab = new int[this.size];
        System.arraycopy(transaction, 0, depositeTab, 0, transaction.length);
        depositeTab[this.size -1] = deposite;
        this.transaction = depositeTab;
    }

    public void sub(int paycheck){
        this.size--;
        int[] paycheckTab = new int[this.size];
        System.arraycopy(transaction,0,paycheckTab,0,transaction.length);
        paycheckTab[this.size -1] = paycheck;
        this.transaction = paycheckTab;
    }



    public int[] getValues() {
        return transaction;
    }

    public int[] getTransaction() {
        return transaction;
    }


    public double getAverage() {
        if (this.transaction.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.transaction.length; i++) {
            sum += this.transaction[i];
        }
        return sum/this.transaction.length;
    }
}
