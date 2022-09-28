/*
The tankers have 1-10 compartments which each has a capacity and which each can be filled to some level.
 */
import java.util.ArrayList;

public class Tanker extends Vessel {
    ArrayList<Compartment> compartmentAmount = new ArrayList<>();
    int compartmentMax;

    public Tanker (String flagNation, int draft, int length, int width, int compartmentMax){
        this.flagNation = flagNation;
        this.draft = draft;
        this.length = length;
        this.width = width;
        this.compartmentMax = compartmentMax;
    }

    //Is used to set relevant information for vessels and make the cargo amount accessible through methods
    public void loadingCargo(Compartment ){
        if(compartmentAmount.size() < compartmentMax ){
        }
    }

    //Is used to compute the fraction of the total capacity that is used
    //public int utilityLevelOfCapacity(){}

}
