package session4.examples;

import java.util.Random;

/**
 * (Random month) Write a program that randomly generates an integer
 * between 1 and 12 and displays the English month name January, February ... December
 * for the number 1, 2,3, ,... accordingly
 */
public class Example2 {
    public static void main(String[] args) {
        System.out.println("Welcome :)! To the random month generator!");

        Random random = new Random();
        int randomMonth = (int) (Math.random() * 12);

        String monthName = "";
        switch (randomMonth) {
            case 1:
                monthName = "January";
                break;
            case 2:
            case 3:
                monthName = "Feb";
                break;
            case 4:
                monthName = "Apr";
                break;
            case 5:
                monthName = "Feb";
                break;
            case 6:
                monthName = "Feb";
                break;
            case 7:
                monthName = "Feb";
                break;
            case 8:
                monthName = "Feb";
                break;
            case 9:
                monthName = "Feb";
                break;
            case 10:
                monthName = "Feb";
                break;
            case 11:
                monthName = "Feb";
                break;
            case 12:
                monthName = "Feb";
                break;
        }

        System.out.printf("The month you chose is %s", monthName);
    }
}
