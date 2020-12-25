package com.kodilla.stream.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order){
        this.orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        return
        this.orders
                .stream()
                .filter(o -> o.getNumber().equals(number)).findFirst().orElseThrow(OrderDoesntExistException::new );

    }
}
