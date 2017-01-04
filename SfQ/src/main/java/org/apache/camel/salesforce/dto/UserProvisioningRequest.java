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
 * Salesforce DTO for SObject UserProvisioningRequest
 */
@XStreamAlias("UserProvisioningRequest")
public class UserProvisioningRequest extends AbstractSObjectBase {

    // SalesforceUserId
    private String SalesforceUserId;

    @JsonProperty("SalesforceUserId")
    public String getSalesforceUserId() {
        return this.SalesforceUserId;
    }

    @JsonProperty("SalesforceUserId")
    public void setSalesforceUserId(String SalesforceUserId) {
        this.SalesforceUserId = SalesforceUserId;
    }

    // ExternalUserId
    private String ExternalUserId;

    @JsonProperty("ExternalUserId")
    public String getExternalUserId() {
        return this.ExternalUserId;
    }

    @JsonProperty("ExternalUserId")
    public void setExternalUserId(String ExternalUserId) {
        this.ExternalUserId = ExternalUserId;
    }

    // AppName
    private String AppName;

    @JsonProperty("AppName")
    public String getAppName() {
        return this.AppName;
    }

    @JsonProperty("AppName")
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    // State
    @XStreamConverter(PicklistEnumConverter.class)
    private StateEnum State;

    @JsonProperty("State")
    public StateEnum getState() {
        return this.State;
    }

    @JsonProperty("State")
    public void setState(StateEnum State) {
        this.State = State;
    }

    // Operation
    @XStreamConverter(PicklistEnumConverter.class)
    private OperationEnum Operation;

    @JsonProperty("Operation")
    public OperationEnum getOperation() {
        return this.Operation;
    }

    @JsonProperty("Operation")
    public void setOperation(OperationEnum Operation) {
        this.Operation = Operation;
    }

    // ScheduleDate
    private org.joda.time.DateTime ScheduleDate;

    @JsonProperty("ScheduleDate")
    public org.joda.time.DateTime getScheduleDate() {
        return this.ScheduleDate;
    }

    @JsonProperty("ScheduleDate")
    public void setScheduleDate(org.joda.time.DateTime ScheduleDate) {
        this.ScheduleDate = ScheduleDate;
    }

    // ConnectedAppId
    private String ConnectedAppId;

    @JsonProperty("ConnectedAppId")
    public String getConnectedAppId() {
        return this.ConnectedAppId;
    }

    @JsonProperty("ConnectedAppId")
    public void setConnectedAppId(String ConnectedAppId) {
        this.ConnectedAppId = ConnectedAppId;
    }

    // UserProvConfigId
    private String UserProvConfigId;

    @JsonProperty("UserProvConfigId")
    public String getUserProvConfigId() {
        return this.UserProvConfigId;
    }

    @JsonProperty("UserProvConfigId")
    public void setUserProvConfigId(String UserProvConfigId) {
        this.UserProvConfigId = UserProvConfigId;
    }

    // UserProvAccountId
    private String UserProvAccountId;

    @JsonProperty("UserProvAccountId")
    public String getUserProvAccountId() {
        return this.UserProvAccountId;
    }

    @JsonProperty("UserProvAccountId")
    public void setUserProvAccountId(String UserProvAccountId) {
        this.UserProvAccountId = UserProvAccountId;
    }

    // ApprovalStatus
    @XStreamConverter(PicklistEnumConverter.class)
    private ApprovalStatusEnum ApprovalStatus;

    @JsonProperty("ApprovalStatus")
    public ApprovalStatusEnum getApprovalStatus() {
        return this.ApprovalStatus;
    }

    @JsonProperty("ApprovalStatus")
    public void setApprovalStatus(ApprovalStatusEnum ApprovalStatus) {
        this.ApprovalStatus = ApprovalStatus;
    }

    // ManagerId
    private String ManagerId;

    @JsonProperty("ManagerId")
    public String getManagerId() {
        return this.ManagerId;
    }

    @JsonProperty("ManagerId")
    public void setManagerId(String ManagerId) {
        this.ManagerId = ManagerId;
    }

}
