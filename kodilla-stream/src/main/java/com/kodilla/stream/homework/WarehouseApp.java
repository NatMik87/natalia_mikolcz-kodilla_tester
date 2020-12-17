package com.kodilla.stream.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse orders = new Warehouse();
        orders.addOrder(new Order("prezent"));
        try {
            orders.getOrder("prezent");
        } catch (OrderDoesntExistException e) {
            e.printStackTrace();
        }
        System.out.println();

    }
}
