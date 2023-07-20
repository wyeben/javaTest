package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseListTest {

    @Test
    public void canReverse(){
        ReverseList reverseIt = new ReverseList();
        String doIt = String.valueOf(reverseIt.reverse(0,1,2,3,4,5));
        assertEquals(5,4,3,doIt);
    }
}
