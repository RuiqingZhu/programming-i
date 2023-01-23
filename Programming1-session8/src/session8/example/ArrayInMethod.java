package session8.example;

import java.util.Scanner;

public class ArrayInMethod {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //send Array ref as an argument to the method

        //Create an array of chars from user input
        System.out.println("Ask use to enter the size of array");
        byte size = input.nextByte();
        char[] charArray = createArray(size);
        //show the chars
        printArr(charArray);
        //show the ascii number of each char
        showAsciiCodes(charArray);

        input.close();
    }

    static void showAsciiCodes(char[] charArray) {
        for(char ch: charArray){
            System.out.printf("%c -> %d  ", ch, (int)ch);
        }
        System.out.println();
    }

    static void printArr(char[] chars){
       for(char ch: chars){
           System.out.printf("%c ", ch);
       }
        System.out.println();
    }

    static char[] createArray(int length){
        char[] charArray = new char[length];
        System.out.printf("please enter %d characters and hit enter after each \n", length);
        for(int i=0;i< length; i++){
            char ch = input.next().charAt(0);
            charArray[i] = ch;
        }

        return charArray;

    }
}
