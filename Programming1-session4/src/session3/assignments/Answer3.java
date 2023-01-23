package session3.assignments;
//Reads Celsius in double value from the console and converts it to Fahrenheit

import java.util.Scanner;

public class Answer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please input a temperature of Celsius. %n");
        double fah = scanner.nextDouble() * 1.8 + 32;
        System.out.printf("The Fahrenheit is %4.3f Celsius.", fah);
    }
}
