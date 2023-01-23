package session1;

import java.util.Scanner;


public class Main {
    // Line number 1 : the name of the class
    // The name of the class is the same as the name of the file
    // Java is case sensitive -> Convention(Start with a Capital Letter)
    // { -> open a statement


    //Method
    public static void main(String[] args) { // { -> open a statement
        System.out.print("my first application    "); //print and stay in the same line

        System.out.println("Reza Shalchian"); //print and go to the next line
        System.out.println("Hello students");

        System.out.println(2);
        System.out.println(2 * 10); //compiler does the calculation on fly before running and you see the result
        System.out.println('c');
        //commented code
        //Task: Try to run the program and put your name in the first line
        // and hello in the second line

        //1- Right click and Run the program
        //2- Use the Green arrow in the line 1
        //3- Use Menu Run and use Run Green arrow

        //compile time error:-> means before running the compiler checks the code syntax
        //run time error -> XXXXXXXXX


        System.out.println("Enter your name");

        //I want to get the result from user
        Scanner scanner = new Scanner(System.in); //instantiate
        String input = scanner.next(); //assign a value to something

        System.out.println("hello " + input);

        // Ask for the city you live and then print it out
        System.out.println("Please Enter your city");
        String city = scanner.next();
        System.out.println("I live in " + city);


    }  // } -> close a statement


}  // } -> close a statement