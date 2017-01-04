/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Nov 11 19:02:42 ART 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist LinkType
 */
public enum LinkTypeEnum {

    // flow
    FLOW("flow"),
    // javascript
    JAVASCRIPT("javascript"),
    // page
    PAGE("page"),
    // sControl
    SCONTROL("sControl"),
    // url
    URL("url");

    final String value;

    private LinkTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static LinkTypeEnum fromValue(String value) {
        for (LinkTypeEnum e : LinkTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}