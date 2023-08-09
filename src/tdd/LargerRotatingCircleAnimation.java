package tdd;

public class LargerRotatingCircleAnimation {
    public static void main(String[] args) throws InterruptedException {
        largerRotatingCircleAnimation();
    }

    public static void largerRotatingCircleAnimation() throws InterruptedException {
        String[] animationFrames = {
                "\u25D0\u25D1\u25D2\u25D3",
                "\u25CC\u25CD\u25CE\u25CF",
                "\u25A2\u25A3\u25A4\u25A5",
                "\u25E4\u25E5\u25E6\u25E7"
        };

        int iterations = 25;
        for (int i = 0; i < iterations; i++) {
            System.out.print("\r" + animationFrames[i % animationFrames.length]);
            Thread.sleep(200);
        }

        System.out.println("\nAnimation completed!");
    }
}