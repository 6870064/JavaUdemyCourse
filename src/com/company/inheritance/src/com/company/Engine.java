package com.company;

import com.company.enums.EngineType;

import java.util.ArrayList;
import java.util.List;

public class Engine {

    private double engineCapacity;
    private EngineType engineType;
    private int EnginePower;
    private List<Cylinder>  cylinders = new ArrayList<>();

    public Engine(double engineCapasity, EngineType engineType, int enginePower) {
        this.engineCapacity = engineCapasity;
        this.engineType = engineType;
        EnginePower = enginePower;

        for (int i =0; i<=5;i++){
            this.cylinders.add(new Cylinder(1.3, i));
        }
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public int getEnginePower() {
        return EnginePower;
    }

    public List<Cylinder> getCylinders() {
        return cylinders;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineCapasity=" + engineCapacity +
                ", engineType=" + engineType +
                ", EnginePower=" + EnginePower +
                ", cylinders=" + cylinders +
                '}';
    }
}
