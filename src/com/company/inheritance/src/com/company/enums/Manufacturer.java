package com.company.enums;

public enum Manufacturer {
    BMW ("BMW"), TESLA ("TS"), AUDI ("AU"), VOLVO ("V"),
    OPEL ("OP"), VOLKSWAGEN ("VW"), MERCEDES ("M");

    private String abbreviation;

    Manufacturer(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
