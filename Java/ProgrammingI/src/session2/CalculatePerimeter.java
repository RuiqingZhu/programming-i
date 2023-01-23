package session2;

import java.util.Scanner;

public class CalculatePerimeter {
    public static void main(String[] args) {
        //either you get the value and assign the value into a variable
        //or define the variables at the beginning
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of rectangle:");
        double length = scanner.nextDouble();

        System.out.println("Please enter the width of rectangle:");
        double width = scanner.nextDouble();

        double perimeter = 2 * (length + width);
        double area = length * width;

        System.out.println("The perimeter of the rectangle is = " + perimeter + " and the area of rectangle is " + area);
    }
}
