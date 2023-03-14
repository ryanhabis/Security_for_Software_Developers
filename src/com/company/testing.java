package com.company;

import java.util.Scanner;

public class testing
{
    public static void main(String[] args)
    {
        testEmail();
        System.out.println("------------------------------");
        testPassword();
    }

    public static int getMenuChoice(int numItem)
    {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        while (choice < 1 || choice > numItem)
        {
            System.out.println("Please enter a valid number(1 - %d)\n");
            choice = scanner.nextInt();
        }
        return choice;
    }

    public static boolean testEmail()
    {
        String [] testEmail = {
                "ryan.habis@gmail.com",
                "test",
                "invalid",
                "other@email.com"
        };
        for (String email: testEmail)
        {
            boolean validEmail = lab1.vaildEmail(email);
            System.out.println("email = " + email + "is valid = "+ validEmail);
        }

        return false;
    }

    public static void testPassword()
    {
        String [] testPassword = {
                "Ryan0Habis#1",
                "test",
                "invalid",
                "other@email.com"
        };
        for (String password: testPassword)
        {
            boolean validPassword = lab1.validPassword(password);
            System.out.println("password = " + password + "is valid = "+ validPassword);
        }

    }
}
