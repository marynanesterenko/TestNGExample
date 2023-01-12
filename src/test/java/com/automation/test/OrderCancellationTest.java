package com.automation.test;

import org.testng.annotations.Test;

public class OrderCancellationTest extends BaseTest{

    @Test
    public void veryUserCanCancelOrder(){
        System.out.println("Test - Verify User Can Cancel the Order");
    }

    @Test
    public void veryUserCannotCancelOrderOnceOrderStateIsShipped(){
        System.out.println("Test - Verify User Cannot Cancel the Order Once State Is Shipped");
    }





}
