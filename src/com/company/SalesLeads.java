package com.company;

public class SalesLeads
{
    private int leadID;
    private String leadName;
    private int numberSold;

    public SalesLeads(int leadID, String leadName, int numberSold)
    {
        this.leadID = leadID;
        this.leadName = leadName;
        this.numberSold = numberSold;
    }

    // Setters
    public void setLeadID(int leadID) {
        this.leadID = leadID;
    }

    public void setLeadName(String leadName) {
        this.leadName = leadName;
    }

    public void setNumberSold(int numberSold) {
        this.numberSold = numberSold;
    }

    // Getters
    public String getLeadName()
    {
        return leadName;
    }

    public int getLeadID()
    {
        return leadID;
    }

    public int getNumberSold()
    {
        return numberSold;
    }

    // Converts data into usable string
    public String toString()
    {
        return ("Lead ID: " + leadID + ", Name: " + leadName + ", Sold: " + numberSold);
    }
}
