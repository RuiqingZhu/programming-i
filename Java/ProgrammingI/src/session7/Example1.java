package session7;

/**
 * Take 2 numbers and return the sum of these numbers in the output
 */

import java.util.Scanner;

public class Example1 {
    // method
    // method in java is like function in other programming languages.
    // A METHOD BASICALLY IS A FUNCTION
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number 1");
        int num1 = scanner.nextInt();
        System.out.println("please enter number 2");
        int num2 = scanner.nextInt();
        int sum = sumOfNumbers(num1, num2); // because this method has been defined below in line 31 as a static method, therefore this method can be used anywhere in this class (the Example1 class).
        int customSum = customSumOfNumbers(num1, num2);
        System.out.println(sum);
        customPrint(sum);

        //Some code and later you want to again take 2 numbers and print their sum
        // a coding principle: DRY --> Don't Repeat Yourself
    }

    // a method is a structure that will either do something for me and then return, in order to make my code structured
    // a method can return something (with a return statement) or return nothing (using "void" in the method)!!! important!!!
    // a method has a name
    // a method has an argument (empty like System.out.println(); where it's empty in the brackets; or with a value like System.out.println(num1 + num2);

    // Now to define a method:
    static int sumOfNumbers(int num1, int num2){ // this is defining the method as a static method so that it (sumOfNumbers) can be used elsewhere in this class (Example1)
        return (num1 + num2);
    }


    // in the new method there can be many lines of code, in order for the same code to be used elsewhere in the same class, it's better to create a method and then use the method instead, for example: below has 4 lines of code to return num1 times 10 plus num2 times 100. Once this method is defined, we can then simply use the method "customSumOfNumbers" instead writing these 4 lines of code again.
    static int customSumOfNumbers(int num1, int num2){
        num1 = num1 * 10;
        num2 = num2 * 100;
        return num1 + num2;
    }


    // a method can also return nothing by using void
    static void customPrint(int number){ // void means nothing will be returned. you just want to do something like print onto screen, but don't need any data to be returned and re-used.
        System.out.printf("the result of your function is %d%n", number); // once this method is defined, elsewhere in this class when we want to do System.out.printf("the result of your function is %d%n", number);, we can simply do customPrint(int number) instead. for example, line 23, which means the same as line 22 but is using this new custom method.
    }


}

