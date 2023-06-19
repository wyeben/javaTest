package tdd;

public class AverageScoreCalculator {
    private boolean power;
    private int score;
    private double average;
    private int totalStudents = 20;
    private int totalScore = 0;
    public void setScore() {
        this.score = totalStudents*totalScore;

    }

    public void power(boolean isOn) {
        this.power = isOn;
    }

    public boolean isOn() {
        return true;
    }

    public int getScore() {
        return score;
    }

    public void setAverage(double average) {
        this.average = totalScore/totalStudents;
    }

    public double getAverage() {
        return average;
    }
}
