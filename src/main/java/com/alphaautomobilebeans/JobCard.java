package com.alphaautomobilebeans;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "job_card")
public class JobCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "job_card_id")
    private int jobCardId;
    @Column(name = "make")
    private String make;
    @Column(name ="model")
    private String model;
    @Column(name = "vehicle_number")
    private String vehicleNumber;
    @Column(name = "service")
    private String service;
    @Column(name = "delivery_date")
    private Date deliveryDate;
    @Column(name = "estimated_cost")
    private int estimatedCost;
    @Column(name = "contact_number")
    private String contactNumber;

    public int getJobCardId() {
        return jobCardId;
    }

    public void setJobCardId(int jobCardId) {
        this.jobCardId = jobCardId;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public int getEstimatedCost() {
        return estimatedCost;
    }

    public void setEstimatedCost(int estimatedCost) {
        this.estimatedCost = estimatedCost;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "JobCard{" +
                "jobCardId=" + jobCardId +
                ", make='" + make + '\'' +
                ", model=" + model +
                ", vehicleNumber=" + vehicleNumber +
                ", service='" + service + '\'' +
                ", deliveryDate=" + deliveryDate +
                ", estimatedCost=" + estimatedCost +
                ", contactNumber=" + contactNumber +
                '}';
    }
}
