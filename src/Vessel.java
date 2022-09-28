import java.util.ArrayList;

abstract class Vessel {
    String flagNation;
    int draft;
    int length;
    int width;

    abstract public void loadingCargo(ArrayList<Cargo> cargoList);

    abstract public float utilityLevelOfCapacity();
}
