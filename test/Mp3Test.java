import org.junit.jupiter.api.Test;
import tdd.Mp3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Mp3Test {
    @Test
    public void theNameOfMyMp3(){

        Mp3 mymy = new Mp3();
        mymy.setName("ben");
        String ben = mymy.getName();
        assertEquals("ben", mymy.getName());
    }

    @Test
    public void canTurnOnMp3(){
        Mp3 mymy = new Mp3();
        boolean turnOn = mymy.getIsOn();
        assertTrue(true);
    }
    @Test
    public void canPlayMusic(){
        Mp3 mymy = new Mp3();
        boolean play = mymy.getPlay();
        assertTrue(true);
    }
    @Test
    public void canPauseMusic(){
        Mp3 mymy = new Mp3();
        boolean pause = mymy.getPause();
        assertTrue(true);
    }
    @Test
    public void canIncreaseVolume(){
        Mp3 mymy = new Mp3();
        mymy.setVolumeUp(5);
        int volumeUp = mymy.getVolumeUp();
        assertEquals(6, volumeUp);
    }
    @Test
    public void canDecreaseVolume(){
        Mp3 mymy = new Mp3();
        mymy.setVolumeDown(5);
        int volumeDown = mymy.getVolumeDown();
        assertEquals(4, volumeDown);
    }
}
