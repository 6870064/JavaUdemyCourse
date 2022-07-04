package com.company.oop.enums;

public enum PersonGender {
    MALE ("M"), FEMALE ("F");

    private final String abbreviation;

    PersonGender(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
