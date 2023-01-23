package session4;

import java.util.Random;

/**
 * (Random month) Write a program that randomly generates an integer between 1 and 12 and displays the English month name January, February, ... December for the number 1, 2, 3, ... accordingly
 */
public class Example2RandomMonth {
    public static void main(String[] args) {
        Random random = new Random();
        int monthNumber = random.nextInt(12 - 1 + 1) + 1;

        System.out.println(monthNumber);

        switch (monthNumber) {
            case 1:
                System.out.println("It's January.");
                break;
            case 2:
                System.out.println("It's February.");
                break;
            case 3:
                System.out.println("It's March.");
                break;
            case 4:
                System.out.println("It's April.");
                break;
            case 5:
                System.out.println("It's May.");
                break;
            case 6:
                System.out.println("It's June.");
                break;
            case 7:
                System.out.println("It's July.");
                break;
            case 8:
                System.out.println("It's August.");
                break;
            case 9:
                System.out.println("It's September.");
                break;
            case 10:
                System.out.println("It's October.");
                break;
            case 11:
                System.out.println("It's November.");
                break;
            case 12:
                System.out.println("It's December.");
                break;
        }
    }
}
