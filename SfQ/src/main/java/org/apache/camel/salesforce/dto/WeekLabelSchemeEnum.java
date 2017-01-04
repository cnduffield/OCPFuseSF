/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Nov 11 19:02:42 ART 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist WeekLabelScheme
 */
public enum WeekLabelSchemeEnum {

    // NumberByPeriod
    NUMBERBYPERIOD("NumberByPeriod"),
    // NumberByQuarter
    NUMBERBYQUARTER("NumberByQuarter"),
    // NumberByYear
    NUMBERBYYEAR("NumberByYear");

    final String value;

    private WeekLabelSchemeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static WeekLabelSchemeEnum fromValue(String value) {
        for (WeekLabelSchemeEnum e : WeekLabelSchemeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
