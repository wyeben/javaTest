package tdd;

import java.util.Scanner;

public class AverageOfValidScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter 10 scores:");

        int count = 0;
        while (count < 10) {
            System.out.print("Score " + (count + 1) + ": ");
            int score = scanner.nextInt();

            if (score >= 0 && score <= 100) {
                sum += score;
                count++;
            } else {
                System.out.println("Invalid score! Please enter a number between 0 and 100.");
            }
        }

        double average = (double) sum / 10;

        System.out.println("The average of valid scores is: " + average);
    }
}