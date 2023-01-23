package session8.assignment;

import java.util.Scanner;

/**
 * (Occurrences of a specified character) Write a method that finds the number of
 * * occurrences of a specified character in a string using the following header:
 * * public static int count(String str, char a)
 * * For example, count("Welcome", 'e') returns 2.
 * * <p>
 * * Write a test program that
 * * prompts the user to enter a string followed by a character and displays the number
 * * of occurrences of the character in the string.
 */
public class Assignment3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String stringInput = scan.nextLine();
        System.out.print("Enter a character: ");
        char charInput = scan.next().charAt(0);

        int count = count(stringInput, charInput);
        System.out.printf("%c occoured %d times in %s", charInput, count, stringInput);
    }

    public static int count(String str, char ch) {
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                counter++;
            }
        }
        return counter;
    }

}
