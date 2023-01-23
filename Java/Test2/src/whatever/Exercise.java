package whatever;

import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float n1 = input.nextFloat();
        float n2 = input.nextFloat();
        float n3 = input.nextFloat();
        int n4 = input.nextInt();

        System.out.println((n1+"x"+n2+"-"+n3+"x"+n4+"=")+(n1 * n2 - n3 * n4));
    }
}