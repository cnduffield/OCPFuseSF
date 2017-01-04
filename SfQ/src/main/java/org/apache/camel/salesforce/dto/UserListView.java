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
 * Salesforce DTO for SObject UserListView
 */
@XStreamAlias("UserListView")
public class UserListView extends AbstractSObjectBase {

    // UserId
    private String UserId;

    @JsonProperty("UserId")
    public String getUserId() {
        return this.UserId;
    }

    @JsonProperty("UserId")
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    // ListViewId
    private String ListViewId;

    @JsonProperty("ListViewId")
    public String getListViewId() {
        return this.ListViewId;
    }

    @JsonProperty("ListViewId")
    public void setListViewId(String ListViewId) {
        this.ListViewId = ListViewId;
    }

    // SobjectType
    @XStreamConverter(PicklistEnumConverter.class)
    private SobjectTypeEnum SobjectType;

    @JsonProperty("SobjectType")
    public SobjectTypeEnum getSobjectType() {
        return this.SobjectType;
    }

    @JsonProperty("SobjectType")
    public void setSobjectType(SobjectTypeEnum SobjectType) {
        this.SobjectType = SobjectType;
    }

    // LastViewedChart
    @XStreamConverter(PicklistEnumConverter.class)
    private LastViewedChartEnum LastViewedChart;

    @JsonProperty("LastViewedChart")
    public LastViewedChartEnum getLastViewedChart() {
        return this.LastViewedChart;
    }

    @JsonProperty("LastViewedChart")
    public void setLastViewedChart(LastViewedChartEnum LastViewedChart) {
        this.LastViewedChart = LastViewedChart;
    }

}
