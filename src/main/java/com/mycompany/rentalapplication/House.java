/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rentalapplication;

/**
 *
 * @author sarah
 */
public class House extends Building {
    
    private int roomNumber;
    private boolean hasGarden;

    public House() {
    }

    public House(String name, Address address, int size, int roomNumber, boolean hasGarden) {
        super(name, address, size);
        this.roomNumber = roomNumber;
        this.hasGarden = hasGarden;
    }
    
    
    @Override
    public double calculateRent(){
        int garden = 0;
        if(this.hasGarden){
            garden =100;
        }
        return this.getSize() * 100 + this.getRoomNumber()*7 + garden;

    };

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }
    
}
