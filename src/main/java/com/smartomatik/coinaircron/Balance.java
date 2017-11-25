package com.smartomatik.coinaircron;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"name",
"Total",
"BTC_Rate",
"BTC_Value",
"Fiat_Value",
"1d_BTC_Change",
"1w_BTC_Change",
"1m_BTC_Change",
"Percent_of_Portfolio",
"Percent_Off_Goal"
})
public class Balance implements Serializable
{

@JsonProperty("name")
private String name;
@JsonProperty("Total")
private Double total;
@JsonProperty("BTC_Rate")
private Double bTCRate;
@JsonProperty("BTC_Value")
private Double bTCValue;
@JsonProperty("Fiat_Value")
private Double fiatValue;
@JsonProperty("1d_BTC_Change")
private Double _1dBTCChange;
@JsonProperty("1w_BTC_Change")
private Double _1wBTCChange;
@JsonProperty("1m_BTC_Change")
private Double _1mBTCChange;
@JsonProperty("Percent_of_Portfolio")
private Double percentOfPortfolio;
@JsonProperty("Percent_Off_Goal")
private Double percentOffGoal;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();
private final static long serialVersionUID = 8954331855602628407L;

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("Total")
public Double getTotal() {
return total;
}

@JsonProperty("Total")
public void setTotal(Double total) {
this.total = total;
}

@JsonProperty("BTC_Rate")
public Double getBTCRate() {
return bTCRate;
}

@JsonProperty("BTC_Rate")
public void setBTCRate(Double bTCRate) {
this.bTCRate = bTCRate;
}

@JsonProperty("BTC_Value")
public Double getBTCValue() {
return bTCValue;
}

@JsonProperty("BTC_Value")
public void setBTCValue(Double bTCValue) {
this.bTCValue = bTCValue;
}

@JsonProperty("Fiat_Value")
public Double getFiatValue() {
return fiatValue;
}

@JsonProperty("Fiat_Value")
public void setFiatValue(Double fiatValue) {
this.fiatValue = fiatValue;
}

@JsonProperty("1d_BTC_Change")
public Double get1dBTCChange() {
return _1dBTCChange;
}

@JsonProperty("1d_BTC_Change")
public void set1dBTCChange(Double _1dBTCChange) {
this._1dBTCChange = _1dBTCChange;
}

@JsonProperty("1w_BTC_Change")
public Double get1wBTCChange() {
return _1wBTCChange;
}

@JsonProperty("1w_BTC_Change")
public void set1wBTCChange(Double _1wBTCChange) {
this._1wBTCChange = _1wBTCChange;
}

@JsonProperty("1m_BTC_Change")
public Double get1mBTCChange() {
return _1mBTCChange;
}

@JsonProperty("1m_BTC_Change")
public void set1mBTCChange(Double _1mBTCChange) {
this._1mBTCChange = _1mBTCChange;
}

@JsonProperty("Percent_of_Portfolio")
public Double getPercentOfPortfolio() {
return percentOfPortfolio;
}

@JsonProperty("Percent_of_Portfolio")
public void setPercentOfPortfolio(Double percentOfPortfolio) {
this.percentOfPortfolio = percentOfPortfolio;
}

@JsonProperty("Percent_Off_Goal")
public Double getPercentOffGoal() {
return percentOffGoal;
}

@JsonProperty("Percent_Off_Goal")
public void setPercentOffGoal(Double percentOffGoal) {
this.percentOffGoal = percentOffGoal;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}