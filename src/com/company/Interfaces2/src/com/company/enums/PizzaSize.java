package com.company.enums;

public enum PizzaSize {

    SMALL ("S"), MEDIUM ("M"), LARGE ("XL"), SUPERLARGE ("XXL");

    public final String abbreviation;

    PizzaSize(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
