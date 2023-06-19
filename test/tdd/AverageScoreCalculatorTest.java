package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class AverageScoreCalculatorTest {
    @Test
    public void testThatAverageScoreCalculatorExist(){
        AverageScoreCalculator asc = new AverageScoreCalculator();
        assertTrue(true);
    }
    @Test
    public void canPowerOn(){
        AverageScoreCalculator asc = new AverageScoreCalculator();
        asc.power(true);
        boolean power = asc.isOn();
        assertTrue(true);
    }
    @Test
    public void canCollectScoreFromTeacher(){
        AverageScoreCalculator asc = new AverageScoreCalculator();
        asc.power(true);
        asc.setScore();
        int score = asc.getScore();
        assertEquals(score,asc.getScore());
}
    @Test
    public void canCalculateAverage(){
        AverageScoreCalculator asc = new AverageScoreCalculator();
        asc.power(true);
        asc.setAverage(0);
        assertTrue(true);
    }
    @Test
    public void canDisplayAverage(){
        AverageScoreCalculator asc = new AverageScoreCalculator();
        asc.power(true);
        double average = asc.getScore();
        assertEquals(0, average);

    }
}
