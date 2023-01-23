package session4;

import java.util.Scanner;

/**
 * (Find future dates) Write a program that prompts the user to enter an integer for today's day of the week (Sunday is 0, Monday is 1, ... Saturday is 6). Also prompt the user to enter the number of days after today for a future day and display the future day of the week.
 */
public class Example1FutureDates {
    public static void main(String[] args) {
        System.out.println("Please enter a number between 0 and 6 to indicate Sunday through Saturday");
        Scanner input = new Scanner(System.in);
        int weekDay = input.nextInt();

        if (weekDay > 6 || weekDay < 0 ){
            System.out.println("Incorrect value");
        }
        else {
            System.out.println("Enter the number of days after today to discover the future day: ");
            int numDays = input.nextInt();

            int futureDaysOfTheWeek = (weekDay + numDays) % 7;
            switch (futureDaysOfTheWeek){
                case 0:
                    System.out.println("That day is sunday");
                    break;
                case 1:
                    System.out.println("That day is monday");
                    break;
                case 2:
                    System.out.println("That day is tuesday");
                    break;
                case 3:
                    System.out.println("That day is wednesday");
                    break;
                case 4:
                    System.out.println("That day is thursday");
                    break;
                case 5:
                    System.out.println("That day is friday");
                    break;
                case 6:
                    System.out.println("That day is saturday");
                    break;
            }

        }
    }
    //switch case
}
