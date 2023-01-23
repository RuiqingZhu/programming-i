package session4.examples;

import java.util.Scanner;

/**
 * (Find future dates) Write a program that prompts the user to enter an integer for
 *  todays day of the week (Sunday is 0, Monday is 1... Saturday is 6). Also
 *  prompt the user to enter the number of days after today for a future day and display
 *  the future day of the week.
 */
public class Example1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(
                "Enter an integer for today's day of the week (Sunday is 0, Monday is 1, and Saturday is 6): ");

        int weekDay = input.nextInt();
        if(weekDay > 6 || weekDay < 0){
            System.out.println("Incorrect value....Please try again and enter an integer 0 through 6: ");
//            input.close();
        }
        else{
            System.out.print("Enter the number of days after today to discover the future day: ");
            int numDays = input.nextInt();

            int futureDaysOfTheWeek= (weekDay + numDays) % 7;
            switch (futureDaysOfTheWeek){
                case 0:
                    System.out.println("it will be is Sun");
                    break;
                case 1:
                    System.out.println("it will be Mon");
                    break;
                case 2:
                    System.out.println("it will be Tue");
                    break;
                case 3:
                    System.out.println("it will be  Wed");
                    break;
                case 4:
                    System.out.println("it will be Thu");
                    break;
                case 5:
                    System.out.println("it will be Fri");
                    break;
                case 6:
                    System.out.println("it will be Sat");
                    break;
            }

//            input.close();
        }

        input.close();
    }
}
