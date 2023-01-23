package session3.examples;

import java.util.Scanner;

public class BooleanExample {
    public static void main(String[] args) {

        // you can do a check and put the result of condition into a variable
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean checkEven = false;

        //12, 14, 46
        if (num % 2 == 0){
            checkEven = true;
//            System.out.println("the number is even");
        }

        // you want to do some action or function.... with checkEven
//        if (checkEven == true){
        if (checkEven){
            ///DO something
            System.out.println("it is an even number");
        }

        // ! used for making the boolean opposite
        if (!checkEven){
            ///DO something
            System.out.println("it is an even number");
        }

        double dx = 123.44;
        float fdx = (float)dx; //casting
        short sdx = (short)dx;

        String ss = "test";
//        int number = Integer.parseInt(ss); // run time exception
        //compile time exception
        //run time exception (error)


    }
}
