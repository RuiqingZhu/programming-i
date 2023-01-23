package session8;

import java.util.*;

public class ArraysExercise1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of array");
        byte size = scanner.nextByte();
        double[] myList = new double[size];

        System.out.println("Please enter the numbers");

        //1
        for (int i = 0; i < myList.length; i++) {
            myList[i] = scanner.nextDouble();
        }

        //2
        for (int i = 0; i < myList.length; i++) {
            myList[i] = Math.random();
        }

        //3
        for (double number : myList) {
            System.out.println(number);
        }

//        for (int i = 0; i < myList.length; i++){
//            System.out.println(myList);
//        }   Why didn't this work?


        //4
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total = total + myList[i];
        }

        //enhanced for loop is to iterate through something iterable.
        // for example, for each element in myList[] array. an array is a collection of elements and this enhanced for loop iterates through all the elements.
        for (double number : myList) {
            total += number;
        }

        //5
        double biggest = myList[0];
        for (int i = 1; i < myList.length; i++){
            if (myList[i] > biggest){
                biggest = myList[i];
            }
        }
        System.out.println("the biggest is " + biggest);
    }
}
