package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CarTest {
    @Test
    public void carCanBeCreated(){
        Car benz = new Car();
        assertTrue(true);
    }
    @Test
    public void canPowerOn(){
        Car benz = new Car();
        benz.power();
        boolean ben = benz.isOn();
        assertTrue(true);
    }
    @Test
    public void canPowerOff(){
        Car benz = new Car();
        benz.power();
        boolean ben = benz.isOff();
        assertTrue(true);
    }
    @Test
    public void canAccelerateCar(){
        Car benz = new Car();
        benz.power();
        benz.accelerate(10);
        int ben = benz.Speed();
        assertEquals(10,benz.getAccelerate());


    }
}
