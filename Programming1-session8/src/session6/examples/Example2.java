package session6.examples;

import java.util.Scanner;

/**
 *  (Count positive and negative numbers and
 *  * compute the average of numbers) Write a program that reads an
 *  * unspecified number of integers, determines how many positive
 *  * and negative values have been read, and computes the total and average
 *  * of the input values (not counting zeros). Your program ends with the input 0.
 *  * Display the average as a floating-point number.
 *  * If your entire input is 0, the program displays No numbers are entered except 0.
 */
public class Example2 {
    //the user enter the numbers until the user enters 0
    // while and a condition that stops the operation
    public static void main(String[] args) {

        int pos = 0;
        int neg = 0;
        double total = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("please enter any integer, negative or positive and the program ends with 0");

        int number = input.nextInt();

        //user enters 0
//        if(number == 0){
//            System.out.println("No numbers entered");
//            System.exit(1);
//        }

        int counter = 0;

        while(number != 0){
            total += number;
            counter++;
//            total = total + number;
            if (number > 0){
                pos++;
            }
            if(number <0){
                neg++;
            }
            System.out.println("please enter more numbers");
            number = input.nextInt();
        }
        if(counter > 0){
            double average = total / counter;

            //user does not enter 0
            System.out.println("The number of positives is: " + pos);
            System.out.println("The number of negatives is: " + neg);
            System.out.println("The total is: " + total);
            System.out.println("The average is: " + average);
        }
        else{
            System.out.println("No numbers entered");
        }
    }
}

