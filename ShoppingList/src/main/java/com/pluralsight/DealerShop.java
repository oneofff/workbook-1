package com.pluralsight;

import com.pluralsight.model.Vehicle;

public class DealerShop {
    public static void main(String[] args) {
        Vehicle x5 = buildX5();
        System.out.println(x5);
        int x = 5;
        System.out.println(printType(x));
    }

    public static Vehicle buildX5() {
        return Vehicle.builder()
                .vehicleId(123)
                .makeModel("BMW")
                .color("Gold")
                .hasTowingPackage(false)
                .odometerReading(143214)
                .price(8500)
                .qualityRating('S')
                .phoneNumber("9802153434")
                .socialSecurityNumber("123-23-2131")
                .zipCode("28278")
                .build();


    }

    private static String printType(Object o){
        return o.getClass().getSimpleName();
    }
}
