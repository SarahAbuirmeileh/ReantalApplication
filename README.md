# Renting Application 🏢💳


## Overview 🎯

* This project is a renting application where users can rent different types of buildings such as apartments, houses, and shops. 
* Each building has attributes like address, name, size, and other necessary characteristics. 
* Customers can rent multiple buildings and pay using PayPal, Visa, or MasterCard. 
* The application also generates contracts between the customer and the building owner, detailing rental period, price, and other important information.

## Features ⚙️
* **Building Types:** Rent apartments, houses, and shops.

* **Customer Flexibility:** Customers can rent multiple buildings.

* **Payment Methods:** Pay via PayPal, Visa, or MasterCard.

* **Contracts:** Auto-generate contracts with rental details.

* **OOP Principles:** Utilizes inheritance, abstraction, polymorphism, aggregation, and composition.

## OOP Principles 💻
### Inheritance 💫
Inheritance is used to create a hierarchy of building types. For example, Apartment, House, and Shop classes inherit from a common Building class, which encapsulates shared properties like name, address, and size.
### Abstraction ✨
Abstraction is implemented by creating abstract classes and interfaces to define common behaviors and properties. For instance, PaymentMethod is an abstract class that can be extended by specific payment types like Paypal and Visa.
### Polymorphism 🌟
Polymorphism allows the application to handle different payment methods uniformly. By using the PaymentMethod type, the application can process payments without knowing the exact type of payment method being used.
### Aggregation ⚡️

Aggregation is used to represent relationships where one class is a part of another class. For example, an Owner can own multiple buildings, but each building exists independently.
### Composition 💫
Composition represents a strong relationship where one class is composed of one or more instances of other classes. For instance, an Address is a part of a Building and cannot exist without it.

## Class Diagram:
![RentalApplication](https://github.com/user-attachments/assets/d483ed21-683c-40f7-b7d1-12f1058dddb3)
