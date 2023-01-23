package session2;

import java.math.BigInteger;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Please enter your firstname and last name separated by space");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age");
        int age = scanner.nextInt();

        //Numbers without floating points:

        //byte -> 1 byte memory usage>>> -128 to 127
        byte num1 = -12;
        num1 = Byte.MIN_VALUE; // -128 //byte and Byte are different
        num1 = Byte.MAX_VALUE; // 127
        //short -> 2 bytes memory usage>>> -32768 to 32767
        short num2 = 2;
        //int -> 4 bytes memory usage>>>
        int num3 = 1111111111;
        //long -> 8 bytes memory usage>>>
        long num4 = 2222222222222222222L; // needs an "L" at the end otherwise long will be treated the same as int

    //    BigInteger bigNumber = new BigInteger("3333333333333333");

        //Numbers with floating points

        //float -> 4 bytes memory usage
        float num5 = 4.5f; //it needs an "f" at the end
        //double -> 8 bytes memory usage
        float f = (float)  4.5; // it casts the double 4.5 to float 4.5 -> 4.5f
        double num6 = 333333.5;
        double num7 = 333333.5d; //it may or may not have a "d" at the end


        //Write a program to print the min and max of all the data types we learned today.
        //byte, short, int, long, float, and double

        num1 = Byte.MIN_VALUE;
        System.out.println(num1);
        num1 = Byte.MAX_VALUE;
        System.out.println(num1);
        num2 = Short.MIN_VALUE;
        System.out.println(num2);
        num2 = Short.MAX_VALUE;
        System.out.println(num2);
        num3 = Integer.MIN_VALUE;
        System.out.println(num3);
        num3 = Integer.MAX_VALUE;
        System.out.println(num3);
        num4 = Long.MIN_VALUE;
        System.out.println(num4);
        num4 = Long.MAX_VALUE;
        System.out.println(num4);
        num5 = Float.MIN_VALUE;
        System.out.println(num5);
        num5 = Float.MAX_VALUE;
        System.out.println(num5);
        num6 = Double.MIN_VALUE;
        System.out.println(num6);
        num7 = Double.MAX_VALUE;
        System.out.println(num6);


        char ch = 'z';

        boolean flag; // initialization
        //TRUE or FALSE (key word is "if")
        flag = true;
        flag = false;
        flag = 3<5; //conditions < > ==

        System.out.println(flag);

        String s1 = new String("Whoe let the dogs out?");
        String s2 = "Who who who who!";
        String s3 = s1 + s2;
        //sout = system.out.println
        System.out.println(s3);
    }
}
//System.out.println("Please enter your firstname and last name separated by space");
// Scanner scanner = new Scanner(System.in);
//String nameByUser = scanner.nextLine();
//
//System.out.println("Please enter your firstname and last name separated by space");
//String fname = scanner.nextLine();
//String lname = scanner.nextLine();
//
//
//String name1 = "A";
//String _name2 = "B";
//String $name3 = "C";
//
//name1 = "AA";
//
//
//String fname = "Reza"; //variable definition and instantiation
////it has an address -> X0000000025
//System.out.print(fname + "\n");
//fname = "Jack";
//System.out.print(fname + "\t" + "is here");
//String lname; //define
//lname = "Shalchian"

