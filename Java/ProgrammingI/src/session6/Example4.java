package session6;

/**
 * Write a program that prints the characters in
 * the ASCII character table from ! to ~. Display ten characters per line.
 */

import java.util.Scanner;

/**
 * Write a program that prompts
 *  * the user to enter a string and displays the string in reverse order.
 */
public class Example4 {
    public static void main(String[] args) {
        int counter = 0;

//        for (int i = 33; i <= 126; i++){
//            char asciiValue = (char)i;
//            System.out.print(asciiValue + " ");
//            counter ++;
//            if (counter == 10){
//                System.out.println();
//                counter = 0;
//            }
//        }



        // But if I don't have the table and don't know the ascii value of "!" (33) and "~" (126), I can do the following
        System.out.println();
        System.out.println("other way");
        System.out.println();
        int start = '!';
        int end = '~';


        for (int i = start; i <= end; i++){
            System.out.print((char)i + " ");
            counter++;

            if (counter == 10){
                System.out.println();
                counter = 0;
            }
        }


        //exercise 2 reverse string
        System.out.println("Please enter a string");
        Scanner input = new Scanner(System.in);

        String str = input.next();
        for (int i = str.length() - 1; i >= 0; i--){ // we assign the length of the string to variable i. Length is counted from 1 so for example string "Test" has 4 letters so its length is 4. The next line assigns i which in this case is the string length which is 4, to the variable "ch" and tells it that the character "ch" is at the i position. In this case i = 4 so it's the fourth position. However, since characters are positioned from 0 so 4 characters would be 0, 1, 2, 3 therefore the length number 4 doesn't exist and cannot be assigned to ch = str.charAt(). Therefore we need to let str.length() - 1.
            char ch = str.charAt(i);
            System.out.print(ch);
        }

    }
}
