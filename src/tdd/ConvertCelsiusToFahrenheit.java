package tdd;

import java.util.Scanner;

public class ConvertCelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a celsius:");
        double number = input.nextInt();

        double fahrenheit = (9.0/5)*number+32;


        System.out.print("celsius is:"+number +": and fahrenheit is:" +fahrenheit);
    }
}