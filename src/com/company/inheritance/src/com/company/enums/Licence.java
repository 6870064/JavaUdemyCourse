package com.company.enums;

public enum Licence {
    CATEGORY_A1("A1"), CATEGORY_B("B"), CATEGORY_C("C"),
    CATEGORY_CE("CE"), CATEGORY_D1("D1");

    private final String abbreviation;

    Licence(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
