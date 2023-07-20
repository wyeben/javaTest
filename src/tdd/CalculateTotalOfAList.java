package tdd;

import java.util.Arrays;

public class CalculateTotalOfAList {
    public static int[] calculateTotal(int[] number) {
        int total = 0;
        for(int num:number){
            total += num;
        }
        return new int[]{total};

    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,4,5};
        int[] calculate = calculateTotal(numbers);
        System.out.println(Arrays.toString(calculate));

    }
}
