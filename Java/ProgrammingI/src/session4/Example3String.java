package session4;

import java.util.Scanner;

public class Example3String {
    public static void main(String[] args) {
        String str1 = "test"; // string pool
        String str2 = new String("test"); // class instantiation
        // validate a string not containing some characters
        // validate the length of a string
        // make all the alphabets capital
        // check if the first char starts with a certain letter
        // check if a post code is J4M
        //......

        // Strings are immutable
//        String modifiedStr = str1.toUpperCase();
//        System.out.println("the main string " + str1);
//        System.out.println("the modified string " + modifiedStr);
//
        String name = "Reza Shalchian";
        //This name is an array of characters


        char ch = name.charAt(0);
        System.out.printf("the character in index 0 is %c %n", ch);
        ch = name.charAt(1);
        System.out.printf("the character in index 1 is %c %n", ch);
        int  len = name.length();
        System.out.printf("the length of the string is %d %n", len);
        // to find/print the last char in a string
        ch = name.charAt(len - 1);
        System.out.printf("the character in index %d is %c", len - 1, ch);

        ch = name.charAt(name.length() -1);


        System.out.println("Please enter a name");
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        if (line.contains("jac")){
            System.out.println("name has Reza in it");
        }

        String name1 = new String("Ali");
        String name2 = new String("John");

        int a = 1;
        int b = 2;

        if (a == b){
            System.out.println("they are equal");
        }

 //       if (name1 == name2) this is wrong. string can't use arithmetic operator. primitives can
        if (name1.equals(name2)){
            System.out.println("They are the same");
        }
        else{
            System.out.println("They are different");
        }
        //for string comparison, we use "equals" like the example above name1.equals(name2)
    }
}
