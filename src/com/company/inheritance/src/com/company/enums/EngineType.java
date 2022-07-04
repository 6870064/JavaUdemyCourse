package com.company.enums;

public enum EngineType {
    PATROL ("PT"), ELECTRIC ("EL"), DIESEL ("DS") ;

    private final String abbreviation;

    EngineType(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
