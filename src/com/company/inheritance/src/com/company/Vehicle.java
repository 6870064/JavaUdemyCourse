package com.company;

import com.company.enums.Manufacturer;

public class Vehicle {

    public int countVehicle = 0;
    protected boolean isRunning;
    Manufacturer manufacturer;
    Engine engine;
    Driver driver;
    private final String model;
    private int currentSpeed;


    public Vehicle(String model, Manufacturer manufacturer, Engine engine, Driver driver) {
        countVehicle++;
        this.model = model;
        this.manufacturer = manufacturer;
        this.engine = engine;
        this.driver = driver;

        System.out.println("Vehicle is initialized");
    }


    public int getCountVehicle() {
        return countVehicle;
    }

    public String getModel() {
        return model;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public Engine getEngine() {
        return engine;
    }

    public Driver getDriver() {
        return driver;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void start() {
        currentSpeed = 10;
        isRunning = true;
        System.out.println("Vehicle is started");
    }

    public void stop() {
        currentSpeed = 0;
        isRunning = false;
        System.out.println("Vehicle is stopped");
    }

    public void accelerate(int kmPerHour) {
        currentSpeed += kmPerHour;
        System.out.println(String.format("Vehicle is accelerated, current speed is %d", currentSpeed));
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "countVehicle=" + countVehicle +
                ", isRunning=" + isRunning +
                ", manufacturer=" + manufacturer +
                ", engine=" + engine +
                ", driver=" + driver +
                ", model='" + model + '\'' +
                ", currentSpeed=" + currentSpeed +
                '}';
    }
}
