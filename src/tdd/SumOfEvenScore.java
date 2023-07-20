package tdd;

import java.util.Scanner;

public class SumOfEvenScore {
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
        System.out.println("The sum of even scores is: " + evenSum);
}
}