package session3;
import java.util.Random;
import java.util.Scanner;

// generate two random numbers between 1 and 100
// ask user to guess the sum of them. if it was correct then print you are correct
public class RandomChecker {
    public static void main(String[] args) {
        // google generate random number in java
        // use random number generation
        //use if statement to check the result
        Random random = new Random();
        int x = random.nextInt(100);
        int y = random.nextInt(100);

        System.out.println("Please enter your guess of the sum:");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input == x + y){
            System.out.println("you are correct");
        }
        else{
            System.out.println("you are wrong");
        }
    }
}
