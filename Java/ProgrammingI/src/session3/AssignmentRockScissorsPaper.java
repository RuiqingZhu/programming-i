package session3;
// Write a program that plays the popular
// scissor-rock-paper game. (Scissors can cut a paper, a rock can knock scissors
// , and a paper can wrap a rock.)
// The program randomly generates a number 0, 1, or 2 representing scissor,
// rock, and paper. The program prompts the user to enter a number 0, 1, or 2
// nd displays a message indicating whether the user or the computer wins,
// loses, or draws.
//
// Here are sample runs: scissor (0), rock (1), paper (2): 1 The computer is
// scissored. You are rock. You won

import java.util.Random;
import java.util.Scanner;

public class AssignmentRockScissorsPaper {
    public static void main(String[] args) {
        Random compRandNum = new Random();
        int x = compRandNum.nextInt(3);

        System.out.println("Please enter a number 0 or 1 or 2");
        Scanner input = new Scanner(System.in);
        int y = input.nextInt(3);

        if (x == 0 && y == 1) {
            System.out.println("You won!");
        } else if (x == 0 && y == 2) {
            System.out.println("You lost!");
        } else if (x == 0 && y == 0) {
            System.out.println("It's a draw!");
        } else if (x == 1 && y == 0) {
            System.out.println("You lost!");
        } else if (x == 1 && y == 1) {
            System.out.println("It's a draw!");
        } else if (x == 1 && y == 2) {
            System.out.println("You won!");
        } else if (x == 2 && y == 0) {
            System.out.println("You won!");
        } else if (x == 2 && y == 1) {
            System.out.println("You lost!");
        } else if (x == 2 && y == 2) {
            System.out.println("It's a draw!");
        }

    }


}
