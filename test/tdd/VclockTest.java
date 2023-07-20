package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VclockTest {
    @Test
    public void canTestVclock(){
        Vclock vclock = new Vclock();
        assertEquals(0, vclock.convertToSeconds(-2));


    }
}
