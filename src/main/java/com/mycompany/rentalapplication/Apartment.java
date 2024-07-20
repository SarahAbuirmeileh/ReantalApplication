/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rentalapplication;

/**
 *
 * @author sarah
 */
public class Apartment extends Building {
    
    private int floorNumber;
    private int roomNumber;

    public Apartment() {
    }

    public Apartment(String name, Address adrerss, int size, int floorNumber, int roomNumber) {
        super(name, adrerss, size);
        this.floorNumber=floorNumber;
        this.roomNumber=roomNumber;
    }
    
    @Override
    public double calculateRent(){
        return this.getSize() * 100 + this.getFloorNumber()*0.5 + this.getRoomNumber()*7;
    };

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
    
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    
}
