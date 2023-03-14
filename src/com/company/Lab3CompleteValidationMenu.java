package com.company;

import java.util.Arrays;
import java.util.Scanner;


public class Lab3CompleteValidationMenu
{
    /**
     * Building on the work you did in Labs 1 and 2, get your validation program into a fully functioning state.
     ** 1.	Convert the RegEx methods class you made in Lab 1 to a utility class, that you can use.
     * 2.	Add more methods with regular expressions to validate everything you might enter on a form e.g. full name, date of birth etc.
     * 3.	Finish off your menu to include all the relevant methods you’ve created.
     * 4.	Start testing by adding arrays of test data – use a mixture of data that should pass the tests and data that will fail the tests.
     * 5.	How could you improve the testing process by using Junit…
     */
//    public static void main(String[] args)
//    {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter full name here");
//        String fullname = scanner.nextLine();
//        System.out.println(isFullname(fullname));
//
//    }

    public void main(String[] args)
    {
        System.out.println(Arrays.toString(lab2ValidationMenu.displayMenu()));

        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        while (!userInput.equals("4"))
        {
            userInput = scanner.nextLine();
            switch (userInput)
            {
                case "1" -> {
                    System.out.println("Enter email address");
                    String email = scanner.next();
                    if (lab1.vaildEmail(email))
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
                    if (lab1.validPassword(password))
                    {
                        System.out.println("You're password is valid");
                    } else
                    {
                        System.out.println("invalid");
                    }
                }
                case "3" -> {
                    System.out.println("Enter full name here");
                    String fullName = scanner.next();

                    if (lab1.isFullname(fullName))
                    {
                        System.out.println("You're fullName is valid");
                    } else
                    {
                        System.out.println("invalid");
                    }
                }
                case "4" -> System.out.println("Exiting the program.");
                default -> System.out.println(Arrays.toString(lab2ValidationMenu.displayMenu()));
            }
        }
    }
}
