package com.company;

public class Parts extends Inventory
{
    private int partsID;
    private String partsName;
    private int partsSold;

    public Parts(int inventoryID, String inventoryName, int numberSold, int partsID, String partsName, int partsSold) {
        super(inventoryID, inventoryName, numberSold);
        this.partsID = partsID;
        this.partsName = partsName;
        this.partsSold = partsSold;
    }

    // Setters
    public void setPartsID(int partsID) {
        this.partsID = partsID;
    }

    public void setPartsName(String partsName) {
        this.partsName = partsName;
    }

    public void setPartsSold(int partsSold) {
        this.partsSold = partsSold;
    }

    // Getters
    public String getPartsName()
    {
        return partsName;
    }

    public int getPartsSold()
    {
        return partsSold;
    }

    public int getPartsID()
    {
        return partsID;
    }

    // Converts data into usable string
    public String toString()
    {
        return ("Part ID: " + partsID + ", Name: " + partsName + ", Sold: " + partsSold);
    }
}
