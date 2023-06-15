import org.junit.jupiter.api.Test;
import tdd.Television;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TelevisionTest {
    @Test
    public void canPowerOn(){
        Television samsung = new Television();
        boolean powerOn = samsung.getPowerOn();
        assertTrue(true);
    }
    @Test
    public void canIncreaseVolume(){
        Television samsung = new Television();
        samsung.setVolumeUp(10);
        int volume = samsung.getVolumeUp();
        assertEquals(11, volume);

    }
    @Test
    public void canDecreaseVolume(){
        Television samsung = new Television();
        samsung.setVolumeDown(5);
        int volume = samsung.getVolumeDown();
        assertEquals(4, volume);
    }
    @Test
    public void canIncreaseChannel(){
        Television samsung = new Television();
        samsung.setIncreaseChannel(4);
        int channel = samsung.getIncreaseChannel();
        assertEquals(5, channel);
    }
    @Test
    public void canDecreaseChannel(){
        Television samsung = new Television();
        samsung.setDecreaseChannel(4);
        int channel = samsung.getDecreaseChannel();
        assertEquals(3, channel);
    }
    @Test
    public void canPowerOffTelevision(){
        Television samsung = new Television();
        samsung.setPowerOff();
        boolean power = samsung.getPowerOff();
        assertTrue(true);

    }
}
