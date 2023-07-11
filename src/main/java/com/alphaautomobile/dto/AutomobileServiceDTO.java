package com.alphaautomobile.dto;

public class AutomobileServiceDTO {

    private int serviceId;
    private String serviceName;
    private String serviceDetails;
    private  String servicePhoto;
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

    public String getServicePhoto() {
        return servicePhoto;
    }

    public void setServicePhoto(String servicePhoto) {
        this.servicePhoto = servicePhoto;
    }

    public int getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(int serviceCost) {
        this.serviceCost = serviceCost;
    }

    @Override
    public String toString() {
        return "AutomobileServiceDTO{" +
                "serviceID='"+ serviceId + '\'' +
                "serviceName='" + serviceName + '\'' +
                ", serviceDetails='" + serviceDetails + '\'' +
                ", servicePhoto='" + servicePhoto + '\'' +
                ", serviceCost=" + serviceCost +
                '}';
    }
}
