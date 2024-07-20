/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rentalapplication;

/**
 *
 * @author sarah
 */
public class Paypal extends PaymentMethod {
    private String email;

    public Paypal(String email) {
        this.email = email;
    }
    
    public Paypal(){

    }
     
    @Override
    public boolean pay(double amount) {
        System.out.println("From PayPal");
        return true;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

}
