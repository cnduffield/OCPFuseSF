/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Nov 11 19:02:42 ART 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist PotentialLiability__c
 */
public enum PotentialLiabilityEnum {

    // No
    NO("No"),
    // Yes
    YES("Yes");

    final String value;

    private PotentialLiabilityEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static PotentialLiabilityEnum fromValue(String value) {
        for (PotentialLiabilityEnum e : PotentialLiabilityEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
