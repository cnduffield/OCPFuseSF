/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Nov 11 19:02:42 ART 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist QuarterLabelScheme
 */
public enum QuarterLabelSchemeEnum {

    // Custom
    CUSTOM("Custom"),
    // NumberByYear
    NUMBERBYYEAR("NumberByYear");

    final String value;

    private QuarterLabelSchemeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static QuarterLabelSchemeEnum fromValue(String value) {
        for (QuarterLabelSchemeEnum e : QuarterLabelSchemeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
