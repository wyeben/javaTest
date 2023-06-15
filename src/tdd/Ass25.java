package tdd;
import java.util.Scanner;
public class Ass25 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number:");
        int number = input.nextInt();

        if (number %3 ==0) {
            System.out.print("number is divisible by 3\n");
        }
        if (number != 3) {
             System.out.print("number is not equals to 3");
        }

    }
}
