package com.kodilla.execution_model.homework;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {

        this.orders.add(order);
    }

    //public Order getOrder(LocalDate localDate) {
    //    this.orders(LocalDate.of(2018, 01, 01).plusYears(2L));
    //    return this.orders.get();
    //}

    public int getNumberOfOrders() {
        return this.orders.size();
    }

    //public double sumAllOrders(Order order) {
    //    double result = 0;
     //   for (double i : order.getPrice()) {
     //       result += i;
      //  }
      //  return result;
    //}
}

