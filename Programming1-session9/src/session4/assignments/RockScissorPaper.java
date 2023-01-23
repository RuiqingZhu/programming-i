package session4.assignments;

import java.util.Random;
import java.util.Scanner;

public class RockScissorPaper {

    /**
     * this is also java doc
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("enter a number: 0 (scissor), 1 (paper), 2 (rock)");
        Scanner in = new Scanner(System.in);
        int playerChoice = in.nextInt();
        //System.out.println(playerChoice);

        //validation
        if(playerChoice == 0 || playerChoice == 1 || playerChoice == 2){
            Random random = new Random(); //instantiate an object of class Random
            int compChoice = random.nextInt(3); // use the object and call the method nextInt with the proper argument

            //switch case
            switch (playerChoice){
                case 0:
                    if (compChoice == 0) {
                        System.out.println(" You chose scissors and computer chose scissors. The game ends in a draw");
                    }
                    else if (compChoice == 1) {
                        System.out.println("You chose scissors and computer chose paper. You win!");
                    }
                    else {
                        System.out.println("You chose scissors and computer chose rock., You lose");
                    }
                    break;
                case 1:
                    System.out.println("you chose paper");
                    if(compChoice == 0){
                        System.out.println("You lose");
                    }
                    else if(compChoice == 1){
                        System.out.println("The game ends in a draw");
                    }
                    else{
                        System.out.println("You win!");
                    }
                    break;
                case 2:
                    System.out.println("you chose rock");
                    if(compChoice == 0){
                        System.out.println("You win!");
                    }
                    else if(compChoice == 1){
                        System.out.println("You lose");
                    }
                    else {
                        System.out.println("The game ends in a draw");
                    }
                    break;
            }
        }
        else{
            System.out.println("You have wrong input");
        }

        //DRY => Dont repeat yourself
        //LAZINESS -> try to summerize
    }
}
