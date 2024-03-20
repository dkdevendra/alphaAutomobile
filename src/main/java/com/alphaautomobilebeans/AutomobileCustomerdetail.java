package com.alphaautomobilebeans;

import jakarta.persistence.*;


@Entity
@Table(name = "CustomerDetil")
public class AutomobileCustomerdetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customerName")
    private String customerName;

    @Column(name = "customerMobileNumber")
    public int customerMobileNumber;
    @Column(name ="customerAddress")
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

    @Override
    public String toString() {
        return "AutomobileCustomerdetail{" +
                "customerName='" + customerName + '\'' +
                ", customerMobileNumber=" + customerMobileNumber +
                ", customerAddress='" + customerAddress + '\'' +
                '}';
    }
}
