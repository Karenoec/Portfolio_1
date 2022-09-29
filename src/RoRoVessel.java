/*
A RoRo vessels can carry cars and trucks.
 */

import java.util.ArrayList;

public class RoRoVessel extends Vessel{
    //Maybe delete these variables
    int carAmount;
    int truckAmount;
    //Variable used to store the specific lanemeters of the RoRoVessel
    //LaneMeters differs from RoRo to RoRO and is set when creating a RoRoVessel object
    int laneMeter;
    //Arraylist used to keep track of the vehicles loaded on the RoRoVessel
    ArrayList<Vehicle> vehiclesOnBoard = new ArrayList<>();

    //Constructor for RoRoVessel objects
    public RoRoVessel (String flagNation, int draft, int length, int width, int laneMeter){
        this.flagNation = flagNation;
        this.draft = draft;
        this.length = length;
        this.width = width;
        this.laneMeter = laneMeter;
    }

    //Method used to set relevant information for vessels and make the cargo amount accessible through methods
    @Override
    public void loadingCargo(ArrayList<Cargo> cargoList) {
        for(Cargo item : cargoList){
            if(item instanceof Vehicle) {
                if (calculateLoadedVehicleLength() + ((Vehicle) item).getLength() < laneMeter) {
                    vehiclesOnBoard.add((Vehicle) item);
                }
            }
        }
    }

    //Method that calculates the total length of all the vehicles loaded on the RoRoVessel
    private int calculateLoadedVehicleLength(){
        int loadedLength = 0;
        //Another way of writing the for-loop
        /*for (Vehicle item : vehiclesOnBoard) {
            loadedLength += item.getLength();
        }*/
        for (int i=0; i <vehiclesOnBoard.size(); i++){
            Vehicle item = vehiclesOnBoard.get(i);
            loadedLength += item.getLength();
        }
        return loadedLength;
    }


    //Method that calculates the fraction of the total capacity that is used on the RoRoVessel
    @Override
    public float utilityLevelOfCapacity() {
        return (float)calculateLoadedVehicleLength() / (float)laneMeter;
    }
}
