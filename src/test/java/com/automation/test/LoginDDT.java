package com.automation.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDDT extends BaseTest {

    @Test(groups = "Smoke", dataProvider = "provideSetOfCredentials")
    public void verifyLoginSuccessful(String username, String password){
        System.out.println("Logging in with username" + username);
        System.out.println("Logging in with password" + password);
    }

    @DataProvider
    // DataProvider must return either 1D or 2D array
    public Object[][] provideSetOfCredentials(){

        Object[][] setOfCredentials = {{"jasur", "jasur123"}, {"chirag", "chirag123"}};
        return setOfCredentials;

    }

}
