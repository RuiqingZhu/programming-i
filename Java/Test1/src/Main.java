import java.util.*;

public class Main {
    // Line number 1: the name of the class
    // The name of the class is the same as the name of the file
    // Java is case-sensitive --> Convention(Start with a Capital Letter)
    // "{" --> opens a statement

    //Method
    public static void main(String[] args) {
        System.out.print("my first application"); //print and stay in the same line

        System.out.println("Hello world!"); //print and go to the next line
        System.out.println("Hola amigos!");

        System.out.println(2);
        System.out.println(2 * 10); //Compiler does the calculation on the fly before running
        System.out.println("c");

        // <-- to comment out a line.
        // Task: Try to run the program and put your name in the first line
        // and hello in the second line

        //to run the application:
        //1. Right click and Run the program
        //2. Use the green arrow in the line 1 --> Run
        //3. Use Menu Run and use Run Green arrow

        // compile time error: -> means before running the compiler checks the code syntax
        // run time error --> will be introduced later


//        System.out.println("Enter your name");

        //I want to get the result from user
        Scanner scanner = new Scanner(System.in); // Instantiate
//        String input = scanner.next(); //assign a value to something
        Float.valueOf(scanner.nextFloat());
//        System.out.println("hello " + input);

        //Ask for the city you live and then print it out
//        System.out.println("Which city do you live in?");

//        Scanner scanner1 = new Scanner(System.in);
//        String input1 = scanner1.next();

//        System.out.println("you live in " + input1);

        float n1 = scanner.nextFloat();
        float n2 = scanner.nextFloat();
        float n3 = scanner.nextFloat();
        int n4 = scanner.nextInt();

        System.out.println((n1+"x"+n2+"-"+n3+"x"+n4+"=")+(n1 * n2 - n3 * n4));

    } // "}" --> closes a statement
}