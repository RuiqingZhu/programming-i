package session6;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        /**
         *  (Count positive and negative numbers and
         *  * compute the average of numbers) Write a program that reads an
         *  * unspecified number of integers, determines how many positive
         *  * and negative values have been read, and computes the total and average
         *  * of the input values (not counting zeros). Your program ends with the input 0.
         *  * Display the average as a floating-point number.
         *  * If your entire input is 0, the program displays No numbers are entered except 0.
         */

        int pos = 0;
        int neg = 0;
        double total = 0;
//        double ave = 0; // this variable needs to be defined in the if condition when "counter" increments
        int counter = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter as many integers as you like, positive or negative, until you enter a '0'");

        int number = input.nextInt();

        while (number != 0){
            total += number; //total = total + number;
            counter++; //count 1 more time

            if (number > 0){
                // pos += pos;
                // what's the diff between pos += pos and  ------ Now I understand it. we are looking for the number of positive numbers here so we need pos + 1 each time, which is pos++ in syntax. Whereas pos += pos means pos = pos + pos which results in total value of the values of both pos, for example if i enter 3 and 4, pos+=pos will give me 7 whereas pos++ will be 2.
                 pos++;
            }
//            if (number < 0){ // what if I use else instead of if (number < 0) here?
            else{
                // neg += neg;
                // what's the diff between neg += neg and
                 neg++;
            }
            System.out.println("Please enter more numbers"); // if run from here without the following line, it will be an infinite loop because variable "number" will always be !=0 if I enter for example, 3. And the script will keep running to print "Please enter more numbers". I need to update the variable "number in the next line for the loop to go back to line27 to continue running.
            number = input.nextInt();
        }
        if (counter > 0){
            double ave = total / counter;
            System.out.println("the number of positives is " + pos);
            System.out.println("the number of negatives is " + neg);
            System.out.println("the total is " + total);
            System.out.println("the average is " + ave);

        }
        else{
            System.out.println("No numbers entered.");
        }

    }
}
