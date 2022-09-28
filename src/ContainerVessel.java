/*
A container vessel can carry a specific number of containers.

 */

import java.util.ArrayList;

public class ContainerVessel extends Vessel{
    //Variable used to store the maximum amount of containers the specific ContainerVessel object can carry
    int containerMax;
    //Arraylist used to keep track of the containers loaded on the ContainerVessel
    ArrayList<Container> containerLoaded= new ArrayList<>();


    //Constructor for ContainerVessel objects
    public ContainerVessel(String flagNation, int draft, int length, int width, int containerMax){
        this.flagNation = flagNation;
        this.draft = draft;
        this.length = length;
        this.width = width;
        this.containerMax = containerMax;
    }

    //Method that puts checks whether there is space available for a container, and checks
    //Is used to set relevant information for vessels and make the cargo amount accessible through methods
    @Override
    public void loadingCargo(ArrayList<Cargo> cargoList) {
        for(Cargo item : cargoList){
            if (containerLoaded.size() < containerMax && item instanceof Container){
                containerLoaded.add((Container)item);
            }
        }
    }

    //Method that calculates the fraction of the total capacity that is used
    @Override
    public float utilityLevelOfCapacity() {
        return containerLoaded.size()/containerMax;
    }

}
