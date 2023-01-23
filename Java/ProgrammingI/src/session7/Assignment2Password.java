package session7;

import java.util.Scanner;

/**
 * (Check password) Some websites impose certain rules for passwords. Write a
 *  * method that checks whether a string is a valid password. Suppose the password
 *  * rules are as follows:
 *  * â–  A password must have at least eight characters.
 *  * â–  A password consists of only letters and digits.
 *  * â–  A password must contain at least two digits.
 *  * Write a program that prompts the user to enter a password and displays Valid
 *  * Password if the rules are followed or Invalid Password otherwise\
 */
public class Assignment2Password {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a password of at least 8 characters with only letters and digits. The password must contain at least 2 digits");
        String password = scanner.next();

        if (isValidPass(password)){
            System.out.println("Valid Password");
        }
        else {
            System.out.println("Invalid Password");
        }


    }

    public static boolean isValidPass(String password){
        if (password.length() < 8){
            return false;
        }

        int numCount = 0;
        int charCount = 0;

        for (int i = 0; i < password.length(); i++){
            char ch = password.charAt(i);

            if (isDigit(ch)) {
                numCount++;
            }
            else if (isLetter(ch)) {
                charCount++;
            }
            else {
                return false;
            }
        }


        return (charCount >= 1 && numCount >= 2);
    }

    public static boolean isLetter(char ch) {

        return (ch >= 'A' && ch <= 'z');
    }


    public static boolean isDigit(char ch) {

        return (ch >= '0' && ch <= '9');
    }

}
