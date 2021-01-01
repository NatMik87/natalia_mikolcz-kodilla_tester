package com.kodilla.stream.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//import static org.junit.Assert.*;

public class WarehouseTest {

    @Test
    public void testOrderNoExist() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();

        Assertions.assertThrows(OrderDoesntExistException.class , ()-> warehouse.getOrder("umbrella"));
    }

    @Test
    public void testOrderExist() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("book"));
        Order result = warehouse.getOrder("book");

        Assertions.assertNotNull(result);
    }
}