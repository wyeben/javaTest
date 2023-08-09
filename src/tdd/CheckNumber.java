package tdd;

public class CheckNumber {
    public static int[][] collectPositions(int[] arr) {
        int maxNumber = getMaxNumber(arr);
        int[][] positionsArray = new int[maxNumber + 1][];

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (positionsArray[num] == null) {
                positionsArray[num] = new int[countOccurrences(arr, num)];
            }
            int index = findNextPositionIndex(positionsArray[num]);
            positionsArray[num][index] = i;
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

    public static int findNextPositionIndex(int[] positions) {
        for (int i = 0; i < positions.length; i++) {
            if (positions[i] == 0) {
                return i;
            }
        }
        throw new RuntimeException("No empty position found.");
    }

    public static void main(String[] args) {
        int[] numbers = {5,18,32,3,4};

        int[][] positionsArray = collectPositions(numbers);

        System.out.println("Positions of numbers in the array:");
        for (int i = 0; i < positionsArray.length; i++) {
            int[] positions = positionsArray[i];
            if (positions != null) {
                System.out.print("Number " + i + ": Positions ");
                for (int position : positions) {
                    System.out.print(position + " ");
                }
                System.out.println();
            }
        }
    }
}