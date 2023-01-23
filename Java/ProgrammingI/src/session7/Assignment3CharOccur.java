package session7;

import java.util.Scanner;

/**
 * (Occurrences of a specified character) Write a method that finds the number of
 *  * occurrences of a specified character in a string using the following header:
 *  * public static int count(String str, char a)
 *  * For example, count("Welcome", 'e') returns 2.
 *  * <p>
 *  * Write a test program that
 *  * prompts the user to enter a string followed by a character and displays the number
 *  * of occurrences of the character in the string.
 */


public class Assignment3CharOccur {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = scanner.next();
        System.out.println("Please enter a character");
        char ch = scanner.next().charAt(0);
        System.out.printf("Character %s has occurred %d times in string %s", ch, count(str, ch), str);

    }


    public static int count(String str, char ch){
        int chCount = 0;
//        char ch1 = str.charAt(0);
        for (int i = 0; i < str.length(); i++){
            char ch2 = str.charAt(i);
            if (ch2 == ch){
                chCount++;
            }
        }
        return chCount;
    }
}