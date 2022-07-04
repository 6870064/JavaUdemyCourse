package com.company;

public class Cylinder {

    private double cylinderVolume;
    private int cylinderCount;


    public Cylinder(double cylinderVolume, int cylinderCount) {
        this.cylinderVolume = cylinderVolume;
        this.cylinderCount = cylinderCount;
    }

    public double getCylinderVolume() {
        return cylinderVolume;
    }

    public void setCylinderVolume(double cylinderVolume) {
        this.cylinderVolume = cylinderVolume;
    }

    public int getCylinderCount() {
        return cylinderCount;
    }

    public void setCylinderCount(int cylinderCount) {
        this.cylinderCount = cylinderCount;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "cylinderVolume=" + cylinderVolume +
                ", cylinderCount=" + cylinderCount +
                '}';
    }
}
