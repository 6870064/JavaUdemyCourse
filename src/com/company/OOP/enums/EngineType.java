package com.company.oop.enums;

public enum EngineType {
    PETROL("PT"), ELECTRIC("EL"),DIESEL("DS");

    private final String abbreviation;

    EngineType(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
