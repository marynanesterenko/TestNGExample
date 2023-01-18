package com.automation.test;

import org.testng.annotations.Test;

public class ProductListingPageTest extends BaseTest{

    @Test(groups = {"Ali","Smoke"})
    public void verifyEachProductPrice() {
        System.out.println("Test - Verify Each Product Price");
    }

    @Test(groups = "Chirag")
    public void verifyEachProductHasStockInformation() {
        System.out.println("Test - Verify Each Product Stock Information");
    }

    @Test
    public void verifyEachProductHasAddToCartButton() {
        System.out.println("Test - Verify Each Product Add To Cart Button");
    }
}
