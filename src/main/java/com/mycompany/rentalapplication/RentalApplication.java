/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.rentalapplication;

/**
 *
 * @author sarah
 */
public class RentalApplication {

    public static void main(String[] args) {
        Address address1 = new Address("Palestine", "Hebron", "Ain Sarah");
        Address address2 = new Address("Palestine", "Hebron", "Wadi Al-Haria");
        Address address3 = new Address("Palestine", "Hebron", "Shuhada Street ");

        Apartment apartment = new Apartment("Luxury Apartment", address1, 180, 7, 5);
        House house = new House("Family House", address2, 200, 4, true);
        Shop shop = new Shop("Downtown Shop", address3, 160);

        Owner owner = new Owner("Sarah Abu Irmeileh", "sarahabuirmeileh@gmail.com");
        owner.addBuilding(apartment);
        owner.addBuilding(house);
        owner.addBuilding(shop);

        Customer customer = new Customer("Lujain Abu Rajab", "211045@ppu.edu.ps");

        PaymentMethod paypal = new Paypal("211045@ppu.edu.ps");
        PaymentMethod visa = new Visa("4111111111111111", "12/24");

        Contract apartmentContract = new Contract(apartment, customer, owner, 12, apartment.calculateRent(), paypal, "TXN12345");
        Contract houseContract = new Contract(house, customer, owner, 6, house.calculateRent(), visa, "TXN67890");

        customer.addContract(apartmentContract);
        customer.addContract(houseContract);

        System.out.println("Customer: " + customer.getName() + " (" + customer.getEmail() + ")");
        for (Contract contract : customer.getContracts()) {
            System.out.println("Contract for: " + contract.getBuilding().getName());
            System.out.println("Owned By: " + contract.getOwner().getName());
            System.out.println("Address: " + contract.getBuilding().getAddress());
            System.out.println("Rental Period: " + contract.getRentalPeriod() + " months");
            System.out.println("Price: $" + contract.getPrice());
            System.out.println("Payment Method: " + (contract.getPaymentMethod() instanceof Paypal ? "PayPal" : contract.getPaymentMethod() instanceof Visa ? "Visa" : "MasterCard"));
            System.out.println("Transaction Code: " + contract.getTransactionCode());
            System.out.println();

        }
    }
}
