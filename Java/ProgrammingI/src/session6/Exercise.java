package session6;
/**
 * * Write a program that displays the following table (note that 1 kilogram is 2.2 pounds):
 *  * Kilograms Pounds
 *  * 1 2.2
 *  * 3 6.6
 *  * ...
 *  * 197 433.4
 *  * 199 437.8
 */
public class Exercise {
    public static void main(String[] args) {
        for (int i=1; i<200; i=i+2){
            double pound = i*2.2;
            System.out.printf("%d %.1f%n", i, pound);
        }
    }
}
