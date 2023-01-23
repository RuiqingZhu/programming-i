package session6;

import java.util.Scanner;

public class Example3 {
    /**
     * Find numbers divisible by 5 and 6. Write a program that displays all the numbers from 100 to 1000, ten per line, that are divisible by 5 and 6. Numbers are separated by exactly one space.
     */
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 100; i <= 1000; i++){
            if (i % 5 == 0 && i % 6 ==0){
                System.out.print(i + " "); // to print all numbers on the same line. In order to reorganize, keep running the lines below:

                counter++;
                if (counter == 10){
                    System.out.println();
                    counter = 0;
                }
            }
        }


        //star pattern
        //*
        //**
        //***
        //****
        //*****
        //******

        //reverse star pattern
        //******
        //*****
        //****
        //***
        //**
        //*

        for (int i = 1; i <= 6; i++){ // here i would be for the number of lines, 1, 2, 3, 4, 5, 6 lines
            for (int j = 1; j <= 6; j++){ // here j is a nested for loop inside the for loop of i (number of lines). here j would be for the number of stars.
                System.out.print("* "); // here we are printing all stars that meet the condition of j, in one line using print instead of println.
            }
            System.out.println(); // here we are outside the nested j loop to print a new line every time i increments, therefore we will have 6 lines because of the main for loop of i in line 38
        }


        for (int i = 1; i <= 6; i++){ // here i would be for the number of lines, 1, 2, 3, 4, 5, 6 lines, the same as the for loop above
            for (int j = 1; j <= i; j++){ // here j is a nested for loop inside the main loop of i (number of lines). here j would be for the number of stars. but we made j <= i, which basically repeats when i = 1 (print one line), j = 1 (print 1 star); when i = 2 (print the second line), j = i = 2 (print 2 stars on the second line); when i = 3 (print the 3rd line), j = i = 3 (print 3 stars on the third line), so on and so forth.
                System.out.print("* "); // here we are printing all stars that meet the condition of j, in one line using print instead of println.
            }
            System.out.println(); // here we are outside the nested j loop to print a new line every time i increments, therefore we will have 6 lines because of the main for loop of i in line 38
        }


        //we could also ask user to enter the number of lines so we print it out
        System.out.println("Please enter the number of lines");
        Scanner input = new Scanner(System.in);
        int lineCount = input.nextByte();
        for (int i = 1; i <= lineCount; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        // Second pattern: reverse stars
        for (int i = 1; i <= 6; i++){
            for (int j = 6; j >= i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        //same for asking for user input
        for (int i = 1; i <= lineCount; i++){
            for (int j = lineCount; j >= i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
