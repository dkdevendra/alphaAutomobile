package com.alphaautomobile.dto;

import com.alphaautomobilebeans.AutomobileParts;

public class AutomobilePartsDTO {
    private int inventoryId;
    private String partName;
    private String description;
    private int partPrice;
    private  String partType;
    private String partAvailable;
    private  String serviceRepairPart;
    private  int partCount;
    private int updatingDate;

    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPartPrice() {
        return partPrice;
    }

    public void setPartPrice(int partPrice) {
        this.partPrice = partPrice;
    }

    public String getPartType() {
        return partType;
    }

    public void setPartType(String partType) {
        this.partType = partType;
    }

    public String getPartAvailable() {
        return partAvailable;
    }

    public void setPartAvailable(String partAvailable) {
        this.partAvailable = partAvailable;
    }

    public String getServiceRepairPart() {
        return serviceRepairPart;
    }

    public void setServiceRepairPart(String serviceRepairPart) {
        this.serviceRepairPart = serviceRepairPart;
    }

    public int getPartCount() {
        return partCount;
    }

    public void setPartCount(int partCount) {
        this.partCount = partCount;
    }

    public int getUpdatingDate() {
        return updatingDate;
    }

    public void setUpdatingDate(int updatingDate) {
        this.updatingDate = updatingDate;
    }

    @Override
    public String toString() {
        return "AutomobilePartsDTO{" +
                "inventoryId=" + inventoryId +
                ", partName='" + partName + '\'' +
                ", description='" + description + '\'' +
                ", partPrice=" + partPrice +
                ", partType='" + partType + '\'' +
                ", partAvailable='" + partAvailable + '\'' +
                ", serviceRepairPart='" + serviceRepairPart + '\'' +
                ", partCount=" + partCount +
                ", updatingDate=" + updatingDate +
                '}';
    }

}
