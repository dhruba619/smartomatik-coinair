package com.smartomatik.coinaircron;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "fields" })
public class AirTableData implements Serializable {

	private static final long serialVersionUID = -844862949219026104L;
	@JsonProperty("fields")
	private AirTableFields fields;

	@JsonProperty("fields")
	public AirTableFields getFields() {
		return fields;
	}

	@JsonProperty("fields")
	public void setFields(AirTableFields fields) {
		this.fields = fields;
	}

}