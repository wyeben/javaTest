package tdd;

import java.util.Arrays;

public class ArrayImage1 {
    public static void main(String[] args) {

        char[][] aphabet = {
                {'x', 'o', 'x'}, {'o', 'o', 'x'}, {'o', 'x', 'x'}
        };

        for (char[] chars : aphabet) {
            for (char aChar : chars) {

                System.out.print(aChar+" ");
            }

        }
        System.out.println();
    }
}
