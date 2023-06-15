package tdd;
import java.util.Scanner;
public class Ass24 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("please enter number1:");
        int number1 = input.nextInt();

        System.out.print("please enter number2:");
        int number2 = input.nextInt();

        System.out.print("please enter number3:");
        int number3 = input.nextInt();

        System.out.print("please enter number4:");
        int number4 = input.nextInt();

        System.out.print("please enter number5:");
        int number5 = input.nextInt();

        int smallest = number1;

        if (number2 < smallest){
            smallest = number2;
        }
        if (number3 < smallest){
            smallest = number3;
        }
        if (number4 < smallest){
            smallest = number4;
        }
        if (number5 < smallest){
            smallest = number5;
        }

        int largest = number1;
        if (number2 > largest){
            largest = number2;
        }
        if (number3 > largest){
            largest = number3;
        }
        if (number4 > largest){
            largest = number4;
        }
        if (number5 > largest){
            largest = number5;

        }
        System.out.printf("Smallest is: %d%n", smallest);
        System.out.printf("Largest is: %d%n", largest);
    }
}
