/*
This is part 1 of the portfolio project
Subject Module Course 2: Software Development
Group members:
- Eline Lindegaard Holbech  -  elliho@ruc.dk
- Karen Østergaard Christiansen  -  kaoech@ruc.dk
 */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Demonstrating loading cargo on a ContainerVessel
        ContainerVessel Mary = new ContainerVessel("Germany", 4, 60, 20, 3);
        Container container1 = new Container();
        Container container2 = new Container();
        Container container3 = new Container();
        ArrayList<Cargo> containerList = new ArrayList<>();
        containerList.add(container1);
        containerList.add(container2);
        containerList.add(container3);
        Mary.loadingCargo(containerList);
        System.out.println("There are " + Mary.loadedCargoAmount() + " containers loaded onto the container vessel and "
                + Mary.utilityLevelOfCapacity()*100 + "% of the capacity is being used.");

        // Demonstrating loading cargo on a Tanker
        Tanker Sally = new Tanker("Spain", 6, 80,30,5);
        Compartment compartment1 = new Compartment();
        Compartment compartment2 = new Compartment();
        ArrayList<Cargo> compartmentList = new ArrayList<>();
        compartmentList.add(compartment1);
        compartmentList.add(compartment2);
        Sally.loadingCargo(compartmentList);
        System.out.println("There are " + Sally.loadedCargoAmount() + " compartments occupied on the tanker and "
                + Sally.utilityLevelOfCapacity()*100 + "% of the capacity is being used.");


        // Demonstrating loading cargo on a RoRoVessel
        RoRoVessel Dani = new RoRoVessel("Australia", 6, 120,30, 80);
        Car car1 = new Car();
        Truck truck1 = new Truck();
        ArrayList<Cargo> cargoList = new ArrayList<>();
        cargoList.add(car1);
        cargoList.add(truck1);
        Dani.loadingCargo(cargoList);
        System.out.println("There are " + Dani.loadedCargoAmount() + " vehicles loaded onto the RoRo vessel and "
                + Dani.utilityLevelOfCapacity()*100 + "% of the capacity is being used.");

    }

}