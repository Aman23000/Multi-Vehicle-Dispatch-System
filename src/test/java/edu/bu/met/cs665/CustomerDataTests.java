/**
 * Name: Aman Jain
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/02/2024
 * File Name: CustomerDataTests.java
 * Description: JUnit test cases for testing the functionality of customer data retrieval and adapter.
 */
package edu.bu.met.cs665;

import edu.bu.met.cs665.adapter.CustomerDataUsbAdapter;
import edu.bu.met.cs665.data.Customer;
import edu.bu.met.cs665.data.CustomerDataUsb;
import edu.bu.met.cs665.data.CustomerDataHttps;
import edu.bu.met.cs665.mock.MockCustomerDataUsb;
import edu.bu.met.cs665.mock.MockCustomerDataHttps;
import edu.bu.met.cs665.repository.CustomerRepository;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CustomerDataTests {

    private CustomerDataUsb usbData;
    private CustomerDataHttps httpsData;
    private CustomerDataUsbAdapter adapter;
    private CustomerRepository repository;

    @Before
    public void setup() {
        usbData = new MockCustomerDataUsb();
        httpsData = new MockCustomerDataHttps();
        adapter = new CustomerDataUsbAdapter(usbData);
        repository = new CustomerRepository();
        repository.addCustomer(new Customer(1, "Alice", "alice@example.com"));
        repository.addCustomer(new Customer(2, "Bob", "bob@example.com"));
    }

    @Test
    public void testUsbDataCustomer() {
        String customerInfo = usbData.getCustomer_Usb(1);
        assertEquals("Mock USB Customer: 1", customerInfo);
    }

    @Test
    public void testUsbDataCustomerName() {
        String customerName = usbData.getCustomerName_Usb(1);
        assertEquals("Mock USB Customer Name for ID: 1", customerName);
    }

    @Test
    public void testHttpsDataCustomer() {
        String customerInfo = httpsData.getCustomer_Https(1);
        assertEquals("Mock HTTPS Customer: 1", customerInfo);
    }

    @Test
    public void testHttpsDataCustomerName() {
        String customerName = httpsData.getCustomerName_Https(1);
        assertEquals("Mock HTTPS Customer Name for ID: 1", customerName);
    }

    @Test
    public void testAdapterCustomerData() {
        String customerInfo = adapter.getCustomer_Https(1);
        assertEquals("Mock USB Customer: 1", customerInfo);
    }

    @Test
    public void testAdapterCustomerName() {
        String customerName = adapter.getCustomerName_Https(1);
        assertEquals("Mock USB Customer Name for ID: 1", customerName);
    }

    @Test
    public void testCustomerRepositoryRetrieval() {
        Customer customer = repository.getCustomer(1);
        assertNotNull("Customer retrieval from repository failed for Customer ID 1.", customer);
        assertEquals("Alice", customer.getName());
        assertEquals("alice@example.com", customer.getEmail());
    }
}
