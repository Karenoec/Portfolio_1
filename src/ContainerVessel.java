import java.util.ArrayList;

public class ContainerVessel extends Vessel{
    //Variable used to store the maximum amount of containers the specific ContainerVessel object can carry
    int containerMax;
    //Arraylist used to keep track of the containers loaded on the ContainerVessel
    ArrayList<Container> containersOnBoard = new ArrayList<>();

    // Constructor for ContainerVessel-objects
    public ContainerVessel(String flagNation, int draft, int length, int width, int containerMax){
        this.flagNation = flagNation;
        this.draft = draft;
        this.length = length;
        this.width = width;
        this.containerMax = containerMax;
    }

    //Adds containers to containersOnBoard arraylist
    @Override
    public void loadingCargo(ArrayList<Cargo> cargoList) {
        // Clears the containersOnBoard-arraylist to avoid loading the same cargo twice
        // The cargoList that is being passed as the parameter contains the cargo which have been loaded earlier
        if (containersOnBoard.size()>0){
            containersOnBoard.clear();
        }
        for(int i = 0; i < cargoList.size(); i++) {
            Cargo item = cargoList.get(i);
            // Makes sure that the ContainerVessel's maximum container amount is not exceeded
            // and makes sure that the cargo being loaded is Container-objects
            if (containersOnBoard.size() < containerMax && item instanceof Container){
                containersOnBoard.add((Container)item);

            }
        }
    }

    // Method that returns the amount of cargo on the ContainerVessel
    @Override
    public int loadedCargoAmount() {
        return containersOnBoard.size();
    }

    //Method that calculates the fraction of the total capacity that is used on the ContainerVessel
    @Override
    public double utilityLevelOfCapacity() {
        return (double) containersOnBoard.size()/ (double)containerMax;
    }

    @Override
    public int getPosition() {
        return 0;
    }

    @Override
    public int getDestination() {
        return 0;
    }

    @Override
    public int setDestination() {
        return 0;
    }

    @Override
    public boolean vesselAvailable() {
        return false;
    }
}
