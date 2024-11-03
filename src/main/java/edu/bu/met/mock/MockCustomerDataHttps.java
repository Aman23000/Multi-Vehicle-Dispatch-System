/**
 * Name: Aman Jain
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/02/2024
 * File Name: MockCustomerDataHttps.java
 * Description: Mock implementation of CustomerDataHttps for testing purposes.
 */
package edu.bu.met.cs665.mock;

import edu.bu.met.cs665.data.CustomerDataHttps;

public class MockCustomerDataHttps implements CustomerDataHttps {
    @Override
    public String getCustomer_Https(int customerId) {
        return "Mock HTTPS Customer: " + customerId;
    }

    @Override
    public String getCustomerName_Https(int customerId) {
        return "Mock HTTPS Customer Name for ID: " + customerId;
    }
}
