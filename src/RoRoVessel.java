import java.util.ArrayList;

public class RoRoVessel extends Vessel{
    //Variable used to store the laneMeters of the specific RoRoVessel
    int laneMeter;
    //Arraylist used to keep track of the vehicles loaded on the RoRoVessel
    ArrayList<Vehicle> vehiclesOnBoard = new ArrayList<>();

    public RoRoVessel (String flagNation, int draft, int length, int width, int laneMeter){
        this.flagNation = flagNation;
        this.draft = draft;
        this.length = length;
        this.width = width;
        this.laneMeter = laneMeter;
    }

    //Adds vehicles to vehiclesOnBoard arraylist
    @Override
    public void loadingCargo(ArrayList<Cargo> cargoList) {
        if (vehiclesOnBoard.size()>0){
            vehiclesOnBoard.clear();
        }
        for(int i = 0; i < cargoList.size(); i++){
            Cargo item = cargoList.get(i);
            if(item instanceof Vehicle){
                if(calculateLoadedVehicleLength() + ((Vehicle) item).getLength() <= laneMeter){
                    vehiclesOnBoard.add((Vehicle) item);
                }
            }
        }
    }

    //Method that calculates the total length of all the vehicles loaded on the RoRoVessel
    private int calculateLoadedVehicleLength(){
        int loadedLength = 0;
        for (int i=0; i <vehiclesOnBoard.size(); i++){
            Vehicle item = vehiclesOnBoard.get(i);
            loadedLength += item.getLength();
        }
        return loadedLength;
    }

    //Method that calculates the fraction of the total capacity that is used on the RoRoVessel
    @Override
    public double utilityLevelOfCapacity() {
        return ((double)calculateLoadedVehicleLength()) / ((double)laneMeter);
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
