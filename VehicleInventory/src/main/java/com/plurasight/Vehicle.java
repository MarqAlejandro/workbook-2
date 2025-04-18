package com.plurasight;

public class Vehicle {
    private long vehicleId;                                    //initialized private variables
    private String makeModel;
    private String color;
    private int odometerReading;
    private float price;

    public Vehicle() {                                      //empty constructor
        this.vehicleId = 0;
        this.makeModel = "";
        this.color = "";
        this.odometerReading = 0;
        this.price = 0;

    }
                                                            //preconstructed constructor
    public Vehicle(long vehicleId, String makeModel, String color, int odometerReading, float price) {
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }
    public void displayVehicleInfo(){                       //display Vehicle data
        System.out.println("ID: " + getVehicleId() +
                ", Make & Model: " + getMakeModel() +
                ", Color: " + getColor() +
                ", Milage: " + getOdometerReading() +
                ", Price: " + getPrice());
    }


    public long getVehicleId() {                            //list of setters and getters
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
