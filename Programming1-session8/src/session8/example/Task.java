package session8.example;

import java.util.Scanner;

/**
 * Array
 * double[] myList = new double[10];
 * 1-. Initializing arrays with input values: Ask user to enter values into the array
 * 2- Initializing arrays with random values
 * 3- Displaying arrays:
 * 4- Summing all elements:
 * 5- Finding the largest element
 */
public class Task {
    public static void main(String[] args) {

        System.out.println("enter the size of array");
        Scanner input = new Scanner(System.in);
        byte size = input.nextByte();

        double[] myList = new double[size];

        System.out.println("enter the numbers");

        //1
        for(int i = 0 ;i<myList.length ; i++){
            myList[i] = input.nextDouble();
        }
        for(double number: myList){
            System.out.printf("%.2f ", number);
        }

        //2
        for(int i=0;i<myList.length;i++){
            myList[i] = Math.random();
        }
        System.out.println(" \n random numbers \n");
        //3
        for(double number: myList){
            System.out.printf("%.2f ", number);
        }

        double total = 0;
        for(int i=0; i< myList.length; i++){
            total += myList[i];
        }
        //OR
        //enhanced foreach is for iterating throgh something iterable
        for(double num : myList){
            total += num;
        }
        System.out.printf("the total of numbers is %.2f %n", total);

        double biggest = myList[0];
        int biggestIndex = 0;
        for(int i=1; i< myList.length; i++){
            if(myList[i] > biggest){
                biggest = myList[i];
                biggestIndex = i;
            }
        }

        System.out.printf("the biggest element is %.2f in %d", biggest, biggestIndex);
    }
}
