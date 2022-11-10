package com.bridgelabz.UserRegistration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class UserRegistration {

    @BeforeAll
    static void displayMethod(){
        System.out.println("Welcome to user Registration to junit");
    }

    @AfterEach
    public void afterDisplayMethod(){
        System.out.println("Test is Passed");
    }
    @Test
    void given_first_name_should_returnTrue(){
        UserValidation validation = new UserValidation();
        Boolean result =validation.checkFirstName("Mumbai");
        Assertions.assertEquals(result,true);
    }
}
