package com.company.enums;

public enum OperationSystem {
    IOS ("I"), ANDROID ("A");

    public final String abbreviation;

    OperationSystem(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
