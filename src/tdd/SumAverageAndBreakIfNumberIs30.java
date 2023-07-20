package tdd;

import java.util.Scanner;

public class SumAverageAndBreakIfNumberIs30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        System.out.println("enter 10 valid scores");

        int count = 0;
        while(count <= 9){
            System.out.println("score"+ (count+1)+ ":");
            int score = scanner.nextInt();

            if(score ==30){
                System.out.println("enter a valid number");
                count = 0;
            }else{
                count++;
                sum += score;
            }
        }
        System.out.println("the sum of valid scores is:" + sum);
    }
}
