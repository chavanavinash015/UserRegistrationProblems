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

    @Test
    void given_last_name_should_returnTrue(){
        UserValidation validation= new UserValidation();
        Boolean result1 = validation.checkLastName("City");
        Assertions.assertEquals(result1,true);
    }

    @Test
    void given_email_id_should_returnTrue(){
        UserValidation validation= new UserValidation();
        Boolean result2 = validation.checkEmail("Mumbacity@gmail.com");
        Assertions.assertEquals(result2,true);
    }

    @Test
    void given_phone_number_should_returnTrue(){
        UserValidation validation = new UserValidation();
        Boolean result3 = validation.checkPhoneNumber("91 9152352304");
        Assertions.assertEquals(result3,true);
    }

    @Test
    void given_password_should_returnTrue(){
        UserValidation validation = new UserValidation();
        Boolean passrule1 = validation.checkPassword("bombaycity");
        Assertions.assertEquals(passrule1, true);
    }

    @Test
    void given_password2_should_returnTrue(){
        UserValidation validation = new UserValidation();
        Boolean passrule2 = validation.checkPassword2("Bombay123");
        Assertions.assertEquals(passrule2,true);
    }

    @Test
    void given_password3_should_returnTrue(){
        UserValidation validation = new UserValidation();
        Boolean passrule3 = validation.checkPassword3("Avinash015");
        Assertions.assertEquals(passrule3,true);
    }

    @Test
    void given_password4_should_returnTrue(){
        UserValidation validation = new UserValidation();
        Boolean passrule4 = validation.checkPassword4("Bombay@123");
        Assertions.assertEquals(passrule4,true);
    }

    @Test
    void given_emailsamples_should_returnTrue(){
        UserValidation validation = new UserValidation();
        Boolean emailSamples = validation.checkEmailSamples("Bombay020@.com");
        Assertions.assertEquals(emailSamples,true);
    }
}
