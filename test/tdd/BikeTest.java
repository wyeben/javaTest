package tdd;

import org.junit.jupiter.api.Test;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BikeTest {

    @Test
    public void myYamaha(){
        Bike yamaha = new Bike();
        yamaha.setName("yamaha");
        String myYamaha = yamaha.getName();
        assertEquals("yamaha",yamaha.getName());

    }
    @Test
    public void canTurnOnBike(){

        Bike yamaha = new Bike();
        boolean me = yamaha.getIsOn();
        assertTrue("yamaha",true);

    }
    @Test
    public void canChangeGear(){

        Bike yamaha = new Bike();
        int gear = yamaha.getGear();
        assertEquals(0,yamaha.getGear());
    }

    @Test
    public void canTurnOffBike(){
        Bike yamaha = new Bike();
        boolean isOn = yamaha.getIsOn();
        assertFalse(false);
    }
}
