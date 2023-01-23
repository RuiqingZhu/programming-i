package exercise_package;

import java.util.*;

public class ExerciseSession1 {
    public static void main(String[] args) {
//        System.out.println("Please enter 9.5, 4.5, 2.5 and 3");
        Scanner scanner = new Scanner(System.in); // Instantiate
        System.out.println("Please enter the width of the rectangle:");
        float n1 = scanner.nextFloat();


        System.out.println("Please enter the length of the rectangle:");


        float n2 = scanner.nextFloat();
//        float n3 = scanner.nextFloat();
//        int n4 = scanner.nextInt();
//
//        System.out.println((n1 + "x" + n2 + "-" + n3 + "x" + n4 + "=") + (n1 * n2 - n3 * n4));
//        System.out.println("Please enter the width of the rectangle:");
//        System.out.println("Please enter the length of the rectangle:");
//
        System.out.println("The area of the rectangle is "+n1*n2);

        System.out.println("Please enter your first name and last name");
        String name = scanner.nextLine();
        System.out.println(name + " loves programming!");
    }
}
