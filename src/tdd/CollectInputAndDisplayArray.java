package tdd;

import java.util.Scanner;

public class CollectInputAndDisplayArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] number = new int[3][7];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter three numbers for row " + (i + 1) + ": ");
            for (int j = 0; j < 3; j++) {
                number[i][j] = scanner.nextInt();
            }

            int sum = 0;
            int min = number[i][0];
            int max = number[i][0];

            for (int num : number[i]) {
                sum += num;
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
            }

            number[i][3] = sum;
            number[i][4] = sum / 3;
            number[i][5] = min;
            number[i][6] = max;
        }

        System.out.println("\nnumber :  sum :ave:min:max");
        for (int[] row : number) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}

