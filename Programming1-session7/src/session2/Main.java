package session2;


import java.math.BigInteger;
import java.util.Scanner;
//import java.lang.*; // default

public class Main {
    public static void main(String[] args) {
        //add your code
//        Write a program to enter your name and family name in the first line by asking from user(you)
//                you get the information from input and use it to print the result in the output
//        and in the second line you will print, I love programming
//        and in the third line you will print, I study in JohnAbbott
//        Please enter your age

        //I need fname and lname
        //take some informationa and keep it for me somewhere
        //Computer : ????????? ok good but what is the type you desire

        ///STRing !!!!
        /*
        String fname = "Reza"; //variable definition and instantiation
        //it has an address -> X000000025
        System.out.print(fname + "\n");
        fname  = "Jack";
        System.out.print(fname + "\t" + "is here");
        String lname; // define
        lname = "Shalchian";

        */

//        System.out.println("Please enter your firstname and lastname seperated by space");
        Scanner scanner = new Scanner(System.in);
//        String nameByUser = scanner.nextLine();

        System.out.println("Please enter your firstname");
        String fname= scanner.nextLine();
        System.out.println("Please enter your lastname");
        String lname= scanner.nextLine();
        //CamelCase -> starts by smallLetter and follows by Capital letter when it has a new word
        // We can start an identifier by letters, underscore or dollarsign
        //Some examples
        String name1 = "A";
        String _name2 = "B";
        String $name3 = "C";
        name1 = "AA";


//        System.out.println("The Name you entered --> " + nameByUser);

        System.out.println("The Name you entered --> " + fname + " " + lname);

        System.out.println("Please enter your age");
        int age = scanner.nextInt();

        //Number types primitive
        //byte -> 1 byte -128 to 127
        byte num1 = -100;
        num1 = Byte.MIN_VALUE; // -128
        num1 = Byte.MAX_VALUE; // 127
        //short -> 2 bytes -32768 to 32767
        short num2 = 2;
        //Casting happens and converts integer to short
//        num2 = Short.MA
        //int -> 4bytes
        int num3 = 444444444;
        //long -> 8 bytes -> we need to add L at the end of a long variable
        long num4 = 333333332444L;

//        BigInteger bigNumber = new BigInteger("333333332222"); -> General knowledge

        //Numbers with floating point
        //float-> 4 bytes 2.3
        float num5 = 4.5f;
        float f = (float) 4.5; // it casts the double 4.5 to float 4.5 -> 4.5f
        //double -> 8 bytes
        //by default d is added to a double number
        double num6 = 44444.5;

        //Write a program to Print the min and max of All the data types we learned today
        //byte, short, int, long, float and doubl

    }
}
