package finaltest;

import java.util.Scanner;

public class Answer2 {
    public static void main(String[] str) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of students now: ");
        int numberOfStudents = scanner.nextInt();

        int[] scores = new int[numberOfStudents];
        System.out.println("Now enter 4 space separated scores: ");

        for (int i = 0; i < numberOfStudents; i++) {
            scores[i] = scanner.nextInt();
        }

        int bestScore = getTheBestScore(scores);
        System.out.println("the best score is:" + bestScore);
        analyzeScores(scores, bestScore);
    }

    public static int getTheBestScore(int[] scores) {
        int bestScore = 0;
        for (int i = 0; i < scores.length; i++) {
            int temp = scores[i];
            if (temp > bestScore) {
                bestScore = temp;
            }
        }
        return bestScore;
    }

    public static void analyzeScores(int[] scores, int bestScore) {

        for (int i = 0; i < scores.length; i++) {
            int temp = scores[i];
            String grade = "";
            if ((bestScore - temp) <= 10) {
                grade = "A";
            } else if ((bestScore - temp) > 10 && (bestScore - temp) <= 20) {
                grade = "B";
            } else if ((bestScore - temp) > 20 && (bestScore - temp) <= 30) {
                grade = "C";
            } else if ((bestScore - temp) > 30 && (bestScore - temp) <= 40) {
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.println("Student " + i + " score is " + temp + " and grade is " + grade);
        }
    }
}

