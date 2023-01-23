package session6.examples;

import java.util.Scanner;

/**
 * (Find numbers divisible by 5 and 6) Write a program that displays
 *  * all the numbers from 100 to 1,000, ten per line, that are divisible by
 *  * 5 and 6. Numbers are separated by exactly one space.
 */
public class Example3 {
    public static void main(String[] args) {
        //FOR loop
        int counter = 0;
        for (int num= 100; num< 1000; num++){
            if(num % 5 == 0 && num % 6 == 0){
                System.out.print(num + " ");
                counter ++;

                if (counter == 10){
                    System.out.println();
                    counter=0;
                }
            }
        }

        /// Star pattern
        // relation between line number and count of stars
        // and repeating this behaviour for n line of number
        System.out.println("how many lines of number");
        Scanner in = new Scanner(System.in);
        int lineCount = in.nextByte();
        for(int i=1; i<=lineCount; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("SECOND PATTERN");
        for (int i=1 ; i<=lineCount ; i++){
            for(int j=lineCount; j>=i ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
