package tdd;

import java.util.Scanner;

public class AverageOfEvenScores {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int evenSum = 0;

        System.out.println("Enter 10 scores:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            int score = scanner.nextInt();

            if (score % 2 == 0) {
                evenSum += score;
            }
        }
            double average = (double) evenSum / 10;

        System.out.println("The average of even scores is: " + average);
    }
    }

