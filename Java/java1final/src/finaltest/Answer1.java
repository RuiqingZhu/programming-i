package finaltest;

import java.util.Scanner;

public class Answer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer greater than 0");
        int number = scanner.nextInt();
        printFactors(number);
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {

            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.print(i + "  ");
                }
            }
        }
    }
}

