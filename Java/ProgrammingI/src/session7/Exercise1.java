package session7;

import java.util.Scanner;

/**
 * Use the isPrime Method)  provide
 *  * the isPrime(int number) method for testing whether a number is prime.
 *  * Use this method to find the number of prime numbers less than 10000.
 */
public class Exercise1 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter an integer");
        int num = 2;

        for (int i = 2; i < 10000; i++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
            num++;
        }
    }
        static boolean isPrime(int num){
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
}
