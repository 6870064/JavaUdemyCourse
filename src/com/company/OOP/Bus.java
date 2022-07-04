package com.company.oop;

import com.company.oop.enums.EngineType;
import com.company.oop.enums.Manufacturer;

public class Bus extends FuelEngineAuto {

    private int passengerNumber;

    public Bus(Manufacturer manufacturer, String model, Engine engine, int passengerNumber) {
        super(manufacturer, model, engine);
        this.passengerNumber = passengerNumber;
        System.out.println("Bus was initialized");
    }

    public void fuelUp(){
        int volume = getTankVolume() - getAvailablePetrol();
        fuelUp(volume);
    }

    @Override
    public void fuelUp(int petrolVolume) {
        int volume = getAvailablePetrol() + petrolVolume;
        if (volume > getTankVolume()) {
            setAvailablePetrol(getTankVolume());
        }
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public void pickUpPassengers(int passengersNum){
        this.passengerNumber +=passengersNum;
        System.out.println(String.format("Amount of passengers is %d",passengerNumber));
    }

    @Override
    public void start() {
        isRunning = true;
        setCurrentSpeed(10);
        System.out.println("Bus is starting");
    }

    @Override
    public void stop() {
        isRunning = false;
        setCurrentSpeed(0);
        System.out.println("Bus is stopped");
    }

    public void releasePassengers(){
        if (isRunning){
            stop();
        }
        passengerNumber = 0;
        System.out.println("Passengers are released");
    }
}
