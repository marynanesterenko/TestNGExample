package com.automation.test;

import org.testng.annotations.*;

public class FirstTestNGTest {

    @BeforeClass // pre-requisite for the entire Class, runs once
    public void outerSetUp(){
        System.out.println("Before the test Class");
    }

    @BeforeMethod
    public void setUp(){
        System.out.println("Before any test method");
    }

    @Test
    public void firstTest (){
        System.out.println("First Test");
    }

    @Test
    public void secondTest (){
        System.out.println("Second Test");
    }

    @Test
    public void thirdTest (){
        System.out.println("Third Test");
    }

    @AfterMethod
    public void cleanUp(){
        System.out.println("After every test");
    }

    @AfterClass
    public void outerCleanUp (){
        System.out.println("After the test Class");
    }

}
