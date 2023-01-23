package session3;

import java.util.Scanner;

public class ConditionExample1 {
    public static void main(String[] args) {
        //The system is a bar age checking system
        //if you are between 18 and 60 you are allowed to arrive
        //otherwise gives an error that not allowed

        System.out.println("please enter your age");
        Scanner input = new Scanner(System.in);
        byte age = input.nextByte();
        // >= --> greater or equal
        // <= --> smaller or equal
//        if (age >= 18){
//            if(age <= 60) {
//                System.out.println("you are allowed");
//            }
//        }
//        else {
//            System.out.println("you are not allowed");
//        }
        if (age >= 18 && age <= 60){
            System.out.println("you are allowed");
        }
        else{
            System.out.println("you are not allowed");
        }
    }
}
