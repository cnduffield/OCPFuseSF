/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Nov 11 19:02:42 ART 2016
 */
package org.apache.camel.salesforce.dto;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Encoding
 */
public enum EncodingEnum {

    // Big5
    BIG5("Big5"),
    // Big5-HKSCS
    BIG5_HKSCS("Big5-HKSCS"),
    // EUC-JP
    EUC_JP("EUC-JP"),
    // GB2312
    GB2312("GB2312"),
    // ISO-2022-JP
    ISO_2022_JP("ISO-2022-JP"),
    // ISO-8859-1
    ISO_8859_1("ISO-8859-1"),
    // Shift_JIS
    SHIFT_JIS("Shift_JIS"),
    // UTF-8
    UTF_8("UTF-8"),
    // ks_c_5601-1987
    KS_C_5601_1987("ks_c_5601-1987"),
    // x-SJIS_0213
    X_SJIS_0213("x-SJIS_0213");

    final String value;

    private EncodingEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static EncodingEnum fromValue(String value) {
        for (EncodingEnum e : EncodingEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
