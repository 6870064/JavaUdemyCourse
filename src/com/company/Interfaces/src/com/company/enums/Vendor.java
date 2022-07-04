package com.company.enums;

public enum Vendor {
    APPLE ("A"), HUAWEI ("H"), GOOGLE ("G"), SAMSUNG ("S"),
    OPPO ("OP"), XIAOMI ("X"), LG ("LG");


    Vendor(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public final String abbreviation;

    public String getAbbreviation() {
        return abbreviation;
    }
}
