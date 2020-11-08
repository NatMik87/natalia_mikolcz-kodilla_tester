package com.kodilla.bank.homework;

public class Bank {
    private String bank;
    public CashMachine deposite;
    public CashMachine paycheck;

    public Bank (String cachMachinName) {
        this.bank = cachMachinName;
        this.deposite = new CashMachine();
        this.paycheck = new CashMachine();
    }

    public void addDepositeValue(int value) {
        if (value > 0 && value < 1000) {
            this.deposite.add(value);
        }
    }

    public void subPaycheckValue(int value) {
        if (value > 0 && value < 1000) {
            this.paycheck.sub(value);
        }
    }

    public double getDepositeAverage() {
        return this.deposite.getAverage();
    }

    public double getPaycheckAvarage() {
        return this.paycheck.getAverage();
    }

    public double getBalance() {
        double sum = this.deposite.getAverage() - this.paycheck.getAverage();
        return sum;
    }

    public static void main(String[] args) {
        CashMachine cashMachine = new CashMachine();
        Bank bank = new Bank("Pierwszy");
        bank.addDepositeValue(900);
        cashMachine.add(100);
        cashMachine.add(250);
        cashMachine.sub(-80);
        cashMachine.sub(-100);
        System.out.println("Bilans ze wszystkich bankomatów wynosi: " + bank.getBalance());
        System.out.println("Liczba transakcji zwiazana z wpłatą wynosi: " + cashMachine.getTransaction());
        System.out.println("Liczba transakcji zwiazana z wypłatą wynosi: " + cashMachine.getTransaction());
        System.out.println("Średnia wartość wypłat wynosi: " + bank.getPaycheckAvarage());
        System.out.println("Średnia wartość wpłat wynosi: " + bank.getDepositeAverage());
    }
}
