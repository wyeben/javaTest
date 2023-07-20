package tdd;

public class ElementInAList {
    public static boolean elementInList(int element, int[] number) {
        for(int y = 0; y < number.length;y++){

            if(number[y] == element){

                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] number = {2,3,4,5,6};
        int element = 5;
        boolean checkElement = elementInList(element,number);

        System.out.println("is element present:"+checkElement);
    }
}
