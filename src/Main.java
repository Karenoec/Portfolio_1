/*
This is part 1 of the portfolio project
Date: 30th of September 2022
Subject Module Course 2: Software Development
Group members:
- Eline Lindegaard Holbech  -  elliho@ruc.dk
- Karen Østergaard Christiansen  -  kaoech@ruc.dk
 */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Demonstrating loading cargo on a ContainerVessel
        Vessel Mary = new ContainerVessel("Germany", 4, 60, 20, 3);
        Cargo container1 = new Container();
        Cargo container2 = new Container();
        Cargo container3 = new Container();
        ArrayList<Cargo> containerList = new ArrayList<>();
        containerList.add(container1);
        containerList.add(container2);
        containerList.add(container3);
        Mary.loadingCargo(containerList);

        // Demonstrating loading cargo on a Tanker
        Vessel Sally = new Tanker("Spain", 6, 80,30,5);
        Cargo compartment1 = new Compartment();
        Cargo compartment2 = new Compartment();
        ArrayList<Cargo> compartmentList = new ArrayList<>();
        compartmentList.add(compartment1);
        compartmentList.add(compartment2);
        Sally.loadingCargo(compartmentList);

        // Demonstrating loading cargo on a RoRoVessel
        Vessel Dani = new RoRoVessel("Australia", 6, 120,30, 80);
        Vehicle car1 = new Car();
        Vehicle truck1 = new Truck();
        ArrayList<Cargo> cargoList = new ArrayList<>();
        cargoList.add(car1);
        cargoList.add(truck1);
        Dani.loadingCargo(cargoList);
    }

}