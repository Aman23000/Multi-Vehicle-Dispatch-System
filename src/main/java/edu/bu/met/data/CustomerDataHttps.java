/**
 * Name: Aman Jain
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/02/2024
 * File Name: CustomerDataHttps.java
 * Description: Interface for retrieving customer data through HTTPS.
 */
package edu.bu.met.cs665.data;

public interface CustomerDataHttps {
    String getCustomer_Https(int customerId);
    String getCustomerName_Https(int customerId);
}
