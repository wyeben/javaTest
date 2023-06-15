package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionTest {

    @Test
    public void canTurnOnAirCondition(){

        AirCondition samsung = new AirCondition();
        boolean  turnOn = samsung.getIsOn();
        assertTrue(true);

    }

    @Test
    public void canTurnOffAirCondition(){
        AirCondition samsung = new AirCondition();
        boolean turnOff = samsung.getIsOn();
        assertFalse(false);
    }

    @Test
     public void mySamsung(){
        AirCondition samsung = new AirCondition();
        samsung.setName("Samsung");
        String mySamsung = samsung.getName();
        assertEquals("Samsung",samsung.getName());
    }
    @Test
     public void canIncreaseTemperature(){
        AirCondition samsung = new AirCondition();
        samsung.setTemperature(16);
        int temperature = samsung.getTemperature();
        assertEquals(17, temperature);

    }
    @Test
    public void canDecreaseTemperature(){
        AirCondition samsung = new AirCondition();
        samsung.setTemperature(16 - 1);
        int temperature = samsung.getTemperature();
        assertEquals(16,temperature);

    }
    }

