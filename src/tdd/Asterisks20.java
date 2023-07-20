package tdd;

public class Asterisks20 {
    public static void main(String[] args) {
        int size =20;
       printDiamond(size);


    }

    public static void printDiamond(int size) {
        for (int americana = 1; americana <= size; americana++) {
            for (int j = size - americana; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * americana - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int americana = size - 1; americana >= 1; americana--) {
            for (int j = 1; j <= size - americana; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * americana - 1; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}