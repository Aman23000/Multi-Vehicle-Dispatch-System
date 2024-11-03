/**
 * Name: Aman Jain
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/02/2024
 * File Name: CustomerRepository.java
 * Description: Repository for managing and accessing customer data.
 */
package edu.bu.met.cs665.repository;

import edu.bu.met.cs665.data.Customer;
import java.util.HashMap;
import java.util.Map;

public class CustomerRepository {
    private Map<Integer, Customer> customerData = new HashMap<>();

    public void addCustomer(Customer customer) {
        customerData.put(customer.getId(), customer);
    }

    public Customer getCustomer(int customerId) {
        return customerData.get(customerId);
    }
}
