/*
The tankers have 1-10 compartments which each has a capacity and which each can be filled to some level.
 */
import java.util.ArrayList;

public class Tanker extends Vessel {
    //Variable used to store the maximum amount of compartments the specific Tanker object has
    int compartmentMax;
    //Arraylist used to keep track of the compartments on the specific Tanker object
    ArrayList<Compartment> compartmentAmount = new ArrayList<>();

    //Constructor for Tanker objects
    public Tanker (String flagNation, int draft, int length, int width, int compartmentMax){
        this.flagNation = flagNation;
        this.draft = draft;
        this.length = length;
        this.width = width;
        this.compartmentMax = compartmentMax;
    }

    @Override
    public void loadingCargo(ArrayList<Cargo> cargo) {
    }



    /* public void loadingCargo(Compartment compartment){
        if(compartmentAmount.size() < compartmentMax ){
        }
    }*/

    //Method that calculates the fraction of the total capacity that is used
    @Override
    public float utilityLevelOfCapacity() {
        return 0;
    }
}
