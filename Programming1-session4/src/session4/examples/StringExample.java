package session4.examples;

import java.util.Locale;
import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        String str1 = "test"; //string pool
        String str2 = new String("test"); // class instantiation

        // check if it contains a char
        // check the length of a string
        // make all the alphabet capital
        // check if the first character starts with J code postal J4M
        // ......

        // STRINGS are immutable
//        System.out.println("the main string " + str1);
//        String modifiedStr = str1.toUpperCase();
//        System.out.println("the main string " + str1);
//        System.out.println("the modified string " + modifiedStr);
//
//        str1  = str1.concat(" code ");
//        System.out.println("after calling concat ");
//        System.out.println("the main string " + str1);
//        System.out.println("the modified string " + str1);
//        https://www.javatpoint.com/immutable-string

        String name = "Reza Shalchian";
        //this name is an array of characters

        char ch = name.charAt(0);
        System.out.printf("the character in index 0 is %c%n", ch);
        ch = name.charAt(1);
        System.out.printf("the character in index 1 is %c%n", ch);
        int len = name.length();
        System.out.printf("the length of string is %d%n", len);
        ch = name.charAt(len - 1);
        System.out.printf("the character in index %d is %c", len - 1, ch);

        ch  = name.charAt(name.length() - 1);


        System.out.println("Please enter a name");
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        if (line.contains("jac")){
            System.out.println("name contains jac");
        }

        String name1 = new String("Ali");
        String name2 = new String("Ali");

//        String name1 = "Ali";
//        String name2 = "Ali";

        int a = 1;
        int b = 2;

        if (a==b){
            System.out.println("they are equal");
        }

        //        if(name1 == name2){ // we must not use == to compare string... to compare objects we dont use ==
        if (name1.equals(name2)){
            System.out.println("They are the same");
        }
        else{
            System.out.println("They are the different");
        }

        // for string comparing we use equals

    }
}
