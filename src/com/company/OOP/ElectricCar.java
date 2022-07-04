package com.company.oop;

import com.company.oop.enums.EngineType;
import com.company.oop.enums.Manufacturer;

public class ElectricCar extends Auto {

    private int batteryVolume;
    private int passengersNumber;

    public ElectricCar(Manufacturer manufacturer, String model, EngineType engineType, int batteryVolume, int passengersNumber) {
        super(manufacturer, model, new Engine());
        this.batteryVolume = batteryVolume;
        this.passengersNumber = passengersNumber;
    }

    public int getBatteryVolume() {
        return batteryVolume;
    }

    public void setBatteryVolume(int batteryVolume) {
        this.batteryVolume = batteryVolume;
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }

    public void batteryCharge() {
        System.out.println("Battery is charging");
    }

    @Override
    public void energize() {
        batteryCharge();
    }
}
