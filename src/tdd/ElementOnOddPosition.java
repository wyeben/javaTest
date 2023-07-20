package tdd;

public class ElementOnOddPosition {
    public static int[] oddPosition(int[] number) {
        for(int y = 1;y < number.length;y += 2){

            System.out.println(number[y]);
            }
        return number;
        }

    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9};
        System.out.println("Odd position");
        oddPosition(numbers);
    }

    }
