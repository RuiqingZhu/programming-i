package session7;

import java.util.Scanner;

/**
 * Geometry: area of a pentagon) The area of a pentagon can be computed using the
 *  * following formula:
 *  * Area = 5 * s^2 / 4 * tan(PI/5)
 *  * Write a method that returns the area of a pentagon using the following header:
 *  * public static double area(double side)
 *  * Write a main method that prompts the user to enter the side of a pentagon and
 *  * displays its area. Here is a sample run:
 *  * Enter the side: 5.5
 *  * The area of the pentagon is 52.04444136781625
 */
public class Assignment4Geometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the side length of a pentagon");
        double side = scanner.nextDouble();

        System.out.printf("The area of the pentagon is %f", area(side));
    }

    public static double area(double side){
        double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI/5));
        return area;
    }
}
