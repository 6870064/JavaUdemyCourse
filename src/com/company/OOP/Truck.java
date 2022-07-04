package com.company.oop;

import com.company.oop.enums.EngineType;
import com.company.oop.enums.Manufacturer;

public class Truck extends FuelEngineAuto {

    private int cargoWeignt;

    public Truck(Manufacturer manufacturer, String model, Engine engine, int availablePatrol, int tankVolume, int cargoWeignt) {
        super(manufacturer, model, engine);
        this.cargoWeignt = cargoWeignt;
        System.out.println("Constructing Truck");
    }

    public int getCargoWeignt() {
        return cargoWeignt;
    }

    public void setCargoWeignt(int cargoWeignt) {
        this.cargoWeignt = cargoWeignt;
    }

    public void truckLoad(){
        System.out.println("Cargo is loaded");
    }

    public void truckUnLoad(){
        System.out.println("Cargo is inloaded");
    }

    @Override
    public void start() {
        isRunning = true;
        setCurrentSpeed(10);
        System.out.println("Truck is starting");
    }

    @Override
    public void stop() {
        isRunning = false;
        setCurrentSpeed(0);
        System.out.println("Truck is stopped");
    }
}
