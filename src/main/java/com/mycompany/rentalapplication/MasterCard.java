/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rentalapplication;

/**
 *
 * @author sarah
 */
public class MasterCard extends PaymentMethod {
    private String cardNumber;
    private String cvv;

    public MasterCard(String cardNumber, String cvv) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }
    
    public MasterCard(){
    }
    
    @Override
    public boolean pay(double amount) {
        System.out.println("From MasterCard");
        return true; 
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
    
    

}
