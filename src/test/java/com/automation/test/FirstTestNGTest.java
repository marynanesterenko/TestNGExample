package com.automation.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestNGTest {

    @BeforeMethod
    public void setUp(){
        System.out.println("Before any test method");
    }

    @Test
    public void firstTest (){
        System.out.println("First Test");
    }

    @AfterMethod
    public void cleanUp(){
        System.out.println("After every test");
    }

}
