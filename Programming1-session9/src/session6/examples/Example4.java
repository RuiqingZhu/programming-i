package session6.examples;

/**
 * Write a program that prints the characters in
 * the ASCII character table from ! to ~. Display ten characters per line.
 */

/**
 * Write a program that prompts
 *  * the user to enter a string and displays the string in reverse order.
 */
public class Example4 {
    public static void main(String[] args) {
        //Sting is an array of character
        //char x = '!';
        int start = '!'; // each character has an ascii number
        int end = '~';

        int counter = 0;
        for (int i=start;i<=end;i++){
            //System.out.printf(" ' %c-> %d '",(char)i, i);
            counter ++;

            if(counter == 10){
                System.out.println();
                counter = 0;
            }
        }

        //Reverse a string
        String str = "Test";
//        String reversedStr = "";
        for(int i=str.length() - 1; i>=0; i--){
            char ch = str.charAt(i);
            System.out.printf("the character %c is in index %d%n", ch, i);
            //reversedStr += ch;
            System.out.print(ch);
        }
//        System.out.println(reversedStr);
    }
}
