package com.company;

import com.company.enums.Manufacturer;

public class FuelEngineCar extends Vehicle {

    private int availablePetrol;
    private int tankVolume;

    public FuelEngineCar(String model, Manufacturer manufacturer, Engine engine, Driver driver) {
        super(model, manufacturer, engine, driver);
        this.availablePetrol = availablePetrol;
        this.tankVolume = tankVolume;
    }

    public int getAvailablePetrol() {
        return availablePetrol;
    }

    public void setAvailablePetrol(int availablePetrol) {
        this.availablePetrol = availablePetrol;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }

    public void fuelUp(int petrolVolume) {
        availablePetrol += petrolVolume;
        System.out.println(String.format("Amount of fuel available is %d", availablePetrol));
    }

    @Override
    public String toString() {
        return "FuelEngineCar{" +
                "availablePetrol=" + availablePetrol +
                ", tankVolume=" + tankVolume +
                ", countVehicle=" + countVehicle +
                ", isRunning=" + isRunning +
                ", manufacturer=" + manufacturer +
                ", engine=" + engine +
                ", driver=" + driver +
                '}';
    }
}
