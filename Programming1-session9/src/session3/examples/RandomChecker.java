package session3.examples;

import java.util.Random;
import java.util.Scanner;

//generate two random numbers between 1 and 100 exclude 100
//        ask user to guess the sum of them. if it was correct then print You are correct!
public class RandomChecker {
    public static void main(String[] args) {
        //https://www.javatpoint.com/how-to-generate-random-number-in-java
        //or any other link

        //use random number generation
        // use if statement to check the result
        double random1 = Math.random();
        int randomNumber1LessThan100 = (int)(random1 * 100);
        double random2 = Math.random();
        int randomNumber2LessThan100 = (int)(random2 * 100) ;

        System.out.println("please guess a number");
        Scanner in = new Scanner(System.in);
        int result = randomNumber1LessThan100 + randomNumber2LessThan100;
//        System.out.println(result);
        short guess = in.nextShort();

        if(guess == (randomNumber1LessThan100 + randomNumber2LessThan100)){
            System.out.println("you are lucky");
        }
        else{
            System.out.println("not this time !!!");
        }

            //generate numbers between 1 and 100 by using Random class
//        https://www.geeksforgeeks.org/java-util-random-nextint-java/
//        Random random = new Random(1);
//        int nxt = random.nextInt(100);
    }
}
