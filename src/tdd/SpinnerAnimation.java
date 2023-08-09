package tdd;

public class SpinnerAnimation {
    public static void main(String[] args) throws InterruptedException {
        spinnerAnimation();
    }

    public static void spinnerAnimation() throws InterruptedException {
        char[] spinnerChars = { '|', '/', '-', '\\' };

        int iterations = 25;
        for (int i = 0; i < iterations; i++) {
            char spinnerChar = spinnerChars[i % spinnerChars.length];
            System.out.print("\r" + spinnerChar);
            Thread.sleep(200);
        }

        System.out.println("\nAnimation completed!");
    }
}
