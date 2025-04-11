package com.pluralsight.model;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Vehicle {
    private int vehicleId;
    private String makeModel;
    private String color;
    private boolean hasTowingPackage;
    private int odometerReading;
    private double price;
    private char qualityRating;
    private String phoneNumber;
    private String socialSecurityNumber;
    private String zipCode;

    @Override
    public String toString() {
        return "Vehicle Details:\n" +
                "-----------------------------\n" +
                "Vehicle ID           : " + vehicleId + "\n" +
                "Make & Model         : " + makeModel + "\n" +
                "Color                : " + color + "\n" +
                "Towing Package       : " + (hasTowingPackage ? "Yes" : "No") + "\n" +
                "Odometer Reading     : " + odometerReading + " miles\n" +
                "Price                : $" + String.format("%.2f", price) + "\n" +
                "Quality Rating       : " + qualityRating + "\n" +
                "Phone Number         : " + phoneNumber + "\n" +
                "Social Security #    : " + socialSecurityNumber + "\n" +
                "ZIP Code             : " + zipCode;
    }

}
