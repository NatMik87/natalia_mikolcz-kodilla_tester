package com.kodilla.stream.homework;

import org.junit.jupiter.api.Test;

//import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WarehouseTest {

    @Test
    public void testOrderNoExist() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        //when
        boolean isOrderExist = warehouse.getOrder("umbrella");
        //then
        assertTrue(isOrderExist);
    }
}