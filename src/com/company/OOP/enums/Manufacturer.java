package com.company.oop.enums;

public enum Manufacturer {
    BMW ("BMW"), TESLA ("TS"), AUDI ("AU"), OPEL ("OP"), VOLKSWAGEN ("VW");

    private final String abbreviation;

    Manufacturer(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
