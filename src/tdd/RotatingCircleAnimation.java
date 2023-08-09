package tdd;
public class RotatingCircleAnimation {
    public static void main(String[] args) throws InterruptedException {
        System.out.print("Loading ");
        rotatingCircleAnimation();
    }

    public static void rotatingCircleAnimation() throws InterruptedException {
        String[] animationFrames = {"4", "3", "2", "1"};

        int iterations = 8;
        for (int i = 0; i < iterations; i++) {
            System.out.print("\b" + animationFrames[i % animationFrames.length]);
            Thread.sleep(1000);
        }

        System.out.println("\nAnimation completed!");
    }
}
