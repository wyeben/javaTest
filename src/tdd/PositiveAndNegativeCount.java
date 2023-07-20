package tdd;

import java.util.Scanner;

public class PositiveAndNegativeCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int total = 0;
        int count = 0;

        System.out.println("Enter numbers (enter 0 to end):");
        int number;
        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            }

            total += number;
            count++;
        } while (number != 0);

        double average = (count > 1) ? (double) total / (count - 1) : 0;

        System.out.println("Positive count: " + positiveCount);
        System.out.println("Negative count: " + negativeCount);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        scanner.close();
    }
}

