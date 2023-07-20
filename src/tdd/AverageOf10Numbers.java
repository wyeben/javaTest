package tdd;

import java.util.Scanner;

public class AverageOf10Numbers {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int sum = 0;

                System.out.println("Enter 10 numbers:");

                for (int i = 0; i < 10; i++) {
                    System.out.print("Number " + (i + 1) + ": ");
                    int number = scanner.nextInt();
                    sum += number;
                }

                double average = (double) sum / 10;

                System.out.println("The average is: " + average);
            }

        }

