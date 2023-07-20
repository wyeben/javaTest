package tdd;

public class Vclock {
    private int minutes;
    private final int seconds = 60;

    public Vclock() {
    }


    public int convertToSeconds(int minutes) {
        if(minutes <= 0)return 0;
        return minutes * seconds;
    }


}
