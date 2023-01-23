package session2;

import java.util.Scanner;

//Ask user to enter a value in feet use double for input
//Ask user to enter a value in pound use double for input
//convert the values to meter and kilogram
//One foot is 0.305 meter
//One pound is 0.454 kilograms
//and print the result in the output
//* use double for the identifiers
public class Assignment1ImperialToMetric {
    public static void main(String[] args) {
        System.out.println("Please enter a value in feet:");
        Scanner scanner = new Scanner(System.in);
        double feet = scanner.nextDouble();
        System.out.println(feet + " feet is " + feet*0.35 + " meters!");

        System.out.println("Please enter a value in pounds:");
        double pounds = scanner.nextDouble();
        System.out.println(pounds + " pounds is " + pounds*0.454 + " kilograms!");
    }
}
