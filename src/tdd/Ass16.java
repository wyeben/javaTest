package tdd;
import java.util.Scanner;
public class Ass16 {


        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            System.out.print("Enter first integer:");
            int number1 = input.nextInt();


            int numberSquare = number1*number1;
            int americana = numberSquare + number1;

            if  (americana > 100){
                System.out.printf("%d > %d%n", americana, 100);
            }

            if (americana == 100){
                System.out.printf("%d =%d%n", americana, 100);
            }

            if (americana != 100){
                System.out.printf("%d != %d%n", americana, 100);
            }

            if (americana < 100){
                System.out.printf("%d < %d%n", americana, 100);
            }

        }

    }


