/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Nov 11 19:02:42 ART 2016
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject ContractContactRole
 */
@XStreamAlias("ContractContactRole")
public class ContractContactRole extends AbstractSObjectBase {

    // ContractId
    private String ContractId;

    @JsonProperty("ContractId")
    public String getContractId() {
        return this.ContractId;
    }

    @JsonProperty("ContractId")
    public void setContractId(String ContractId) {
        this.ContractId = ContractId;
    }

    // ContactId
    private String ContactId;

    @JsonProperty("ContactId")
    public String getContactId() {
        return this.ContactId;
    }

    @JsonProperty("ContactId")
    public void setContactId(String ContactId) {
        this.ContactId = ContactId;
    }

    // Role
    @XStreamConverter(PicklistEnumConverter.class)
    private RoleEnum Role;

    @JsonProperty("Role")
    public RoleEnum getRole() {
        return this.Role;
    }

    @JsonProperty("Role")
    public void setRole(RoleEnum Role) {
        this.Role = Role;
    }

    // IsPrimary
    private Boolean IsPrimary;

    @JsonProperty("IsPrimary")
    public Boolean getIsPrimary() {
        return this.IsPrimary;
    }

    @JsonProperty("IsPrimary")
    public void setIsPrimary(Boolean IsPrimary) {
        this.IsPrimary = IsPrimary;
    }

}
