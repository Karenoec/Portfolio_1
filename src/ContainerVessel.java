/*
A container vessel can carry a specific number of containers.

 */

public class ContainerVessel extends Vessel{
    int containerAmount;

    //Skal måske sættes når et containerskib-object oprettes
    int containerMax;
    int capacity;


    public ContainerVessel(String flagNation, int draft, int length, int width){
        this.flagNation = flagNation;
        this.draft = draft;
        this.length = length;
        this.width = width;
        containerAmount = 0;
    }

    //Is used to set relevant information for vessels and make the cargo amount accessible through methods
    public void loadingCargo(int container){
        if (containerAmount < containerMax){
        containerAmount = containerAmount + container;
        }
    }

    //Is used to compute the fraction of the total capacity that is used
    //Skal måske laves til float fordi det er en brøkdel
    public int utilityLevelOfCapacity(){
        capacity = containerAmount/containerMax;
        return capacity;
    }

}
