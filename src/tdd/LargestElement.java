package tdd;

public class LargestElement {
    public static int FindLargest(int[] number) {


        int largest = number[0];

        for(int y = 1;y < number.length;y++){
            int current = number[y];

            if (current > largest){
                largest = current;
            }
        }
        return largest;

    }

    public static void main(String[] args) {
        int [] numbers = {20,4,12,6,9,32};

        int largestNumber = FindLargest(numbers);
        System.out.println("The largest element is:"+largestNumber);
    }

}
