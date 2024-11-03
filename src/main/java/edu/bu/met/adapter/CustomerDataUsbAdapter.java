/**
 * Name: Aman Jain
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/02/2024
 * File Name: CustomerDataUsbAdapter.java
 * Description: Adapter class to allow USB data retrieval through HTTPS interface.
 */

package edu.bu.met.cs665.adapter;

import edu.bu.met.cs665.data.CustomerDataUsb;
import edu.bu.met.cs665.data.CustomerDataHttps;

public class CustomerDataUsbAdapter implements CustomerDataHttps {
    private final CustomerDataUsb usbData;

    public CustomerDataUsbAdapter(CustomerDataUsb usbData) {
        this.usbData = usbData;
    }

    @Override
    public String getCustomer_Https(int customerId) {
        return usbData.getCustomer_Usb(customerId);
    }

    @Override
    public String getCustomerName_Https(int customerId) {
        return usbData.getCustomerName_Usb(customerId);
    }
}
