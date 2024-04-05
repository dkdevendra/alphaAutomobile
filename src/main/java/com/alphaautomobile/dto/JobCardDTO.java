package com.alphaautomobile.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class JobCardDTO {
    private int jobCardId;
    private String make;
    private String model;
    private String VehicleNumber;
    private String Services;
    private Date deliveryDate;
    private int estimatedCost;
    private  String contactNumber;
}
