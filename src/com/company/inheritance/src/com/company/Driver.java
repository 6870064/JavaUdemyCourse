package com.company;

import com.company.enums.Gender;
import com.company.enums.Licence;

public class Driver {

    public static int driverCount;
    public String name;
    Gender gender;
    Licence licence;
    public int age;

    public Driver(String name, Gender gender, Licence licence, int age) {

        driverCount++;
        this.name = name;
        this.gender = gender;
        this.licence = licence;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Licence getLicence() {
        return licence;
    }

    public void setLicence(Licence licence) {
        this.licence = licence;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", licence=" + licence +
                ", age=" + age +
                '}';
    }
}
