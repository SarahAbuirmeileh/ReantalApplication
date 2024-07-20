/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rentalapplication;

/**
 *
 * @author sarah
 */
public abstract class Building {
    private String name;
    private Address address;
    private int size;
    
    public Building(String name, Address address, int size) {
        this.name = name;
        this.address = address;
        this.size = size;
    }
    
    public Building(){
    }
    
    public abstract double calculateRent();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
}
