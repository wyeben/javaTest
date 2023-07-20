package tdd;

import java.util.Scanner;

public class CompareCosts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int price1 = input.nextInt();
        int price2 = input.nextInt();


        if (price2 > price1){
            System.out.println("package 2 has a better price");

        }

    }
}
