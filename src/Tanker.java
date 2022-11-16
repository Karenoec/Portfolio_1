import java.util.ArrayList;

public class Tanker extends Vessel {
    //Variable used to store the maximum amount of compartments the specific Tanker has
    int compartmentMax;
    //Arraylist used to keep track of the compartments on the Tanker
    ArrayList<Compartment> compartmentOccupied = new ArrayList<>();

    // Constructor for Tanker-objects
    public Tanker (String flagNation, int draft, int length, int width, int compartmentMax){
        this.flagNation = flagNation;
        this.draft = draft;
        this.length = length;
        this.width = width;
        this.compartmentMax = compartmentMax;

        //If compartmentMax exceeds 10, the program will return an error message and stop
        if (compartmentMax < 1 || compartmentMax > 10) {
            throw new IllegalArgumentException("CompartmentMax = " + compartmentMax
                    + " is out of range. Tankers can only consist of 1 to 10 compartments.");
            // Code taken from https://stackoverflow.com/questions/6924673/limit-variable-value-best-way
            // By: Thilo. 3rd of August, 2011.
        }
    }

    //Adds compartments to compartmentOccupied arraylist
    @Override
    public void loadingCargo(ArrayList<Cargo> cargoList) {
        // Clears the compartmentOccupied-arraylist to avoid loading the same cargo twice
        // The cargoList that is being passed as the parameter contains the cargo which have been loaded earlier
        if (compartmentOccupied.size()>0){
            compartmentOccupied.clear();
        }
        for(int i = 0; i < cargoList.size(); i++) {
            Cargo item = cargoList.get(i);
            // Makes sure that the Tanker's maximum compartment amount is not exceeded
            // and makes sure that the cargo being loaded is Compartment-objects
            if (compartmentOccupied.size() < compartmentMax && item instanceof Compartment){
                compartmentOccupied.add((Compartment) item);
            }
        }
    }

    // Method that returns the amount of cargo on the Tanker
    @Override
    public int loadedCargoAmount() {
        return compartmentOccupied.size();
    }

    //Method that calculates the fraction of the total capacity that is used on the Tanker
    @Override
    public double utilityLevelOfCapacity() {
        return (double) compartmentOccupied.size() / (double) compartmentMax;
    }

    @Override
    public int getPosition() {
        return 0;
    }

    @Override
    public int setDestination() {
        return 0;
    }

    @Override
    public int getDestination() {
        return 0;
    }

    @Override
    public boolean vesselAvailable() {
        return false;
    }
}
