package com.company;

public class Vehicle extends Inventory
{
    private int carID;
    private String carMake;
    private String carModel;

    public Vehicle(int inventoryID, String inventoryName, int numberSold, int carID, String carMake, String carModel) {
        super(inventoryID, inventoryName, numberSold);
        this.carID = carID;
        this.carMake = carMake;
        this.carModel = carModel;
    }

    // Setters
    public void setCarID(int carID) {
        this.carID = carID;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    // Getters
    public String getCarMake()
    {
        return carMake;
    }

    public String getCarModel()
    {
        return carModel;
    }

    public int getCarID()
    {
        return carID;
    }

    // Converts data into usable string
    public String toString()
    {
        return("Car ID: " + carID + ", Make: " + carMake + ", Model: " + carModel);
    }
}
