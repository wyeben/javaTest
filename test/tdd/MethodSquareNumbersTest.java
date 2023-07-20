package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MethodSquareNumbersTest {

    @Test
    public void canSquareNumbers(){
        MethodSquareNumbers cal = new MethodSquareNumbers();
        int calculateSquare = cal.square(10);
        assertEquals(100,calculateSquare);
    }
}
