package session2;

import java.util.Scanner;

//Reads Celsius in double value from the console and converts it to Fahrenheit
public class Assignment1CelsiusToFahrenheit {
    public static void main(String[] args) {
        System.out.println("What's the temperature now in Celsius?");
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();
        System.out.println(celsius + " Celsius is " + (celsius*9/5+32) + " Fahrenheit!");
    }
}
