package com.automation.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    @BeforeMethod
    public void setUp(){
        System.out.println("Before any test method");
    }

    @AfterMethod
    public void cleanUp(){
        System.out.println("After every test");
    }
}
