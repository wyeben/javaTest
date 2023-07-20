package tdd;

public class asteris3 {
    public static void main(String[] args) {
        int rows = 10;
        increaseSize(rows);
    }
        public static void increaseSize( int rows){

            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print('#');
                }
                System.out.println();
            }

            System.out.println();

            for (int i = rows; i >= 1; i--) {
                for (int j = i; j > 0; j--) {
                    System.out.print('#');
                }
                System.out.println();
            }
            System.out.println();

            for (int i = rows; i >= 1; i--) {
                for (int j = rows - i; j > 0; j--) {
                    System.out.print(' ');
                }
                for (int k = i; k >= 1; k--) {
                    System.out.print('#');
                }
                System.out.println();
            }
            System.out.println();

            for (int i = 1; i <= rows; i++) {
                for (int j = rows - i; j > 0; j--) {
                    System.out.print(' ');
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print('#');
                }
                System.out.println();
            }

        }
    }
