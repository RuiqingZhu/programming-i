package session7;

import java.util.Scanner;

/**
 * Take two numbers and return the sum of these numbers in the output
 */
public class Example {
    //method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number 1");
        int num1= scanner.nextInt();
        System.out.println("enter number 2");
        int num2 = scanner.nextInt();
//        String x = scanner.nextLine();
        //call by value
        int sum = customSumOfNumbers(num1, num2);
        System.out.println("number 1 after method  call " + num1);
        System.out.println("number 2 " + num2);
        //System.out.println(sum);
        customPrint(sum);
        //some code and later you want to again take 2 numbers and print sum of those numbers
        //DRY
    }

    //method is a structure that either does something for me and then return
    //in order to make my code structured
    //method can return something or return nothing !!!
    //method has a name
    //method has an argument empty or with a value
    static int customSumOfNumbers(int number1, int number2){
        //stack
        System.out.println("number1 is " + number1);
        System.out.println("number2 is " + number2);
        number1 = number1 * 10;
        number2 = number2 * 100;
        return number1 + number2;
    }

    static void customPrint(int number){
        System.out.printf("the result is your function is %d", number);
    }
}
