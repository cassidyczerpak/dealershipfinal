package com.company;

public class Dealership
{
    private int dealershipID;
    private String dealershipName;
    private String dealershipAddress;

    public Dealership(int dealershipID, String dealershipName, String dealershipAddress)
    {
        this.dealershipID = dealershipID;
        this.dealershipName = dealershipName;
        this.dealershipAddress = dealershipAddress;
    }

    // Setters
    public void setDealershipID(int dealershipID) {
        this.dealershipID = dealershipID;
    }

    public void setDealershipName(String dealershipName) {
        this.dealershipName = dealershipName;
    }

    public void setDealershipAddress(String dealershipAddress) {
        this.dealershipAddress = dealershipAddress;
    }

    // Getters
    public String getDealershipName()
    {
        return dealershipName;
    }

    public String getDealershipAddress()
    {
        return dealershipAddress;
    }

    public int getDealershipID()
    {
        return dealershipID;
    }

    // Converts data into usable string
    public String toString()
    {
        return("ID: "+ dealershipID + ", Dealership Name: " + dealershipName + ", Address: " + dealershipAddress);
    }
}
