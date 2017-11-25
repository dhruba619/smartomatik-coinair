package com.smartomatik.coinaircron;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "Name", "Total", "BTC_Rate", "BTC_Value", "Fiat_Value", "1d_BTC_Change", "1w_BTC_Change",
		"1m_BTC_Change", "Percent_of_Portfolio", "Percent_Off_Goal", "DateTime" })
public class AirTableFields implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3824549105201834785L;
	@JsonProperty("Name")
	private String name;
	@JsonProperty("Total")
	private String total;
	@JsonProperty("BTC_Rate")
	private String bTCRate;
	@JsonProperty("BTC_Value")
	private String bTCValue;
	@JsonProperty("Fiat_Value")
	private String fiatValue;
	@JsonProperty("1d_BTC_Change")
	private String _1dBTCChange;
	@JsonProperty("1w_BTC_Change")
	private String _1wBTCChange;
	@JsonProperty("1m_BTC_Change")
	private String _1mBTCChange;
	@JsonProperty("Percent_of_Portfolio")
	private String percentOfPortfolio;
	@JsonProperty("Percent_Off_Goal")
	private String percentOffGoal;
	@JsonProperty("DateTime")
	private String dateTime;

	@JsonProperty("Name")
	public String getName() {
		return name;
	}

	@JsonProperty("Name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("Total")
	public String getTotal() {
		return total;
	}

	@JsonProperty("Total")
	public void setTotal(String total) {
		this.total = total;
	}

	@JsonProperty("BTC_Rate")
	public String getBTCRate() {
		return bTCRate;
	}

	@JsonProperty("BTC_Rate")
	public void setBTCRate(String bTCRate) {
		this.bTCRate = bTCRate;
	}

	@JsonProperty("BTC_Value")
	public String getBTCValue() {
		return bTCValue;
	}

	@JsonProperty("BTC_Value")
	public void setBTCValue(String bTCValue) {
		this.bTCValue = bTCValue;
	}

	@JsonProperty("Fiat_Value")
	public String getFiatValue() {
		return fiatValue;
	}

	@JsonProperty("Fiat_Value")
	public void setFiatValue(String fiatValue) {
		this.fiatValue = fiatValue;
	}

	@JsonProperty("1d_BTC_Change")
	public String get1dBTCChange() {
		return _1dBTCChange;
	}

	@JsonProperty("1d_BTC_Change")
	public void set1dBTCChange(String _1dBTCChange) {
		this._1dBTCChange = _1dBTCChange;
	}

	@JsonProperty("1w_BTC_Change")
	public String get1wBTCChange() {
		return _1wBTCChange;
	}

	@JsonProperty("1w_BTC_Change")
	public void set1wBTCChange(String _1wBTCChange) {
		this._1wBTCChange = _1wBTCChange;
	}

	@JsonProperty("1m_BTC_Change")
	public String get1mBTCChange() {
		return _1mBTCChange;
	}

	@JsonProperty("1m_BTC_Change")
	public void set1mBTCChange(String _1mBTCChange) {
		this._1mBTCChange = _1mBTCChange;
	}

	@JsonProperty("Percent_of_Portfolio")
	public String getPercentOfPortfolio() {
		return percentOfPortfolio;
	}

	@JsonProperty("Percent_of_Portfolio")
	public void setPercentOfPortfolio(String percentOfPortfolio) {
		this.percentOfPortfolio = percentOfPortfolio;
	}

	@JsonProperty("Percent_Off_Goal")
	public String getPercentOffGoal() {
		return percentOffGoal;
	}

	@JsonProperty("Percent_Off_Goal")
	public void setPercentOffGoal(String percentOffGoal) {
		this.percentOffGoal = percentOffGoal;
	}

	@JsonProperty("DateTime")
	public String getDateTime() {
		return dateTime;
	}

	@JsonProperty("DateTime")
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

}
