package tdd;

import java.util.Arrays;

public class ReverseList {
    public static int reverse(int[] number){

       int reversed = number.length;

       for(int y = 0;y < reversed / 2;y++){
           int current = number[y];
           number[y] = number[reversed-y-1];
           number[reversed-y-1] = current;
       }

       return reversed;
    }

    public static void main(String[] args) {

        int [] number = {0,1,2,3,4,5};
        reverse(number);
        System.out.println("The reverse list is:"+ Arrays.toString(number));
    }

    public char[] reverse(int i, int i1, int i2, int i3, int i4, int i5) {
        return new char[0];
    }
}
