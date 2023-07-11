package com.alphaautomobilebeans;

import jakarta.persistence.*;



@Entity
@Table(name = "automobile_service")
public class AutomobileService {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "service_id")
    private int serviceId;
    @Column(name = "service_name")
    private String serviceName;
    @Column(name = "service_details")
    private String serviceDetails;
    @Column(name = "service_photo")
    private  String servicePhoto;
    @Column(name = "service_cost")
    private int serviceCost;

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceDetails() {
        return serviceDetails;
    }

    public void setServiceDetails(String serviceDetails) {
        this.serviceDetails = serviceDetails;
    }

   public String getServicePhoto(){return servicePhoto;}
   public void setServicePhoto(String servicePhoto){this.servicePhoto = servicePhoto;}
    public int getServicsCost() {
        return serviceCost;
    }

    public void setServicsCost(int servicsCost) {
        this.serviceCost = servicsCost;
    }

    @Override
    public String toString() {
        return "AutomobileServics{" +
                "servicsId=" + serviceId +
                ", servicName='" + serviceName + '\'' +
                ", servicDescription='" + serviceDetails + '\'' +
                ", servicsCost=" + serviceCost +
                '}';
    }
}
