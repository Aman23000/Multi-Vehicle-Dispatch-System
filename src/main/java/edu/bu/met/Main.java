/**
 * Name: Aman Jain
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/02/2024
 * File Name: Main.java
 * Description: Demonstrates the functionality of integrating legacy USB customer data with the new HTTPS system using the adapter pattern and managing customer data with a repository.
 */
package edu.bu.met.cs665;

import edu.bu.met.cs665.adapter.CustomerDataUsbAdapter;
import edu.bu.met.cs665.data.Customer;
import edu.bu.met.cs665.data.CustomerDataUsb;
import edu.bu.met.cs665.data.CustomerDataHttps;
import edu.bu.met.cs665.mock.MockCustomerDataUsb;
import edu.bu.met.cs665.mock.MockCustomerDataHttps;
import edu.bu.met.cs665.repository.CustomerRepository;

/**
 * This is the Main class.
 */
public class Main {

    /**
     * A main method to demonstrate the integration of legacy and new customer data systems.
     * This method showcases the use of an adapter to access legacy USB data via HTTPS interface
     * and demonstrates the use of a repository to manage customer data.
     */
    public static void main(String[] args) {
        // Create instances of the mock USB and HTTPS customer data
        CustomerDataUsb usbData = new MockCustomerDataUsb();
        CustomerDataHttps httpsData = new MockCustomerDataHttps();

        // Use the adapter to allow USB data to be accessed as HTTPS
        CustomerDataUsbAdapter adapter = new CustomerDataUsbAdapter(usbData);

        // Repository for managing customers
        CustomerRepository repository = new CustomerRepository();

        // Adding customers to the repository
        repository.addCustomer(new Customer(1, "Alice", "alice@example.com"));
        repository.addCustomer(new Customer(2, "Bob", "bob@example.com"));

        // Fetching and displaying customer data via HTTPS
        System.out.println("Fetching customer data via HTTPS:");
        System.out.println(httpsData.getCustomer_Https(1));
        System.out.println(httpsData.getCustomerName_Https(1));

        // Fetching and displaying customer data via USB adapter (using HTTPS interface)
        System.out.println("\nFetching customer data via USB adapter (HTTPS interface):");
        System.out.println(adapter.getCustomer_Https(2));
        System.out.println(adapter.getCustomerName_Https(2));

        // Fetching customer from repository
        Customer customer = repository.getCustomer(1);
        if (customer != null) {
            System.out.println("\nCustomer from repository:");
            System.out.println("ID: " + customer.getId());
            System.out.println("Name: " + customer.getName());
            System.out.println("Email: " + customer.getEmail());
        } else {
            System.out.println("\nCustomer with ID 1 not found in repository.");
        }
    }
}
