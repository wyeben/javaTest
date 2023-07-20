package tdd;

import java.util.Scanner;

public class SumUp10ValidNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter 10 numbers between 0 and 100:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            int number = scanner.nextInt();

            if (number >= 0 && number <= 100) {
                sum += number;
            } else {
                System.out.println("Invalid number! Please enter a number between 0 and 100.");
                i--;
            }
        }
        System.out.println("The sum is: " + sum);

    }
}
