package session1.test_package; // First Line always for packages

// imports

import java.util.Scanner;

public class TestStructure { //Class Body Starts
    public static void main(String[] args) { // Type psvm will auto complete this line
        // Main Code body
        System.out.println("It starts here!");

        Scanner input = new Scanner(System.in);
        String value = input.nextLine(); //if we want to have the whole line value
        System.out.println("Enter number1");
        int num1 = input.nextInt();

        // Please ask user to enter 3 numbers and print the multiplication in the terminal
        // 2 * 3 * 10

        System.out.println("Please enter 3 numbers:");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        System.out.println(n1 +" x "+ n2 +" x "+ n3 +" = " + n1*n2*n3 +(" and the sum of "+n1+" and "+n2+" is " + (n1 + n2)));


        // int x1 = 10;
        // float x2 = 2.3f;
        // double x3 = 4054654567.9;





    }
} // Class Body finishes
