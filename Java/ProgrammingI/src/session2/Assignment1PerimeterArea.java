package session2;

import java.util.Scanner;

//(Area and perimeter of a circle) Write a program that displays
// * the area and perimeter of a circle that its radius is an input from user
// * the following formula:
// * perimeter = 2 * radius * pi
// * area = radius * radius * pi
//
//print the result in the output
public class Assignment1PerimeterArea {
    public static void main(String[] args) {
        System.out.println("Please enter the radius of the circle:");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        final double PI_NUMBER = Math.PI;
        System.out.println("The perimeter of the circle is " + (2*radius*PI_NUMBER));
        System.out.println("The area of the circle is " + (radius*radius*PI_NUMBER));
    }
}
