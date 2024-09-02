package com.uncia.unciascorecardproject.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SummaryFixedIncomeObligation {

	@JsonProperty("Type")
	private String type;
	@JsonProperty("Type Identified")
	private String typeIdentified;
	@JsonProperty("Amount")
	private String amount;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTypeIdentified() {
		return typeIdentified;
	}

	public void setTypeIdentified(String typeIdentified) {
		this.typeIdentified = typeIdentified;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

}
