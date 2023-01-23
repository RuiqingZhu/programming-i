package session3.examples;

//Write a program that prompts the user to enter a
//        * three-digit integer and determines whether it is a palindrome number. A
//        * number is palindrome if it reads the same from right to left and from left to
//        * right. Here is a sample run of this program:
//        * <p>
// * Enter a three-digit integer: 121 121 is a palindrome

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        //343
        //585
        System.out.println("please enter a number that has 3 digits");

        Scanner input =new Scanner(System.in);
        int number = input.nextInt();

        // / %

        int numLast = number % 10;
        int numFirst = number / 100;

        if(numFirst == numLast){
            System.out.println("this is a palindrom number");
        }
        else{
            System.out.println("this is not a palindrom number");
        }
    }
}
