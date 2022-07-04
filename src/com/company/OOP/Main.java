package com.company.oop;

import com.company.oop.enums.EngineType;
import com.company.oop.enums.Manufacturer;

public class Main {

    public static void main(String[] args) {

        Engine truckEngine = new Engine(6.0, EngineType.PETROL, 450);
        Truck truck = new Truck(Manufacturer.AUDI, "Truck Audi", truckEngine, 250, 300, 10000);
        ElectricCar electricCar = new ElectricCar(Manufacturer.TESLA, "Tesla 3", EngineType.ELECTRIC, 200, 4);
        Engine busEngine = new Engine(5.0, EngineType.DIESEL, 300);
        Bus bus = new Bus(Manufacturer.VOLKSWAGEN, "VW-45", busEngine, 50);
        Truck truck1 = new Truck(Manufacturer.VOLKSWAGEN, "Truck VW", truckEngine,270, 300,11000);

        runCar(truck);
        runCar(bus);
        runCar(truck1);
    }

    private static void runCar(Auto auto) {
        auto.start();
        auto.stop();
        auto.energize();
    }
}
