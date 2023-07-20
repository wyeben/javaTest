package tdd;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a name");
        String name = scanner.next();

        StringBuilder text  = new StringBuilder(name).reverse();

        System.out.println("the reversed is:"+text);

    }
}
