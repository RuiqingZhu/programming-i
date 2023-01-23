package session3;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        //if() if + ( + statement + ) { }
        System.out.println("enter a number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        // if condition 1
        if(num > 5){
            System.out.println("it is greater than 5");
        }
        else { //NO
            System.out.println("it is equal or smaller");
        }

        // if condition 2
        if(num > 5){
            System.out.println("it is greater than 5");
        }
        else if(num < 5) {
            System.out.println("it is smaller than 5");
        }
        else {
            System.out.println("it is equal to 5");
        }
    }
}
