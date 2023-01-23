package session3.assignments;

import java.util.Scanner;

//Ask user to enter a value in feet use double for input
//        Ask user to enter a value in pound use double for input
//        convert the values to meter and kilogram
//        One foot is 0.305 meter
//        One pound is 0.454 kilograms
//        and print the result in the output
//        * use double for the identifiers
public class Answer2 {
    public static void main(String[] args) {
        //ALT + Enter -> auto import
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a value of feet.");
        double feet = scanner.nextDouble();
        System.out.println("Please input a value of pound.");
        double pound = scanner.nextDouble();
        //https://www.coderanch.com/t/374283/java/double-float-multiplication : for study about
        // strange behavior of multiplying double and float
//        float meterConvertor = 0.305f;
//        float poundrConvertor = 0.454f;
        double meter = feet * 0.305;
        double kilo = pound * 0.454;

        System.out.println("The " + feet + " feet is " + meter + " meter,"
                + "\n"+ "The " + pound + " pound is " + kilo + " kilograms.");

        //%d , %f, %s
        System.out.printf("The %4.4f feet is %4.4f meter and the %4.4f pound is %4.4f kilo", feet, meter, pound, kilo);

    }
}
