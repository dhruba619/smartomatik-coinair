package com.smartomatik.coinaircron;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CoinCubeSummary implements Serializable {

	@JsonProperty("fiat_total")
	private Double fiatTotal;
	@JsonProperty("fiat_performance")
	private Double fiatPerformance;
	@JsonProperty("btc_total")
	private Double btcTotal;
	@JsonProperty("btc_performance")
	private Double btcPerformance;
	@JsonProperty("balances")
	private List<Balance> balances;
	private final static long serialVersionUID = 4973179242175822441L;

	@JsonProperty("fiat_total")
	public Double getFiatTotal() {
		return fiatTotal;
	}

	@JsonProperty("fiat_total")
	public void setFiatTotal(Double fiatTotal) {
		this.fiatTotal = fiatTotal;
	}

	@JsonProperty("fiat_performance")
	public Double getFiatPerformance() {
		return fiatPerformance;
	}

	@JsonProperty("fiat_performance")
	public void setFiatPerformance(Double fiatPerformance) {
		this.fiatPerformance = fiatPerformance;
	}

	@JsonProperty("btc_total")
	public Double getBtcTotal() {
		return btcTotal;
	}

	@JsonProperty("btc_total")
	public void setBtcTotal(Double btcTotal) {
		this.btcTotal = btcTotal;
	}

	@JsonProperty("btc_performance")
	public Double getBtcPerformance() {
		return btcPerformance;
	}

	@JsonProperty("btc_performance")
	public void setBtcPerformance(Double btcPerformance) {
		this.btcPerformance = btcPerformance;
	}

	@JsonProperty("balances")
	public List<Balance> getBalances() {
		return balances;
	}

	@JsonProperty("balances")
	public void setBalances(List<Balance> balances) {
		this.balances = balances;
	}
}
