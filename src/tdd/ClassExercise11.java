package tdd;

import java.util.Scanner;

public class ClassExercise11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       int sum = 0;

       for (int i = 0; i < 10;i++){
           System.out.println("Enter number"+(i+1)+":");
          int number = scanner.nextInt();

          if(number < 0){
              System.out.println("invalid number");
              i = 0;
          }else number ++;

          sum += number;
       }
       float average = sum/10;
        System.out.println("The sum is:"+sum+": "+"the average is:"+average);
    }
}
