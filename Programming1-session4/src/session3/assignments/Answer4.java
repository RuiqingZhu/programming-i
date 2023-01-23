package session3.assignments;

import java.util.Scanner;

//(Area and perimeter of a circle) Write a program that displays
//        * the area and perimeter of a circle that its radius is an input from user
//        * the following formula:
//        * perimeter = 2 * radius * pi
//        * area = radius * radius * pi
//
//        print the result in the output
public class Answer4 {
    public static void main(String[] args) {
        //Input the radius
        System.out.printf("Enter radius of a circle: %n");
        Scanner num = new Scanner(System.in);
        double radius = num.nextDouble();

        //Convert
        double area = radius * radius * Math.PI;
        double perimeter = 2 * radius * Math.PI;

        //Output the result
        System.out.printf("Area is: %.4f %n" , area);
        System.out.printf("perimeter is: %.2f" , perimeter);
        System.out.printf("the value of %d", 1+2);
    }
}
