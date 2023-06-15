package tdd;
import java.util.Scanner;
public class Ass26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number");
          int num1 = input.nextInt();

         System.out.print("Enter another number");
           int num2 = input.nextInt();

          int number1 = num1 + num1 + num1;
          int number2 = num2 + num2;

          if (number1 % number2 == 0) {
              System.out.printf("%d%n number1 is a multiple of number2", number1, number2);
          }
         else
             System.out.print("number1 is not a multiple of number2");

        // System.out.printf("%d%n", number1, number2);
    }
}