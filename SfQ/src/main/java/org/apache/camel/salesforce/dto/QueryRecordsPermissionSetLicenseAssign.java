/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Nov 11 19:02:42 ART 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type PermissionSetLicenseAssign
 */
public class QueryRecordsPermissionSetLicenseAssign extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<PermissionSetLicenseAssign> records;

    public List<PermissionSetLicenseAssign> getRecords() {
        return records;
    }

    public void setRecords(List<PermissionSetLicenseAssign> records) {
        this.records = records;
    }
}
