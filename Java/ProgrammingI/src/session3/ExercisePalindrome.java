package session3;

import java.util.Scanner;

public class ExercisePalindrome {
    public static void main(String[] args) {
        System.out.println("Please enter a number that has 3 digits");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // / %

        int numLast = number % 10;
        int numFirst = number / 100;
        if (numFirst == numLast){
            System.out.println("This is a palindrome number");
        }
        else{
            System.out.println("This is not a palindrome number");
        }
    }
}
