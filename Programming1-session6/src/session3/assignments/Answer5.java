package session3.assignments;

import java.text.DecimalFormat;
import java.util.Scanner;

//Write a program to calculate the average speed of a runner
//        Ask user to enter the number of kilometers and convert it to mile
//        Mile = Km /1.6
//        Ask user to enter to enter how many hours and how many minutes it took
//        convert the number to minutes
//        speed in mile perhour -> number of miles / number of hour
//        print the result in output
public class Answer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the distance in kilometers");
        double km = scanner.nextDouble();
        double mile = km/1.6;

        System.out.println("Enter the time in hours:");
        double hours = scanner.nextDouble();

        System.out.println("Enter the time in minutes:");
        double minutes = scanner.nextDouble();

        int timeMinutes = (int)(hours * 60 + minutes);
//        https://stackoverflow.com/questions/65678297/solve-integer-division-in-floating-point-context
        //when you divide 2 integer and the result is double, one of the elements needs to be double
        double milePerHours = mile /  (timeMinutes/60d) ;
        System.out.printf("Your speed is %.4f miles/hour" , milePerHours);
    }
}
