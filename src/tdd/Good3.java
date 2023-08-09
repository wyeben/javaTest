package tdd;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Good3 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int iteration = 20;

        for (int i = 0; i < iteration; i++) {
            System.out.print(">");
            Thread.sleep(10);

        }


        System.out.print("Enter a number: ");
        performNumberInput (scanner);
    }

    public static void checkNumberRange(int number) {
        if (number >= 0 && number <= 100) {
            System.out.println("Number is within the range of 0 to 100.");
        } else {
            System.out.println("Number is outside the range of 0 to 100. Please enter a new number.");
        }
    }

    public static void performNumberInput (Scanner scanner){
        try {
            int number = scanner.nextInt();

            checkNumberRange(number);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }
}
