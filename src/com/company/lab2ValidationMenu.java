package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class lab2ValidationMenu extends lab1
{
    /*
    Using the methods you created in lab 1, create a menu that allows you to choose from a few options to allow you to validate specific text.
    E.g.

    1.	Check if a password is valid
    2.	Check if an email address is valid.
    3.	Exit
     */
    public void main(String[] args)
    {
        System.out.println(Arrays.toString(displayMenu()));

        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        while (!userInput.equals("3"))
        {
            userInput = scanner.nextLine();
            switch (userInput)
            {
                case "1" -> {
                    System.out.println("Enter email address");
                    String email = scanner.next();
                    if (vaildEmail(email))
                    {
                        System.out.println("You're email is valid");
                    } else
                    {
                        System.out.println("invalid");
                    }
                }
                case "2" -> {
                    System.out.println("Enter password here");
                    String password = scanner.next();

                    //Ryan0Habis#'
                    if (validPassword(password))
                    {
                        System.out.println("You're password is valid");
                    } else
                    {
                        System.out.println("invalid");
                    }
                }
                case "3" -> System.out.println("Exiting the program.");
                default -> System.out.println(Arrays.toString(displayMenu()));
            }
        }
    }
    public static String[] displayMenu()
    {
        String []menu = {"1.Check if an email address is valid.","2.Check if a password is valids.","3.You're fullName"};
        return menu;
    }
    public static int getMenuChoice()
    {
        return -1;
    }
}

