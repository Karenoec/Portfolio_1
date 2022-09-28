abstract public class Vehicle extends Cargo {
    protected int length;

    //public Vehicle(){}

    abstract public int getLength();
}

class Car extends Vehicle{

    public Car(){
        length = 8;
    }

    @Override
    public int getLength() {
        return length;
    }
}


class Truck extends Vehicle{

    public Truck(){
        length = 30;
    }

    @Override
    public int getLength() {
        return length;
    }
}
