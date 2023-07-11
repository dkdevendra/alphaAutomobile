package com.alphaautomobilebeans;

import jakarta.persistence.*;

@Entity
@Table (name = "Automobile_parts")
public class AutomobileParts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "inventory_id")
    private int inventoryId;
    private  String partName;
    @Column(name = "part_description")
    private String partDescription;
    @Column(name = "part_price")
    private int partPrice;
    @Column (name = "part_type")
    private  String partType;
    @Column (name = "part_available")
    private String partAvailable;
    @Column(name = "serviceRepair_part")
    private  String serviceRepairPart;
    @Column(name="part_count")
    private int partCount;
    @Column(name = "updating_date")
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

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
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
        return "AutomobileServicePart{" +
                "inventoryId=" + inventoryId +
                ", partName='" + partName + '\'' +
                ", partDescription='" + partDescription + '\'' +
                ", partPrice=" + partPrice +
                ", partType='" + partType + '\'' +
                ", partAvailable='" + partAvailable + '\'' +
                ", serviceRepairPart='" + serviceRepairPart + '\'' +
                ", partCount=" + partCount +
                ", updatingDate=" + updatingDate +
                '}';
    }
}
