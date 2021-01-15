package com.kodilla.execution_model.homework;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Order> orders = new ArrayList<>();

    public void addOrder (Order order) {
        this.orders.add(order);
    }

   // public Order getOrder(LocalDate localDate){
    //    return (LocalDate.of(2018,01,01).plusYears(2L) )
          //  return this.orders.get(orders);
    //}



    public int getNumberOfOrders() {
        return this.orders.size();
    }

   // public int sumAllOrders() {
    //    return this.orders
    }

