package tdd;

public class ProgressBarAnimation {
    public static void main(String[] args) throws InterruptedException {
        System.out.print("Loading ");
        progressBarAnimation();
    }

    public static void progressBarAnimation() throws InterruptedException {
        int totalIterations = 25;
        for (int i = 0; i <= totalIterations; i++) {
            drawProgressBar(i, totalIterations);
            Thread.sleep(200);
        }

        System.out.println("\nProcess completed!");
    }

    public static void drawProgressBar(int currentProgress, int totalProgress) {
        int barWidth = 50;
        int progress = (int) ((double) currentProgress / totalProgress * barWidth);

        StringBuilder progressBar = new StringBuilder("[");
        for (int i = 0; i < barWidth; i++) {
            if (i < progress) {
                progressBar.append("=");
            } else {
                progressBar.append(" ");
            }
        }
        progressBar.append("] " + (currentProgress * 100 / totalProgress) + "%");

        System.out.print("\r" + progressBar);
    }
}

