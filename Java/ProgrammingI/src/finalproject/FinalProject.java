package finalproject;

import java.util.Arrays;
import java.util.Scanner;

public class FinalProject {
    public static void main(String[] args) {
        System.out.println("Answer 1 pattern a:");
        numberPatternA();
        System.out.println("Answer 1 pattern b:");
        numberPatternB();
        System.out.println("Answer 1 pattern c: ");
        numberPatternC();
        System.out.println("Answer 1 pattern d: ");
        numberPatternD();
        System.out.println("Answer 1 pattern e: ");
        numberPatternE();
        System.out.println("Answer 2: ");
        numberTable();
        System.out.println("Answer 3: ");
        sumOfElements();
        System.out.println("Answer 4: ");
        replaceCharInString();
        System.out.println("Answer 5: ");
        sameBeforeAndAfterStar();
        System.out.println("Answer 6: ");
        elementInEveryPair();
        System.out.println("Answer 7: ");
        bigDiff();
        System.out.println("Answer 8: ");
        equals();
        System.out.println("Answer 9: ");
        sortStudents();


    }

    public static void numberPatternA() {

        int number;
        for (int i = 0; i < 5; i++) {
            number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    public static void numberPatternB() {
        int number;
        for (int i = 0; i < 6; i++) {
            number = 1;
            for (int j = i; j < 6; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    public static void numberPatternC() {
        int number;
        for (int i = 1; i < 6; i++) {
            number = 1;
            for (int j = i; j < 6; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    public static void numberPatternD() {
        int number;
        for (int i = 0; i < 6; i++) {
            number = 1;
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < 6; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    public static void numberPatternE() {
        for (int i = 1; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void numberTable() {
        int arr[][] = {
                {1, 1, (int) Math.pow(1, 1)},
                {2, 2, (int) Math.pow(2, 2)},
                {3, 3, (int) Math.pow(3, 3)},
                {4, 4, (int) Math.pow(4, 4)},
                {5, 5, (int) Math.pow(5, 5)},
                {6, 6, (int) Math.pow(6, 6)},
                {7, 7, (int) Math.pow(7, 7)}
        };
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sumOfElements() {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int biggest = arr[0];
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > biggest) {
                biggest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("The biggest element is " + biggest);
        System.out.println("The smallest element is " + smallest);
        System.out.println("The sum of the biggest and the smallest elements is " + (biggest + smallest));
    }

    public static void replaceCharInString() {
        System.out.println("Please enter a string:");
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        System.out.println("Please enter a non-empty word:");
        String str2 = scanner.next();
        String str3 = str1.replaceAll("[^" + str2 + "]", "+");
        System.out.println(str3);
    }

    public static boolean sameBeforeAndAfterStar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string with a star in between letters:");
        String str = scanner.next();
        boolean isSame = true;
        for (int i = 0; i < str.length(); i++) {
            String tempStr = str.substring(i, i+1);
            if (tempStr.equals("*") && i > 0 && i < (str.length() -1)) {
                if (str.charAt(i - 1) == str.charAt(i + 1)) {
                    isSame = true;
                }
                else {
                    isSame = false;
                }
            }
        }
        System.out.printf("The characters around the * in %s are the same. --> %b\n", str, isSame);
        return isSame;
    }

    public static boolean elementInEveryPair() {
        Scanner scanner = new Scanner(System.in);

        boolean isEverywhere = true;

        System.out.println("Please enter some space separated single characters:");
        char ch[] = scanner.nextLine().toCharArray();
        System.out.println("Please enter one of the characters you just entered:");
        char ch1 = scanner.nextLine().charAt(0);

        for (int i = 0; i < ch.length; i+=2) {
            if (ch[i] == ch1) {
                isEverywhere = true;
            }
            else {
                isEverywhere = false;
            }
        }
        System.out.println(ch1 + " is everywhere --> " + isEverywhere);
        return isEverywhere;
    }

    public static void bigDiff() {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[4];
        System.out.println("Please enter 4 integers: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int biggest = arr[0];
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > biggest) {
                biggest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.printf("The difference between the largest integer (%d) and the smallest integer (%d) in the array is %d\n", biggest, smallest, (biggest - smallest));
    }

    public static boolean equals() {
        Scanner scanner = new Scanner(System.in);
        boolean isIdentical = true;
        System.out.println("Please enter the number of integers for each list: ");
        int n = scanner.nextInt();
        System.out.println("Please enter " + n + " integers for the first list and " + n + " integers for the second list: ");
        int[] list1 = new int[n];
        int[] list2 = new int[n];

        for (int i = 0; i < list1.length; i++) {
            list1[i] = scanner.nextInt();
        }
        for (int j = 0; j < list2.length; j++) {
            list2[j] = scanner.nextInt();
        }

        Arrays.sort(list1);
        Arrays.sort(list2);
        if (Arrays.equals(list1, list2)) {
            System.out.println("Two lists are identical.");
            return isIdentical;
        }
        else {
            System.out.println("Two lists are not identical.");
            return !isIdentical;
        }
    }

    public static void sortStudents() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        String[] students = new String[scanner.nextInt()];
        int[] scores = new int[students.length];

        System.out.println("Enter the name and the score for each student: ");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + ": ");
            students[i] = scanner.next();
            System.out.println("Score: ");
            scores[i] = scanner.nextInt();
        }

        for (int i = 0; i < scores.length; i++) {
            int max = scores[i];
            int maxIndex = i;
            String temp;

            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] > max) {
                    max = scores[j];
                    maxIndex = j;
                }
            }

            if (maxIndex != i) {
                temp = students[i];
                students[i] = students[maxIndex];
                students[maxIndex] = temp;

                scores[maxIndex] = scores[i];
                scores[i] = max;
            }
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + "'s score is: " + scores[i]);
        }
    }

}
