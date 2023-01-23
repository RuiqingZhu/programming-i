package session3.examples;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        // a system for grading checks the grade in exam or homeworks
        //if one of them is greater than 60, means you pass
        System.out.println("please enter your final grade");
        Scanner input = new Scanner(System.in);
        int finalGrade = input.nextInt();
        System.out.println("please enter your homework grade");
        int homeworkGrade = input.nextInt();

//        if (finalGrade > 60){
//            System.out.println("you pass");
//        }
//        else if (homeworkGrade > 60){
//            System.out.println("you pass");
//        }
//        else{
//            System.out.println("you failed");
//        }

        // || LOGICAL OR
        if(finalGrade > 60 || homeworkGrade > 60){
            System.out.println("you pass");
        }
        else{
            System.out.println("you failed");
        }
    }
}
