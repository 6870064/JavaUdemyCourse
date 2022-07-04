package com.company;

import com.company.enums.OperationSystem;
import com.company.enums.Vendor;

public class Tablet extends MobileDevice {

    public boolean isPenAvailable;
    int tabletCount;

    public Tablet(OperationSystem operationSystem, Vendor vendor, double osVersion, double screenSize, int price, boolean isPenAvailable) {
        super(operationSystem, vendor, osVersion, screenSize, price);

        tabletCount++;
        System.out.println("Tablet is initialized");
    }

    @Override
    public int calcDeliveryPrice() {
        return 10;
    }

    @Override
    public int calcOrderPrice() {
        return 5;
    }
}
