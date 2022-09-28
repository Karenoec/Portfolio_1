/*
The RoRo vessels has a total amount of lane meters and can carry
cars and trucks, each car is 8 meter long and each truck is 30 meters.
 */

import java.util.ArrayList;

public class RoRoVessel extends Vessel{
    int carAmount;
    int truckAmount;
    int laneMeter;
    ArrayList<Vehicle> vehiclesOnBoard = new ArrayList<>();

    public RoRoVessel (String flagNation, int draft, int length, int width){
        this.flagNation = flagNation;
        this.draft = draft;
        this.length = length;
        this.width = width;
    }
    //The RoRo vessels has a total amount of lane meters and can carry cars and trucks, each car is 8 meter long and each truck is 30 meters.
    //Is used to set relevant information for vessels and make the cargo amount accessible through methods
    public void loadingCargo(Vehicle vehicle){
        if(laneMeter < carAmount * + truckAmount * 30){

        if
        }

    }

    //Is used to compute the fraction of the total capacity that is used
    //public int utilityLevelOfCapacity(){}

}
