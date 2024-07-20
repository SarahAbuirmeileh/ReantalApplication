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
public class Customer {
    private String name;
    private String email;
    private List<Contract> contracts;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.contracts = new ArrayList<>();
    }
    
    public Customer(){
        
    }
    
    public void addContract(Contract contract) {
        contracts.add(contract);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }
}
