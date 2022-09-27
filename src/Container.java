/*
A container vessel can carry a specific number of containers.

 */

public class Container extends Vessel{
    int containerAmount;


    public Container(String flagNation, int draft, int length, int width){
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
