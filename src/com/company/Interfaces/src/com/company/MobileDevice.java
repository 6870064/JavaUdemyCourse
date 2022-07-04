package com.company;

import com.company.enums.OperationSystem;
import com.company.enums.Vendor;

public abstract class MobileDevice {

    OperationSystem operationSystem;
    static Vendor vendor;
    private static double osVersion;
    public double screenSize;
    public int price;


    public MobileDevice(OperationSystem operationSystem, Vendor vendor, double osVersion, double screenSize, int price) {
        this.operationSystem = operationSystem;
        this.vendor = vendor;
        this.osVersion = osVersion;
        this.screenSize = screenSize;
        this.price = price;
    }

    public OperationSystem getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(OperationSystem operationSystem) {
        this.operationSystem = operationSystem;
    }

    public static Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public double getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(double osVersion) {
        this.osVersion = osVersion;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void deviceCharge(){
        System.out.println("Device is charging");
    }

    public static void versionUpdate(){
        osVersion +=0.1;
        System.out.println(String.format("New os version is equal " +osVersion));
    }

    public static void deviceCalling(){
        System.out.println(new StringBuilder().append(getVendor()).append(" is calling").toString());
    }
}




