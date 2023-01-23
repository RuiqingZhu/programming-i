package session4.examples;

// 1- Ask user to enter a string
// if it ends with 'ly' print true

import java.util.Scanner;

//2 - Given a string, if the string begins with "red" or "blue" print that color string, otherwise print false.
public class StringExcercises {
    //reddddd => red
    //gggred => false
    //blueXX => blue
    //XXblue => false
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a value");
        String str = input.next();
        //oddly -> true
        //y -> false
        //oddy -> false

        int size = str.length();
        if(size < 2){
            System.out.println("false");
        }
        else{
            //check the last 2 chars of the string
            String sub = str.substring(size - 2);
//            str.endsWith("ly")
//            str.lastIndexOf("ly") == size - 2
            if(sub.equals("ly")){
                System.out.println("TRUE");
            }
            else{
                System.out.println("false");
            }
        }

        /// The second one
        System.out.println("please enter a new word with color");
        String colorName = input.next();
        if (colorName.startsWith("red") || colorName.startsWith("blue")){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
