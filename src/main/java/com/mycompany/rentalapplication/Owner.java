/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rentalapplication;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author sarah
 */
public class Owner extends Customer {
    private List<Building> buildings;

    public Owner(String name, String email) {
        super(name, email);
        this.buildings = new ArrayList<>();
    }
    
    public Owner(String name, String email, List<Building> buildings) {
        super(name, email);
        this.buildings = buildings;
    }

    public void addBuilding(Building building) {
        buildings.add(building);
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<Building> buildings) {
        this.buildings = buildings;
    }
}
