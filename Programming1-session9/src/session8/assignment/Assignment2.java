package session8.assignment;

import java.util.Scanner;

/**
 * (Check password) Some websites impose certain rules for passwords. Write a
 * * method that checks whether a string is a valid password. Suppose the password
 * * rules are as follows:
 * * â–  A password must have at least eight characters.
 * * â–  A password consists of only letters and digits.
 * * â–  A password must contain at least two digits.
 * * Write a program that prompts the user to enter a password and displays Valid
 * * Password if the rules are followed or Invalid Password otherwise\
 */
public class Assignment2 {
    public static void main(String[] args) {
        System.out.println("Please input your password");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();
        boolean valid = isValid(password);

        //validation=true -> is wrong
        //validation == true OR validation
        if (valid) {
            System.out.println("This password is valid");
        } else
            System.out.println("This password is invalid");
    }

    public static boolean isValid(String password) {
        int length = password.length();
        if (length >= 8 && containsTwoDigits(password) && containsOnlyLettersAndDigits(password)) {
            return true;
        }
        return false;

    }

    public static boolean containsOnlyLettersAndDigits(String s) {
        int length = s.length();
        boolean containsAtLeastOneDigit = false;
        boolean containsAtLeastOneLetter = false;

        for (int i = 0; i < length; i++) {
            if (!Character.isLetter(s.charAt(i))) {
                if (!Character.isDigit(s.charAt(i))) {
                    return false;
                } else {
                    containsAtLeastOneDigit = true;
                }
            } else {
                containsAtLeastOneLetter = true;
            }
        }

        return containsAtLeastOneLetter && containsAtLeastOneDigit;
    }

    public static boolean containsTwoDigits(String s) {
        int length = s.length();
        int counter = 0;
        for (int i = 0; i < length; i++) {
            if (Character.isDigit(s.charAt(i))) {
                counter++;
                if (counter >= 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
