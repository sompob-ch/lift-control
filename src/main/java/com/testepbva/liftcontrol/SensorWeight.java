package com.testepbva.liftcontrol;

public class SensorWeight {

    public Boolean verifyWeight(Integer limit,Integer weight){

        if(weight > limit){
            return false;
        } else {
            return true;
        }

    }
}
