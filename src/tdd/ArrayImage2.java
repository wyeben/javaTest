package tdd;

public class ArrayImage2 {
    public static void main(String[] args) {
        char[][] aphabet = {
                {'x', 'o', 'x'},{'o', 'o', 'x'},{'o', 'x', 'x'}
        };
        StringBuilder result = new StringBuilder();

        for (char[] chars : aphabet) {
            for (char aChar : chars) {
                result.append(aChar == 'x' ? '1' : "0");
            }
            result.append(System.lineSeparator());

        }
            System.out.println(result.toString());
    }
}

