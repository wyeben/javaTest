package tdd;
import java.util.Scanner;
public class SumOf10EvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int evenSum = 0;

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                evenSum += number;
            }
        }
        System.out.println("The sum of even numbers is: " + evenSum);
    }
}
