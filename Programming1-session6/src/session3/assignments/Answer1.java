package session3.assignments;

//Write a program that prompts the user to enter
//        the minutes (e.g., 1 billion), and displays the number
//        of years and days for the minutes. For simplicity, assume
//        a year has 365 days.
//        *use long type as identifer

import java.util.Scanner;

public class Answer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the minutes");
        long perYear = 365 * 24 * 60;
        long perDay = 24 * 60;
        long time = scanner.nextLong();
        long year = time / perYear;
        long day = (time % perYear) / perDay ;
        System.out.println("The "+ time + " minutes is " +year + " years, " + day + " days.");
        System.out.printf("The %d minutes is %d years, %d days.", time, year, day);
    }
}
