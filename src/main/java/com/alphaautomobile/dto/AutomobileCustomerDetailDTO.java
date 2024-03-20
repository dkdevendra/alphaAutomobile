package com.alphaautomobile.dto;

public class AutomobileCustomerDetailDTO {
    private String customerName;
    public int customerMobileNumber;
    private String customerAddress;

    public int getCustomerMobileNumber() {
        return customerMobileNumber;
    }
    public void setCustomerMobileNumber(int customerMobileNumber) {
        this.customerMobileNumber = customerMobileNumber;
    }
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public String toString() {
        return "AutomobileCustomerDetailDTO{" +
                "customerName='" + customerName + '\'' +
                ", customerMobileNumber=" + customerMobileNumber +
                ", customerAddress='" + customerAddress + '\'' +
                '}';
    }
}
