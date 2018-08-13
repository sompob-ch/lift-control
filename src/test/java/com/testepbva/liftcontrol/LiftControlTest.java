package com.testepbva.liftcontrol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LiftControlTest {

    @Test
    public void testSensorOverWeight(){
        SensorWeight sensorWeight = new SensorWeight();
        Integer limitWeight = 1000;
        Integer currentWeight = 1500;
        Boolean result = sensorWeight.verifyWeight(limitWeight,currentWeight);
        assertEquals(result, false);
    }

}
