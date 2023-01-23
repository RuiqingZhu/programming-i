package session8.assignment;

import java.util.Scanner;

/**
 * (Display matrix of 0s and 1s) Write a method that displays an n-by-n matrix using
 *  * the following header:
 *  * public static void printMatrix(int n)
 *  * Each element is 0 or 1, which is generated randomly.
 *  * <p>
 *  * Write a test program that
 *  * prompts the user to enter n and displays an n-by-n matrix. Here is a sample run:
 *  * * Enter n: 3
 *  * * 0 1 0
 *  * * 0 0 0
 *  * * 1 1 1
 *  *
 */
public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner

        // Enter number of rows/columns wanted in matrix
        System.out.print("Please enter number of rows/columns wanted (n): ");
        int n = scanner.nextInt();

        // matrix size based on user input (n)
        printMatrix(n);
    }

    // shows in console a matrix  based off user input (N) =(NxN rows/columns)
    public static void printMatrix(int n) {
        for (int rows = 0; rows < n; rows++) { //defining (intializing?) rows at 0, then checking if it's less than user input N, than adding row (rows++) until it matches user input N
            for (int columns = 0; columns < n; columns++) { //same thing as rows, two metrics that must match user input in this case
                // creates and then prints a number from a range of 0-1 (since we want everything to either be 0 or 1) *2 means it will just be 0 (1) or 1 (2)
                System.out.printf("%d \t",(int) (Math.random() * 2)); //println here would break the formatting
            }

            System.out.println();  // without this matrix format collapses - investigate further || if inside first for loop it also breaks formatting, separating it outside first for fixed it
            //https://stackoverflow.com/questions/25824156/nested-for-loop-to-print-output-of-2d-array-in-java read this similar issue to better understand why this works
        }
    }
}
