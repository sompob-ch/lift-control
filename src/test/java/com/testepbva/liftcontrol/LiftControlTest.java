package com.testepbva.liftcontrol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LiftControlTest {

    public Integer limitWeight = 1000;
    public Integer currentWeight = 500;
    public Integer g = 1;
    public Integer top = 10;

    @Test
    public void testListControlCaseListStatusOverLimitWeightIsStatusPause(){
        LiftControl liftControl = new LiftControl();
        Integer overWeight = 1500;
        String result = liftControl.start(limitWeight,overWeight,0,0);
        assertEquals(result,"Stop");
    }

    @Test
    public void testListControlCaseMoveFromFloorGToFloorTop(){
        LiftControl liftControl = new LiftControl();
        String result = liftControl.start(limitWeight,currentWeight,g,top);
        assertEquals(result,"Up");
    }

    @Test
    public void testListControlCaseMoveFromFloorGToFloorGPlusOne(){
        LiftControl liftControl = new LiftControl();
        String result = liftControl.start(limitWeight,currentWeight,g,g+1);
        assertEquals(result,"Up");
    }

    @Test
    public void testListControlCaseMoveFromFloorGToFloorTopRemoveOne(){
        LiftControl liftControl = new LiftControl();
        String result = liftControl.start(limitWeight,currentWeight,g,top-1);
        assertEquals(result,"Up");
    }

    @Test
    public void testListControlCaseMoveFromFloorGPlusOneToFloorTop(){
        LiftControl liftControl = new LiftControl();
        String result = liftControl.start(limitWeight,currentWeight,g+1,top);
        assertEquals(result,"Up");
    }

    @Test
    public void testListControlCaseMoveFromFloorGPlusOneToFloorTopRemoveOne(){
        LiftControl liftControl = new LiftControl();
        String result = liftControl.start(limitWeight,currentWeight,g+1,top-1);
        assertEquals(result,"Up");
    }

    @Test
    public void testListControlCaseMoveFromFloorGPlusOneToFloorG(){
        LiftControl liftControl = new LiftControl();
        String result = liftControl.start(limitWeight,currentWeight,g+1,g);
        assertEquals(result,"Down");
    }

    @Test
    public void testListControlCaseMoveFromFloorGPlusOneToFloorGPlusOne(){
        LiftControl liftControl = new LiftControl();
        String result = liftControl.start(limitWeight,currentWeight,g+1,g+1);
        assertEquals(result,"Stop");
    }

    @Test
    public void testListControlCaseMoveFromFloorTopToFloorG(){
        LiftControl liftControl = new LiftControl();
        String result = liftControl.start(limitWeight,currentWeight,top,g);
        assertEquals(result,"Down");
    }

    @Test
    public void testListControlCaseMoveFromFloorTopToFloorGPlusOne(){
        LiftControl liftControl = new LiftControl();
        String result = liftControl.start(limitWeight,currentWeight,top,g+1);
        assertEquals(result,"Down");
    }

    @Test
    public void testListControlCaseMoveFromFloorTopToFloorTopRemoveOne(){
        LiftControl liftControl = new LiftControl();
        String result = liftControl.start(limitWeight,currentWeight,top,top-1);
        assertEquals(result,"Down");
    }

}
