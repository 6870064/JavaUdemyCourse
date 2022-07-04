package com.company.oop;

import com.company.oop.enums.EngineType;

import java.util.ArrayList;
import java.util.List;

public class Engine {

    private double engineCapacity;
    private EngineType engineType;
    private int enginePower;
    private List<Piston> pistons = new ArrayList<>();

    public Engine(double engineCapacity, EngineType engineType, int enginePower) {
        this.engineCapacity = engineCapacity;
        this.engineType = engineType;
        this.enginePower = enginePower;
        for (int i =0; i<=5;i++){
            this.pistons.add(new Piston(0.3, i));
        }
    }

    public Engine() {
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public List<Piston> getPistons() {
        return pistons;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public int getEnginePower() {
        return enginePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineCapacity=" + engineCapacity +
                ", engineType=" + engineType +
                ", enginePower=" + enginePower +
                ", pistons=" + pistons +
                '}';
    }
}
