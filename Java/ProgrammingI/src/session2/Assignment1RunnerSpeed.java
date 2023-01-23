package session2;

import java.util.Scanner;

//Write a program to calculate the average speed of a runner
//Ask user to enter the number of kilometers and convert it to mile
//Mile = Km /1.6
//Ask user to enter to enter how many hours and how many minutes it took
//convert the number to minutes
//speed in mile perhour -> number of miles / number of hour
//print the result in output
public class Assignment1RunnerSpeed {
    public static void main(String[] args) {
        System.out.println("How many kilometers did you run today?");
        Scanner scanner = new Scanner(System.in);
        double km = scanner.nextDouble();
        double miles = km / 1.6;

        System.out.println("How many hours and how many minutes did it take?");
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int totalMinutes = hours * 60 + minutes;
        double totalHours = totalMinutes / 60;

        System.out.println("Your speed is " + miles / totalHours + " miles per hour!");
    }
}
