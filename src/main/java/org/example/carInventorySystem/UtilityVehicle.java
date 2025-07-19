package org.example.carInventorySystem;

public class UtilityVehicle extends Car{
    private boolean fourWheelDrive;
    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }
    public  boolean hasFourWheelDrive() {
        return fourWheelDrive;
    }
    @Override
    public String getInfo() {
        return super.getInfo() + "\nType: Utility Vehicle" +
                "\nFour-Wheel Drive: " + (fourWheelDrive ? "Yes" : "No");
    }
}
