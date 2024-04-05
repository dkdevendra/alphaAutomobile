package com.alphaautomobilebeans;

import jakarta.persistence.*;


@Entity
@Table(name = "customer_details")
public class AutomobileCustomerdetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id")
    private int customerId;
    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "customer_mobile_number")
    public int customerMobileNumber;
    @Column(name ="customer_address")
    private String customerAddress;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerMobileNumber() {
        return customerMobileNumber;
    }

    public void setCustomerMobileNumber(int customerMobileNumber) {
        this.customerMobileNumber = customerMobileNumber;
    }

    public String getCustomerAddres() {
        return customerAddress;
    }

    public void setCustomerAddres(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public String toString() {
        return "AutomobileCustomerdetail{" +
                "customerName='" + customerName + '\'' +
                ", customerMobileNumber=" + customerMobileNumber +
                ", customerAddress='" + customerAddress + '\'' +
                '}';
    }
}
