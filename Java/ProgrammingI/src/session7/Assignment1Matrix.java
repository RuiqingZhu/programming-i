package session7;

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
public class Assignment1Matrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int n = scanner.nextInt();

        printMatrix(n);
    }

    public static void printMatrix(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                int random = (int) (Math.random() * 2);
                System.out.print(random + " ");
            }
            System.out.println("");
        }
    }
}
