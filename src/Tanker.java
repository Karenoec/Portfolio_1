import java.util.ArrayList;

public class Tanker extends Vessel {
    //Variable used to store the maximum amount of compartments the specific Tanker has
    int compartmentMax;
    //Arraylist used to keep track of the compartments on the Tanker
    ArrayList<Compartment> compartmentOccupied = new ArrayList<>();

    public Tanker (String flagNation, int draft, int length, int width, int compartmentMax){
        this.flagNation = flagNation;
        this.draft = draft;
        this.length = length;
        this.width = width;
        this.compartmentMax = compartmentMax;

        //If compartmentMax exceeds 10, the program will return an error message and stop
        if (compartmentMax < 1 || compartmentMax > 10) {
            throw new IllegalArgumentException("CompartmentMax = " + compartmentMax + " is out of range. Tankers can only consist of 1 to 10 compartments.");
        /*if(compartmentMax >10){
            compartmentMax = 10;
        }*/
    }

    //Adds compartments to compartmentOccupied arraylist
    @Override
    public void loadingCargo(ArrayList<Cargo> cargoList) {
        if (compartmentOccupied.size()>0){
            compartmentOccupied.clear();
        }
        for(int i = 0; i < cargoList.size(); i++) {
            Cargo item = cargoList.get(i);
            if (compartmentOccupied.size() < compartmentMax && item instanceof Compartment){
                compartmentOccupied.add((Compartment) item);
            }
        }
    }

    //Method that calculates the fraction of the total capacity that is used on the Tanker
    @Override
    public double utilityLevelOfCapacity() {
        return (double) compartmentOccupied.size() / (double) compartmentMax;
    }
}
