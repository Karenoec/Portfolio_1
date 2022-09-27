/*
The RoRo vessels has a total amount of lane meters and can carry
cars and trucks, each car is 8 meter long and each truck is 30 meters.
 */

public class RoRo extends Vessel{
    int vehicleAmount;
    int laneMeter;

    public RoRo (String flagNation, int draft, int length, int width){
        this.flagNation = flagNation;
        this.draft = draft;
        this.length = length;
        this.width = width;
    }

    //Is used to set relevant information for vessels and make the cargo amount accessible through methods
    public void loadingCargo(){

    }

    //Is used to compute the fraction of the total capacity that is used
    //public int utilityLevelOfCapacity(){}

}
