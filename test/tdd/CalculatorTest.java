package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void canCalculateFactorial(){
        Calculator cal = new Calculator();
        long factorial = cal.getFactorial(20);
        assertEquals(120,factorial);

    }
}
