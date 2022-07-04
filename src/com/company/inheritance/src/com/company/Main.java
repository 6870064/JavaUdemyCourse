package com.company;

import com.company.enums.EngineType;
import com.company.enums.Gender;
import com.company.enums.Licence;
import com.company.enums.Manufacturer;

public class Main {

    public static void main(String[] args) {

        Driver driver = new Driver("Peter", Gender.MALE, Licence.CATEGORY_B, 37);
        Driver driver2 = new Driver("John", Gender.MALE, Licence.CATEGORY_CE, 42);
        Driver driver3 = new Driver("Michael", Gender.MALE, Licence.CATEGORY_B, 39);
        Driver driver4 = new Driver("Ronald", Gender.MALE, Licence.CATEGORY_C, 35);

        Engine autoEngine = new Engine(3.5, EngineType.PATROL, 250);
        Engine autoEngine2 = new Engine(4.5, EngineType.PATROL, 370);
        Engine autoEngine3 = new Engine(5.3, EngineType.ELECTRIC, 320);
        Engine autoEngine4 = new Engine(4.2, EngineType.PATROL, 355);

        SUV suv = new SUV("Tiguan", Manufacturer.VOLKSWAGEN,autoEngine, driver);
        suv.setAvailablePetrol(34);
        suv.setTankVolume(100);
        suv.start();
        suv.stop();
        suv.fuelUp(35);

        System.out.println(suv.getEngine());
        System.out.println(suv.getDriver());
        System.out.println(suv);

        Bus bus = new Bus("Volvo bus-1", Manufacturer.VOLVO,autoEngine2,driver2,45);
        bus.setAvailablePetrol(50);
        bus.setTankVolume(120);
        bus.fuelUp(60);
        bus.pickUpPassengers(45);
        bus.start();
        bus.stop();
        bus.dropOffPassengers();
        System.out.println(bus);

        ElectricCar electricCar = new ElectricCar("Tesla Model 3", Manufacturer.TESLA, autoEngine3, driver3);
        electricCar.setBatteryCapacity(120);
        electricCar.setPassengerNumber(4);
        electricCar.batterCharge();
        electricCar.start();
        electricCar.stop();
        System.out.println(electricCar);

        SUV suv1 = new SUV("BMV X6 M", Manufacturer.BMW, autoEngine4, driver4);
        suv1.setAvailablePetrol(45);
        suv1.setTankVolume(70);
        suv1.start();
        suv.stop();
        suv1.fuelUp(36);
        System.out.println(suv1.getAvailablePetrol());
    }
}
