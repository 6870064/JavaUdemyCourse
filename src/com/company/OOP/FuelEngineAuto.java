package com.company.oop;

import com.company.oop.enums.EngineType;
import com.company.oop.enums.Manufacturer;

public class FuelEngineAuto extends Auto {

    private int availablePetrol;
    private int tankVolume;

    public FuelEngineAuto(Manufacturer manufacturer, String model, Engine engine) {
        super(manufacturer, model, engine);
        this.availablePetrol = availablePetrol;
        this.tankVolume = tankVolume;
    }

    @Override
    public void energize() {
        fuelUp(getTankVolume() - getAvailablePetrol());

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

    public void fuelUp(int petrolVolume) {
        availablePetrol += petrolVolume;
        System.out.println(String.format("Amount of petrol available is %d", availablePetrol));
    }
}
