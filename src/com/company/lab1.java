package com.company;/*
Lab 1 - Regular Expressions: Java Exercises

Create a new project in your Java IDE for this module. You’ll come back to this code most weeks – save it in your OneDrive.

Create a new java class to test the following regular expressions. Write methods for each question and call them from the main method using text entered from the keyboard to check each solution.

1.	Write a regular expression to check that a string only contains lowercase and uppercase letters (i.e., no numbers or special characters.)
2.	Write a regular expression to check that a String is a binary number (i.e., only contains 1’s and 0’s)
3.	Write a regular expression that checks that a String is either Saturday or Sunday.
4.	Write a regular expression to check for a valid DkIT student number (i.e., a ‘D’ followed by two zeros and 6 more numbers)
5.	Write a regular expression to check for a valid Irish mobile number (i.e., starts with 08, followed by 3, 5, 6, 7 or 9, then 7 other numbers.)
6.	Write a regular expression to check for a valid password – decide for yourself what conventions make a suitable password and describe them in a comment.
7.	Write a regular expression to check for a valid email address – what makes up a valid email address?

 */

public class lab1
{
    /**
     * Create a new java class to test the following regular expressions. Write methods for each question and call them from the main method using text entered from the keyboard to check each solution.
     */

//    public static void main(String[] args)
//    {
//        System.out.println("1.\tWrite a regular expression to check that a string only contains lowercase and uppercase letters (i.e., no numbers or special characters.");
//        System.out.println(lowHighString());
//
//        System.out.println("2.\tWrite a regular expression to check that a String is a binary number (i.e., only contains 1’s and 0’s)");
//        System.out.println(checkBinary());
//
//        System.out.println("3.\tWrite a regular expression that checks that a String is either Saturday or Sunday.");
//        System.out.println(weekendChecker());
//
//        System.out.println("4.\tWrite a regular expression to check for a valid DkIT student number (i.e., a ‘D’ followed by two zeros and 6 more numbers)");
//        System.out.println(validDnumber());
//
//        System.out.println("5.\tWrite a regular expression to check for a valid Irish mobile number (i.e., starts with 08, followed by 3, 5, 6, 7 or 9, then 7 other numbers.)");
//        System.out.println(vaildPhoneNumber());
//
//        System.out.println("6.\tWrite a regular expression to check for a valid password – decide for yourself what conventions make a suitable password and describe them in a comment.");
//        System.out.println(validPassword("C0de@Str1ng#"));
//
//
//        System.out.println("7.\tWrite a regular expression to check for a valid email address – what makes up a valid email address?");
//        System.out.println(vaildEmail("ryan@gmail.com"));
//
//        System.out.println("Simpler password");
//        System.out.println(simplePassword());
//    }
    /*
     * 1.	Write a regular expression to check that a string only contains lowercase and uppercase letters (i.e., no numbers or special characters.)
*/

    /**
     * This Java code defines a method named "lowHighString" which takes no parameters.
     * The method checks if the string "input" contains only alphabetical letters (upper or lower case).
     * If it contains only letters, the method returns true.
     * If it contains anything else (numbers or special characters), the method returns false.
     * @return boolean
     */
    public static boolean lowHighString()
    {
        String input = "YourInputString";
        if (input.matches("^[a-zA-Z]+$")) {
            // Input only contains letters
            return true;
        } else {
            // Input contains numbers or special characters
            return false;
        }
    }

//     * 2.	Write a regular expression to check that a String is a binary number (i.e., only contains 1’s and 0’s)

    /**
     * This code checks if a string binary is a valid binary number or not.
     * It returns true if the string binary only contains "0"s and "1"s.
     * It returns false if the string binary contains anything other than "0"s and "1"s (e.g. letters, numbers, special characters, etc.).
     * @return boolean
     */
    public static boolean checkBinary()
    {
        String binary = "1";
        if (binary.matches("[0-1]")) {
            // Input only contains letters
            return true;
        } else {
            // Input contains numbers or special characters
            return false;
        }
    }
//     * 3.	Write a regular expression that checks that a String is either Saturday or Sunday.

    /**
     * This code checks if a string called "weekend" is either "Saturday" or "Sunday".
     * If the input string is either "Saturday" or "Sunday", it returns true, otherwise it returns false.
     * It checks if the input string is equal to either "Saturday" or "Sunday".
     * @return boolean
     */
    public static boolean weekendChecker()
    {
        String weekend = "Saturday";
        if (weekend.matches("Saturday") || weekend.matches("Sunday")) {
            // Input only contains weekend
            return true;
        } else {
            // Input contains weekdays
            return false;
        }
    }
//     * 4.	Write a regular expression to check for a valid DkIT student number (i.e., a ‘D’ followed by two zeros and 6 more numbers)

    /**
     * This Java code defines a method named validDnumber() that checks if a given string, dNumber, matches the format of a valid DkIT student number.
     * The format of a valid student number is "D00" followed by 6 digits.
     * If the dNumber string matches this format, the method returns true.
     * If not, the method returns false.
     * @return boolean
     */

    public static boolean validDnumber()
    {
        String dNumber = "D00123456";
        if (dNumber.matches("D00[0-9]{6}")) {
            // Input is a valid DkIT student number
            return true;
        } else {
            // Input is not a valid DkIT student number
            return false;
        }
    }
//     * 5.	Write a regular expression to check for a valid Irish mobile number (i.e., starts with 08, followed by 3, 5, 6, 7 or 9, then 7 other numbers.)

    /**
     * This Java code defines a method named validPhoneNumber()
     * that checks if a given string, phone, matches the format of a valid Irish phone number.
     * The format of a valid phone number is "083" followed by 7 digits.
     * If the phone string matches this format, the method returns true.
     * If not, the method returns false.
     * @return boolean
     */
    public static boolean vaildPhoneNumber()
    {
        String phone = "0838022571";
        if (phone.matches("083[0-9]{7}")) {
            // Input is a valid DkIT student number
            return true;
        } else {
            // Input is not a valid DkIT student number
            return false;
        }
    }


//     * 6.	Write a regular expression to check for a valid password – decide for yourself what conventions make a suitable password and describe them in a comment.

    /**
     * This Java code defines a method named validPassword() that checks if a given string, password, matches the
     * conventions of a valid password. The conventions for a valid password include:
     *
     * At least one digit ((?=.*[0-9]))
     * At least one lowercase letter ((?=.*[a-z]))
     * At least one uppercase letter ((?=.*[A-Z]))
     * At least one special character (@#$%^&+=) ((?=.*[@#$%^&+=]))
     * No whitespace characters ((?=\\S+$))
     * Minimum length of 8 characters (.{8,})
     * If the password string matches these conventions, the method returns true. If not, the method returns false.
     *
     * @return boolean
     */
    public static boolean validPassword(String password) {
        //String password = "C0de@Str1ng#";

        if (password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$"))
        {
            return true;
        } else {
//            System.out.println("At least one digit\n" +
//                    "     * At least one lowercase letter\n" +
//                    "     * At least one uppercase letter\n" +
//                    "     * At least one special character\n" +
//                    "     * No whitespace characters\n" +
//                    "     * Minimum length of 8 characters");
            return false;
        }
    }

//     * 7.	Write a regular expression to check for a valid email address – what makes up a valid email address?
    /**
     * A valid email address typically consists of the following elements:
     *
     * A local part, which is usually the username, before the @ symbol
     * A domain name, after the @ symbol
     * The local part may contain letters, numbers, underscores, pluses, ampersands, asterisks, and hyphens.
     * The domain name must contain only letters, numbers, and hyphens.
     * The domain name must have at least one dot (.)
     * The top-level domain (TLD) must have 2-7 characters and consist only of letters.
     * This regular expression uses the following syntax:
     *
     * ^ and $ denote the start and end of the string, respectively.
     * [a-zA-Z0-9_+&*-]+ matches one or more characters that are letters, numbers, underscores, pluses, ampersands, asterisks, or hyphens.
     * (?:\\.[a-zA-Z0-9_+&*-]+)* matches zero or more instances of a dot (.) followed by one or more characters that are letters, numbers, underscores, pluses, ampersands, asterisks, or hyphens.
     * @ matches the @ symbol.
     * (?:[a-zA-Z0-9-]+\\.)+ matches one or more instances of one or more characters that are letters, numbers, or hyphens followed by a dot (.).
     * [a-zA-Z]{2,7}$ matches 2-7 characters that are letters.
     *
     * @return boolean
     */
    public static boolean vaildEmail(String email)
    {
//        String email = "ryan@gmail.com";
        if (email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$"))
        {
            return true;
        } else {
            return false;
        }
    }
//    public static boolean isFullname(String str) {
//        boolean isValid = false;
//        String expression = "^[a-zA-Z]";
//        CharSequence inputStr = str;
//        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
//        Matcher matcher = pattern.matcher(inputStr);
//        if (matcher.matches()) {
//            isValid = true;
//        }
//        return isValid;
//    }

    public static boolean isFullname(String str) {
        String expression = "^[a-zA-Z\\s]+";
        return str.matches(expression);
    }
}
