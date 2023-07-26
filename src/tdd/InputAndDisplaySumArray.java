package tdd;
import java.util.Scanner;
public class InputAndDisplaySumArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] number = new int[4][3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter three numbers for row " + (i + 1) + ": ");
            for (int j = 0; j < 3; j++) {
                number[i][j] = (int) scanner.nextDouble();
                number[3][j] += number[i][j];
            }
        }

        System.out.println("\nnumbers:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(number[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
