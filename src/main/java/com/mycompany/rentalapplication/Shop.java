/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rentalapplication;

/**
 *
 * @author sarah
 */
public class Shop extends Building {

    public Shop() {
    }

    public Shop(String name, Address address, int size) {
        super(name, address, size);
    }
    
    
    @Override
    public double calculateRent(){
        return this.getSize() * 100 ;

    };
}
