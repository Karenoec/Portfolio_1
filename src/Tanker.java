/*
The tankers have 1-10 compartments which each has a capacity and which each can be filled to some level.
 */

public class Tanker extends Vessel {
    int compartmentAmount;

    public Tanker (String flagNation, int draft, int length, int width){
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
