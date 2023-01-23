package session2;

//		1. Get the length of the rectangle.
//		2. Get the width of the rectangle.
//		3. Find the perimeter using the following equation:
//			perimeter = 2 x (length + width)
//		4. Find the area using the following equation:
//			area = length x width
//5 : print the result in the output

import java.util.Scanner;

public class CalculatePerimeter {
    public static void main(String[] args) {
        //either you get the value and assign the value into a variable
        //or define the variables at the beginning
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of rectangle");
        double length= scanner.nextDouble();

        System.out.println("Please enter the width of rectangle");
        double width = scanner.nextDouble();

        double perimeter = 2 * (length + width);
        double area = length * width;

        System.out.println("The perimeter of the rectangle is = " + perimeter + " and the area of rectangle is " + area);
    }
}
