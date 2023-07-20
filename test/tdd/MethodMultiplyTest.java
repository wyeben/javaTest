package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MethodMultiplyTest {

    @Test
    public void canMultiply(){
        MethodMultiply cal = new MethodMultiply();
        int isMultiply = cal.multiply(7,6);
        assertEquals(42,isMultiply);
    }
}
