package com.company;

import com.company.enums.Manufacturer;

public class ElectricCar extends Vehicle{

    private int batteryCapacity;
    private int passengerNumber;

    public ElectricCar(String model, Manufacturer manufacturer, Engine engine, Driver driver) {
        super(model, manufacturer, engine, driver);
        this.batteryCapacity = batteryCapacity;
        this.passengerNumber = passengerNumber;
        System.out.println("ElectricCar was initialized");
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public void batterCharge(){
        System.out.println("Battery is charging");
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryCapacity=" + batteryCapacity +
                ", passengerNumber=" + passengerNumber +
                ", isRunning=" + isRunning +
                ", manufacturer=" + manufacturer +
                ", engine=" + engine +
                ", driver=" + driver +
                '}';
    }
}
