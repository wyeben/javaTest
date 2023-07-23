package tdd;

import java.util.ArrayList;
import java.util.List;

public class NumberAndReturnList {
    public static List<Integer> digitsListV1(int number) {
        List<Integer> digits = new ArrayList<>();
        while (number > 0) {
            digits.add(0, number % 10);
            number /= 10;
        }
        return digits;
    }

    public static void main(String[] args) {
        int number = 2342;
        List<Integer> result = digitsListV1(number);
        System.out.println(result);
    }
}

