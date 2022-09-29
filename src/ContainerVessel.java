import java.util.ArrayList;

public class ContainerVessel extends Vessel{
    //Variable used to store the maximum amount of containers the specific ContainerVessel object can carry
    int containerMax;
    //Arraylist used to keep track of the containers loaded on the ContainerVessel
    ArrayList<Container> containersOnBoard = new ArrayList<>();

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
        if (containersOnBoard.size()>0){
            containersOnBoard.clear();
        }
        for(int i = 0; i < cargoList.size(); i++) {
            Cargo item = cargoList.get(i);
            if (containersOnBoard.size() < containerMax && item instanceof Container){
                containersOnBoard.add((Container)item);
            }
        }
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
