package session2;

import java.util.Scanner;

//session 2 assignment
//Write a program that prompts the user to enter
// the minutes (e.g., 1 billion), and displays the number
// of years and days for the minutes. For simplicity, assume
// a year has 365 days.
//*use long type as identifer
public class Assignment1MinutesToYears {
    public static void main(String[] args) {
        System.out.println("Please enter a large number of minutes. We will show you how many years that is.");
        Scanner scanner = new Scanner(System.in);
        long minutes = scanner.nextLong();
        System.out.println(minutes + " minutes is " + minutes/60/24/365 + " years and " + minutes/60/24%365 + " days!");
    }
}
