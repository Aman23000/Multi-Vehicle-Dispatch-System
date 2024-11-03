/**
 * Name: Aman Jain
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/02/2024
 * File Name: Customer.java
 * Description: Represents a customer with ID, name, and email.
 */
package edu.bu.met.cs665.data;

public class Customer {
    private int id;
    private String name;
    private String email;

    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
