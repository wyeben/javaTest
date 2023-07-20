package tdd;

public class MethodSquareNumbers {
    public static int square(int number) {

        int result = 0;
    int count = number;

        while (count > 0) {
        result += number;
        count--;
    }

        return result;
}

    public static void main(String[] args) {
        int number = 5;
        int square = square(number);
        System.out.println("Square of " + number + " is: " + square);
    }
}

