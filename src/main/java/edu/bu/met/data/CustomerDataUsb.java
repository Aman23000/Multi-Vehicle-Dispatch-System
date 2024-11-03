/**
 * Name: Aman Jain
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/02/2024
 * File Name: CustomerDataUsb.java
 * Description: Interface for retrieving customer data through USB.
 */
package edu.bu.met.cs665.data;

public interface CustomerDataUsb {
    String getCustomer_Usb(int customerId);
    String getCustomerName_Usb(int customerId);
}
