package tdd;

import java.util.Arrays;

public class SumOfNumbersInList {
    public static int[] canSumNumbers(int[] number) {
        int total = 0;
        for(int n:number){
            total += n;

        }
        return new int[]{total};
    }

    public static int[] calculateSum(int[] number) {
        int total = 0;
        int n = 0;
        while (n < number.length){
            total += number[n];
            n++;

        }
        return new int[]{total};

    }

    public static int[] canCalculateSum(int[] number) {
        int total = 0;
        int n = 0;
        do{
            total += number[n];
            n++;
        }while(n < number.length);
        return new int[]{total};
    }

    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};
        int[] cal = canSumNumbers(numbers);
        System.out.println(Arrays.toString(cal));
    }
}
