package com.automation.test;

import org.testng.annotations.Test;

public class CartPageTest extends BaseTest{

    @Test
    public void verifyUserCanAddItemIntoCart(){
        System.out.println("Test - Verify user can add item into cart");
    }

    @Test (dependsOnMethods = "verifyUserCanAddItemIntoCart")
    public void verifyUserCanRemoveItemFromCart(){
        System.out.println("Test - Verify user can remove item from cart");
    }

    @Test( dependsOnMethods = "verifyUserCanAddItemIntoCart")
    public void verifyUserCanChangeQuantityOfProductOnCartPage(){
        System.out.println("Test - Verify user can change quantity");
    }
}
