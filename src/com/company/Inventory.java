package com.company;

public class Inventory
{
    protected int inventoryID;
    protected String inventoryName;
    protected int numberSold;

    public Inventory(int inventoryID, String inventoryName, int numberSold)
    {
        this.inventoryID = inventoryID;
        this.inventoryName = inventoryName;
        this.numberSold = numberSold;
    }

    // Setters
    public void setInventoryID(int inventoryID) {
        this.inventoryID = inventoryID;
    }

    public void setInventoryName(String inventoryName) {
        this.inventoryName = inventoryName;
    }

    public void setNumberSold(int numberSold) {
        this.numberSold = numberSold;
    }

    // Getters
    public String getInventoryName()
    {
        return inventoryName;
    }

    public int getNumberSold()
    {
        return numberSold;
    }

    public int getInventoryID()
    {
        return inventoryID;
    }

    // Converts data into usable string
    public String toString()
    {
        return ("Inventory ID: " + inventoryID + ", Name: " + inventoryName + ", Sold: " + numberSold);
    }
}
