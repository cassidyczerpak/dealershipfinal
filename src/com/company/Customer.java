package com.company;

public class Customer
{
    private int customerID;
    private String customerName;
    private int customerSSN;

    public Customer(int customerID, String customerName, int customerSSN)
    {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerSSN = customerSSN;
    }

    // Setters
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerSSN(int customerSSN) {
        this.customerSSN = customerSSN;
    }

    // Getters
    public String getCustomerName()
    {
        return customerName;
    }

    public int getCustomerSSN()
    {
        return customerSSN;
    }

    public int getCustomerID()
    {
        return customerID;
    }

    // Converts data into usable string
    public String toString()
    {
        return ("Customer ID: " + customerID + ", Name: " + customerName + ", SSN: " + customerSSN);
    }
}
