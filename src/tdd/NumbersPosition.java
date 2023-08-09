package tdd;

import java.util.Arrays;

public class NumbersPosition {



    public static int[][] findPositions(int[] num) {
        int maxNumber = getMaxNumber(num);

        int[][] positionsArray = new int[maxNumber + 1][];
        int[] counts = new int[maxNumber + 1];

        for (int i = 0; i < num.length; i++) {
            int currentNum = num[i];
            int index = counts[currentNum];
            if (positionsArray[currentNum] == null) {
                positionsArray[currentNum] = new int[countOccurrences(num, currentNum)];
            }
            positionsArray[currentNum][index] = i;
            counts[currentNum]++;
        }

        return positionsArray;
    }

    public static int getMaxNumber(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] num = {5, 18, 32, 3, 4};
        int[][] positionsArray = findPositions(num);

        System.out.println("Positions of numbers in the array:");
        for (int i = 0; i < positionsArray.length; i++) {
            int[] positions = positionsArray[i];
            if (positions != null) {
                System.out.println("Number " + i + ": Positions " + Arrays.toString(positions));
            }
        }
    }
}
