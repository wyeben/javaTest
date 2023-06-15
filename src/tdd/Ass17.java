package tdd;
import java.util.Scanner;
public class Ass17 {


        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            System.out.print("Enter first number");
            int number1 = input.nextInt();

            System.out.print("Enter second number");
            int number2 = input.nextInt();

            System.out.print("Enter third number");
            int number3 = input.nextInt();

            int sum = number1+number2+number3;
            int average = sum/3;
            int product = number1*number2*number3;
            int smallest;
            int largest;

            smallest = number1;
            if (number2 < number1){
                smallest = number2;
            }

            if (number3 < number2){
                smallest = number3;
            }

            largest = number1;
            if (number2 > number1){
                largest = number2;
            }
            if (number3 > number2){
                largest = number3;
            }

            System.out.printf("Sum is: %d%n", sum);

            System.out.printf("Average is: %d%n", average);

            System.out.printf("Product is: %d%n", product);

            System.out.printf("Smallest is: %d%n", smallest);

            System.out.printf("Larest is: %d%n", largest);
        }
    }

