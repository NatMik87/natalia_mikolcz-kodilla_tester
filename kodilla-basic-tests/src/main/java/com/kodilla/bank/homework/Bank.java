package com.kodilla.bank.homework;

public class Bank {
    private CashMachine cashMachine[]= new CashMachine[20];
    private int saldo;


    public Bank (String cachMachinName) {
        this.saldo = saldo;

    }

    public int getSaldo() {
        return 10000;
    }

    public double getDepositeAverage() {
        return this.deposite.getAverage();
    }

    public double getPaycheckAvarage() {
        if (this.cashMachine.length == 0) {
            return 0; }
        double sum =0;

        for (int i=0 ; i < this.cashMachine.length ; i++){
            sum += this.cashMachine[i].getSubAverage(); }
        return sum / this.cashMachine.length;

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
