package session1.test; // First Line always for packages

import java.util.Scanner;

public class TestStructure { //Class Body Starts

    //psvm
    public static void main(String[] args) {
        //Main Code body
        System.out.println("Starts here, Enter something");

        Scanner scannerInputValue = new Scanner(System.in);
        String value = scannerInputValue.nextLine(); // if we want to have the whole line
        System.out.println(value);

        System.out.println("Enter number1");
        int num1 = scannerInputValue.nextInt();

        System.out.println("Enter number2");
        int num2 = scannerInputValue.nextInt();

        System.out.println("Sum of number 1 and number 2 -> " + num1 + num2);

        //Please ask user to enter 3 numbers and print the multiplication in the terminal
        // 2 * 3 * 10

        int x1 = 10;
        float x2  =2.3f;
        double x3 = 4055555555.9;

    }

}//class Body finishes
