package com.company;

public class SalesPerson
{
    private int salespersonID;
    private String salespersonName;
    private int salespersonPassword;

    public SalesPerson(int salespersonID, String salespersonName, int salespersonPassword)
    {
        this.salespersonID = salespersonID;
        this.salespersonName = salespersonName;
        this.salespersonPassword = salespersonPassword;
    }

    // Setters
    public void setSalespersonID(int salespersonID) {
        this.salespersonID = salespersonID;
    }

    public void setSalespersonName(String salespersonName) {
        this.salespersonName = salespersonName;
    }

    public void setSalespersonPassword(int salespersonPassword) {
        this.salespersonPassword = salespersonPassword;
    }

    // Getters
    public String getSalespersonName()
    {
        return salespersonName;
    }

    public int getSalespersonPassword()
    {
        return salespersonPassword;
    }

    public int getSalespersonID()
    {
        return salespersonID;
    }

    // Converts data into usable string
    public String toString()
    {
        return("Salesperson ID: " + salespersonID + ", Name: " + salespersonName + ", Password: " + salespersonPassword);
    }
}
