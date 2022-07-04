package com.company;

import com.company.enums.Manufacturer;

public class Bus extends FuelEngineCar {

    private int passengersAmount;

    public Bus(String model, Manufacturer manufacturer, Engine engine, Driver driver, int passengersAmount) {
        super(model, manufacturer, engine, driver);
        this.passengersAmount = passengersAmount;
        System.out.println("Bus was initialized");
    }

    public int getPassengersAmount() {
        return passengersAmount;
    }

    public void setPassengersAmount(int passengersAmount) {
        this.passengersAmount = passengersAmount;
    }

    public void pickUpPassengers(int passengersNum) {
        passengersAmount += passengersNum;
        System.out.println(String.format("Current amount of passengers is %d", passengersAmount));
    }

    public void dropOffPassengers() {
        if (isRunning) {
            stop();
        }
        System.out.println("Passengers are dropped off");
        passengersAmount = 0;
    }

    @Override
    public String toString() {
        return "Bus{" +
                ", countVehicle=" + countVehicle +
                ", isRunning=" + isRunning +
                ", manufacturer=" + manufacturer +
                ", engine=" + engine +
                ", driver=" + driver +
                '}';
    }
}
