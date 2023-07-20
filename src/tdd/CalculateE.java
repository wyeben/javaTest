package tdd;

import java.util.Scanner;

public class CalculateE {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of terms to calculate e: ");
            int numTerms = scanner.nextInt();

            double e = 1;
            double factorial = 1;

            for (int i = 1; i <= numTerms; i++) {
                factorial *= i;
                e += 1 / factorial;
            }

            System.out.println("Estimated value of e: " + e);
            System.out.println("Actual value of e: " + Math.E);
        }
    }

