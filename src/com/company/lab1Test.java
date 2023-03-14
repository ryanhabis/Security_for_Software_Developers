package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class lab1Test
{

    @org.junit.jupiter.api.Test
    void lowHighString()
    {
    }

    @org.junit.jupiter.api.Test
     void checkBinary()
    {
    }

    @org.junit.jupiter.api.Test
    void weekendChecker()
    {
    }

    @org.junit.jupiter.api.Test
    void validDnumber()
    {
    }

    @org.junit.jupiter.api.Test
    void vaildPhoneNumber()
    {
    }

    @org.junit.jupiter.api.Test
    void validPassword()
    {
    }

    @org.junit.jupiter.api.Test
    void vaildEmail()
    {
        String testEmail = "ryan.habis@gmail.com";
        lab1 instance = new lab1();

        String expResult = "^[a-zA-Z\\s]+";
        boolean result = instance.vaildEmail(testEmail);
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    void isFullname()
    {



    }
}