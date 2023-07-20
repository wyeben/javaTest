package tdd;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {

    @Test
    public void canCalculateFibonacci(){
        Fibonacci cal = new Fibonacci();
        int[] number = cal.fibonacciSequence(2);
        assertEquals(0,1,1, Arrays.toString(number));
    }
}
