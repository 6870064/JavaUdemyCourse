package com.company.oop;

import com.company.oop.enums.EngineType;
import com.company.oop.enums.Manufacturer;

public abstract class Auto {

    public static int countAuto = 0;
    private Manufacturer manufacturer;
    private String model;
    private Engine engine;
    private int currentSpeed;
    protected boolean isRunning;

    public Auto(Manufacturer manufacturer, String model, Engine engine) {
        countAuto++;
        this.manufacturer = manufacturer;
        this.model = model;
        this.engine = engine;
        System.out.println("Auto was initialized");
    }

    public static int getCountAuto() {
        return countAuto;
    }

    public static void setCountAuto(int countAuto) {
        Auto.countAuto = countAuto;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public void start(){
        isRunning = true;
        currentSpeed = 10;
        System.out.println("Auto is starting");
    }

    public void stop(){
        isRunning = false;
        currentSpeed = 0;
        System.out.println("Auto is stopped");
    }

    public void accelerate(int kmPerHour){
        currentSpeed+=kmPerHour;
        System.out.println(String.format("Accelerating. Current speed is %d kmPerHour", currentSpeed));
    }

    public abstract void energize();
}
