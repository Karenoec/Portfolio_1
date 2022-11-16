import java.util.ArrayList;

abstract class Vessel {
    String flagNation;
    int draft;
    int length;
    int width;

    abstract public void loadingCargo(ArrayList<Cargo> cargoList);

    abstract public double utilityLevelOfCapacity();

    abstract public int loadedCargoAmount();

    abstract public int getPosition();

    abstract public int setDestination();

    abstract public int getDestination();

    abstract public boolean vesselAvailable();
}
