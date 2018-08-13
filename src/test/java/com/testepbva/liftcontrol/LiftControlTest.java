package com.testepbva.liftcontrol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LiftControlTest {

    public Integer limitWeight = 1000;
//
//    @Test
//    public void testSensorResultIsOverLimitWeight(){
//        LiftControl liftControl = new LiftControl();
//        Integer currentWeight = 1500;
//        Boolean result = liftControl.sensorWeight(limitWeight,currentWeight);
//        assertEquals(result, false);
//    }
//
//    @Test
//    public void testSensorResultIsNotOverLimitWeight(){
//        LiftControl liftControl = new LiftControl();
//        Integer currentWeight = 500;
//        Boolean result = liftControl.sensorWeight(limitWeight,currentWeight);
//        assertEquals(result, true);
//    }

    @Test
    public void testListControlCaseListStatusOverLimitWeightIsStatusPause(){
        LiftControl liftControl = new LiftControl();
        Integer currentWeight = 1500;
        String result = liftControl.start(limitWeight,currentWeight,0,0);
        assertEquals(result,"Pause");
    }

    @Test
    public void testListControlCaseMoveFromFloorGToFloorTop(){
        LiftControl liftControl = new LiftControl();
        Integer currentWeight = 500;
        String result = liftControl.start(limitWeight,currentWeight,1,10);
        assertEquals(result,"Up");
    }

}
