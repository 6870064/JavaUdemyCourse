package com.company.enums;

public enum Gender {
    MALE ("M"),FEMALE ("F");

    private final String abbreviation;

    Gender(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}


