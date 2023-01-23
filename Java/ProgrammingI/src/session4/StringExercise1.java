package session4;

//1- Ask user to enter a string
//If it ends with "ly" print true

//2- Given a string, if the string begins with "red" or "blue" print that color string, otherwise print false.

import java.util.Scanner;

public class StringExercise1 {
    //reddddd ==> red
    //gggred ==> false
    //blueXX ==> blue
    //XXblue ==> false
    public static void main(String[] args) {
//        System.out.println("Please enter a string");
//        Scanner input = new Scanner(System.in);
//        String userStr = input.nextLine();
//        int len = userStr.length();
//        char ch1 = userStr.charAt(len - 1);
//        char ch2 = userStr.charAt(len - 2);
//
//        if (ch1  ("y")),
//
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = input.next();
        //oddly -> true
        //y -> false
        //oddy -> false

        int size = str.length();
        if (size<2){
            System.out.println("false");
        }
        else{
            //check the last 2 characters of the string
            String sub = str.substring(size - 2);
//                str.endsWith("ly");
//                str.lastIndexOf("ly") == size - 2;
            if (sub.equals("ly")){
                System.out.println("TRUE");
            }
            else{
                System.out.println("FALSE");
            }
        }



        // The second one
        System.out.println("Please enter a new word with color");
        String colorName = input.next();
        if (colorName.startsWith("red") || colorName.startsWith("blue")){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
