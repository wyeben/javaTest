package tdd;
public class ConsoleLoadingAnimation {
    public static void main(String[] args) throws InterruptedException {
        String[] animationChars = {"/", "-", "\\", "|"};
        int index = 0;

        System.out.print("Loading ");

        for (int i = 0; i < 10; i++) {
            System.out.print(animationChars[index]);
            index = (index + 1) % animationChars.length;
            Thread.sleep(500);
            System.out.print("\b");
        }

        System.out.println("\nLoading complete!");
    }
}