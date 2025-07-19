package org.example.carInventorySystem;

public abstract class Car {
    protected String vinNumber;
    protected String make;
    protected String model;
    protected int mileage;

    public Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    public String getInfo(){
        return "VIN: " + vinNumber + "\n" +
                "Make: " + make + "\n" +
                "Model: " + model + "\n" +
                "Mileage: " + mileage + " miles";
    }
}
