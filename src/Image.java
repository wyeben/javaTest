public class Image {
    public static void main(String[] args) {
        int[][] picture = {
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 1, 1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0}
        };

        StringBuilder result = new StringBuilder();

        for (int[] row : picture) {
            for (int element : row) {
                if (element == 0) {
                    result.append(' ');
                } else {
                    result.append('*');
                }
            }
            result.append('\n');
        }

        System.out.println(result.toString());
    }
}