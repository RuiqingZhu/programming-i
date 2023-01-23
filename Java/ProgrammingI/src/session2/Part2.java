package session2;

import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        char ch = 'A';
        System.out.println(ch);
        System.out.println((int)ch);

        boolean flag; // initialization
        //TRUE or FALSE (key word is "if")
        flag = true;
        flag = false;
        flag = 3<5; //conditions < > ==

        System.out.println(flag);

        String s1 = new String("Whoe let the dogs out?"); //constructor
        String s2 = "Who who who who!";
        String s3 = s1 + s2;
        //sout = system.out.println
        System.out.println(s3);

        int result = 12 + 15 * 19;
        System.out.println(result);
        //precedence
        result = (12 + 15) * 19;
        System.out.println(result);

        //++ --
        int counter = 12;
       // counter = counter + 1;
        //counter ++;
        counter = ++counter;
        System.out.println(counter);

        //1. Get the length of the rectangle.
        //2. Get the width of the rectangle.
        //3. Find the perimeter using the following equation:
        //    perimeter = 2 x (length + width)
        //4. Find the area using the following equation:
        //    area = length x width
        //5. Print the result in the output.

        Scanner areaRectangle = new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle:");
        int length = areaRectangle.nextInt();
        System.out.println("Please enter the width of the rectangle:");
        int width = areaRectangle.nextInt();
        System.out.println("The perimeter of the rectangle is "+2*(length+width));
        System.out.println("The area of the rectangle is "+length*width);


    }
}
