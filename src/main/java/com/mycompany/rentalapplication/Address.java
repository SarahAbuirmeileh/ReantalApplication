/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rentalapplication;

/**
 *
 * @author sarah
 */
public class Address {
    private String country;
    private String city;
    private String street;
    
    public Address(){
        
    }
    
    public Address(String country, String city, String street) {
        this.country = country;
        this.city = city;
        this.street = street;
    }
    
    public String getCountry() {
        return country;
    }


    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    
    @Override
    public String toString() {
        return this.getCountry() + ", " + this.getCity() + ", " + this.getStreet();
    }
    
}
