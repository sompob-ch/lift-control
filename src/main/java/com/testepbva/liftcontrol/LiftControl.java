package com.testepbva.liftcontrol;

public class LiftControl {

    public Boolean sensorWeight(Integer limit,Integer weight){

        if(weight > limit){
            return false;
        } else {
            return true;
        }

    }

    public String floorControl(Integer currentFloor, Integer targetFloor){
        if(currentFloor < targetFloor){
            return "Up";
        } else {
            return "something";
        }
    }

    public String start(Integer limitWeight, Integer currentWeight, Integer currentFloor, Integer targetFloor){

        if(sensorWeight(limitWeight,currentWeight)){
            return floorControl(currentFloor,targetFloor);
        } else {
            return "Pause";
        }

    }

}
