package tdd;

public class SumTheList {
    public static int findHighestSumNumber(int[] numbers) {
        int totalSum = 0;
        int lowestSum = Integer.MAX_VALUE;
        int lowestSumNumber = 0;

                for (int num : numbers) {
            totalSum += num;
        }

        for (int num : numbers) {
            int sumWithoutNum = totalSum - num;
            if (sumWithoutNum < lowestSum) {
                lowestSum = sumWithoutNum;
                lowestSumNumber = num;
            }
        }

        return lowestSumNumber;
    }

    public static int findLowestSumNumber(int[] numbers) {
        int totalSum = 0;
        int highestSum = Integer.MIN_VALUE;
        int highestSumNumber = 0;

                for (int num : numbers) {
            totalSum += num;
        }

                for (int num : numbers) {
            int sumWithoutNum = totalSum - num;
            if (sumWithoutNum > highestSum) {
                highestSum = sumWithoutNum;
                highestSumNumber = num;
            }
        }

        return highestSumNumber;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 3, 1};

        int lowestSumNumber = findLowestSumNumber(numbers);
        System.out.println("Number to remove for lowest sum: " + lowestSumNumber);

        int highestSumNumber = findHighestSumNumber(numbers);
        System.out.println("Number to remove for highest sum: " + highestSumNumber);
    }
}

