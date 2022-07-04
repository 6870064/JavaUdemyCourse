package com.company.oop.enums;

public enum DogsSize {
    VERY_SMALL("XS"), SMALL("S"), AVERAGE("M"), BIG("L"),
    VERY_BIG("XL"), UNDEFINED (" ");

    private final String abbreviation;

    DogsSize(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
