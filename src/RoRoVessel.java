/*
The RoRo vessels has a total amount of lane meters and can carry
cars and trucks, each car is 8 meter long and each truck is 30 meters.
 */

import java.util.ArrayList;

public class RoRoVessel extends Vessel{
    int carAmount;
    int truckAmount;
    int laneMeter;
    ArrayList<Vehicle> vehiclesOnBoard = new ArrayList<>();

    //Constructor for RoRoVessel objects
    public RoRoVessel (String flagNation, int draft, int length, int width){
        this.flagNation = flagNation;
        this.draft = draft;
        this.length = length;
        this.width = width;
    }

    //Det kunne være fedt hvis vi kan bruge konstanterne for længden af biler og trucks, i stedet for at bruge tal
    //Is used to set relevant information for vessels and make the cargo amount accessible through methods


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


    //Method that calculates the fraction of the total capacity that is used
    @Override
    public float utilityLevelOfCapacity() {
        return 0;
    }
}
