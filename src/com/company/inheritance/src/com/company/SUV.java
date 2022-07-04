package com.company;

import com.company.enums.Manufacturer;

public class SUV extends FuelEngineCar {

    public SUV(String model, Manufacturer manufacturer, Engine engine, Driver driver) {
        super(model, manufacturer, engine, driver);
    }

    @Override
    public String toString() {
        return "SUV{" +
                ", isRunning=" + isRunning +
                ", manufacturer=" + manufacturer +
                ", engine=" + engine +
                ", driver=" + driver +
                '}';
    }

    public void fuelUp(){
        int volume = getTankVolume() - getAvailablePetrol();
        fuelUp(volume);
    }

    @Override
    public void fuelUp(int petrolVolume){
        int volume = getAvailablePetrol() + petrolVolume;
        if (volume > getTankVolume()){
            setAvailablePetrol(getTankVolume());
        }
    }
}
