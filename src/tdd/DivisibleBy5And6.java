package tdd;

import java.util.Scanner;

public class DivisibleBy5And6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();


        boolean divisibleBy5And6 = (number % 5 == 0) && (number % 6 == 0);
        boolean divisibleBy5Or6 = (number % 5 == 0) || (number % 6 == 0);
        boolean divisibleBy5Or6ButNotBoth = divisibleBy5Or6 && !(divisibleBy5And6);

        System.out.println("Divisible by 5 and 6: " + divisibleBy5And6);
        System.out.println("Divisible by 5 or 6: " + divisibleBy5Or6);
        System.out.println("Divisible by 5 or 6, but not both: " + divisibleBy5Or6ButNotBoth);


    }
}
