package org.example.carInventorySystem;

public class Truck extends Car{
    private  double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }
    public double getTowingCapacity() {
        return towingCapacity;
    }
    @Override
    public String getInfo() {
        return super.getInfo() + "\nType: Truck" +
                "\nTowing Capacity: " + towingCapacity + " lbs";
    }
}
