package com.company;

import com.company.enums.OperationSystem;
import com.company.enums.Vendor;

public class MobilePhone extends MobileDevice {

    int mobileDeviceCount;

    public MobilePhone(OperationSystem operationSystem, Vendor vendor, double osVersion, double screenSize, int price) {
        super(operationSystem, vendor, osVersion, screenSize, price);

        mobileDeviceCount++;
        System.out.println("Mobile device is initialized");
    }

}
