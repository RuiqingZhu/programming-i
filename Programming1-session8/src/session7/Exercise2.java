package session7;

/**
 * (Display patterns) Write a method to display a pattern as follows:
 * 1
 * 2 1
 * 3 2 1
 * .....
 * n n-1 n-2
 * <p>
 * the method header is public static void displayPattern(int n)
 * <p>
 * (Count the letters in a string) Write a method that counts the number of letters in
 * a string using the following header:
 * public static int countLetters(String s) str.length is not ok
 */

/**
 * (Count the letters in a string) Write a method that counts the number of letters in
 * a string using the following header:
 * public static int countLetters(String s) str.length is not ok
 */

import java.util.Scanner;

/**
 * (Display characters) Write a method that prints characters using the
 *  * following header:public static void printChars(char ch1, char ch2, int numberPerLine)
 *  * This method prints the characters between ch1 and ch2 with the specified numbers per
 *  * line.
 */
public class Exercise2 {
    public static void main(String[] args) {
        //instance method
        //you instantiate a class and call the method in that class;
//        Exercise1 exercise1 = new Exercise1(); //instantiate on object
//        exercise1.checkMe(); //calling an instance method

        Scanner input = new Scanner(System.in);
//        int x = input.nextInt();

//        System.out.println(Exercise1.isPrime(12)); //calling a static method
        System.out.println("how many line of numbers");
        int lineNumber = input.nextByte();
        displayPattern(lineNumber);

        System.out.println("Enter a range of character with how many letters per line");
        char ch1 = input.next().charAt(0);
        char ch2 = input.next().charAt(0);
        int lines = input.nextByte();
        printChars(ch1, ch2, lines);

        System.out.println("Please enter a string to know the count of letters");
        String str = input.next();
        System.out.println(countLetters(str));
    }

    public static void displayPattern(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printChars(char ch1, char ch2, int numberPerLine) {

        int counter = numberPerLine;
        if (ch1 > ch2) {
            System.out.println("please enter a correct range of charachter");
            System.exit(0);
        }
//        while(ch1<=ch2){
//            System.out.print(ch1 + " " + (int)ch1 + " ");
//            ch1 ++;
//            counter --;
//            if(counter == 0){
//                System.out.println();
//                counter = numberPerLine;
//            }
//        }
        int counter2 = 0;
        for (char ch = ch1; ch <= ch2; ch++) {
            System.out.print(ch + " ");
            counter2++;

            if (counter2 == numberPerLine) {
                //I need a condition to go the next line
                System.out.println();
                counter2  = 0;
            }
        }
    }

    public static int countLetters(String s) {
        int count = 0;
        for (int i=0; i< s.length(); i++){
            char ch = s.charAt(i);
            if (Character.isLetter(ch)){
                count++;
            }
        }
        return count;
    }
}
