package com.bridgelabz.UserRegistration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class UserRegistration {

    @BeforeAll
    static void displayMethod(){
        System.out.println("Welcome to user Registration to junit");
    }

    @AfterEach
    public void afterDisplayMethod(){
        System.out.println("Test is Passed");
    }

}
