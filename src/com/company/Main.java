/*
Project: Team Project 1
Purpose Details: Car dealership
Course: IST 242
Author: Team 2
Date Developed: 6/2/19
Last Date Changed: 6/5/19
Revision: 2
*/

package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        // Data storage
        List<String> dealer = new ArrayList<>();
        List<String> salesPerson = new ArrayList<>();
        List<String> salesLead = new ArrayList<>();
        List<String> customer = new ArrayList<>();
        List<String> inventory = new ArrayList<>();
        List<String> vehicle = new ArrayList<>();
        List<String> parts = new ArrayList<>();

        // New dealerships
        Dealership d1 = new Dealership(0, "Cars4Sale", "123 Cars Road");
        dealer.add(d1.toString());

        Dealership d2 = new Dealership(1,"Hi","555 Blank Road");
        dealer.add(d2.toString());
        System.out.println(dealer);

        // New salesperson
        SalesPerson s1 = new SalesPerson(0, "Sam",0000);
        salesPerson.add(s1.toString());

        SalesPerson s2 = new SalesPerson(1,"Bob",1111);
        salesPerson.add(s2.toString());
        System.out.println(salesPerson);

        // New sales leads
        SalesLeads sl1 = new SalesLeads(0,"Sam",100);
        salesLead.add(sl1.toString());

        SalesLeads sl2 = new SalesLeads(1,"Bob",150);
        salesLead.add(sl2.toString());
        System.out.println(salesLead);

        // New customers
        Customer c1 = new Customer(0,"Max", 000000000);
        customer.add(c1.toString());

        Customer c2 = new Customer(1,"Drew",11111111);
        customer.add(c2.toString());
        System.out.println(customer);

        // New inventory
        Inventory i1 = new Inventory(0,"Used Cars",200);
        inventory.add(i1.toString());

        Inventory i2 = new Inventory(1,"New Cars",500);
        inventory.add(i2.toString());
        System.out.println(inventory);

        // New Vehicles
        Vehicle v1 = new Vehicle(0,"Used Cars",50,0,"Ford","Focus");
        vehicle.add(v1.toString());

        Vehicle v2 = new Vehicle(1,"New Cars",50,1,"Acura","RDX");
        vehicle.add(v2.toString());
        System.out.println(vehicle);

        // New Parts
        Parts p1= new Parts(0,"Used Parts",300,0,"Tires",300);
        parts.add(p1.toString());

        Parts p2 = new Parts(1,"New Parts",600,1,"Windows",100);
        parts.add(p2.toString());
        System.out.println(parts);
    }
}
