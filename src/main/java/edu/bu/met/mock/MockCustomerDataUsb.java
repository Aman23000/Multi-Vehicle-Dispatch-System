/**
 * Name: Aman Jain
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/02/2024
 * File Name: MockCustomerDataUsb.java
 * Description: Mock implementation of CustomerDataUsb for testing purposes.
 */
package edu.bu.met.cs665.mock;

import edu.bu.met.cs665.data.CustomerDataUsb;

public class MockCustomerDataUsb implements CustomerDataUsb {
    @Override
    public String getCustomer_Usb(int customerId) {
        return "Mock USB Customer: " + customerId;
    }

    @Override
    public String getCustomerName_Usb(int customerId) {
        return "Mock USB Customer Name for ID: " + customerId;
    }
}
