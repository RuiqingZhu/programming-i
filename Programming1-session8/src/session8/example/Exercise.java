package session8.example;

import java.util.Scanner;

/**
 * (Reverse the numbers entered) Write a program that
 *  * reads ten integers and displays them in the reverse
 *  * of the order in which they were read.
 */
public class Exercise {
    public static void main(String[] args) {
        int[] arr = createArray();
        displayReverse(arr);
    }
    static void displayReverse(int[] arr){
        for(int i = arr.length - 1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] createArray(){
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        for(int i=0;i< numbers.length;i++){
            numbers[i] = input.nextInt();
        }
        return numbers;
    }
}


