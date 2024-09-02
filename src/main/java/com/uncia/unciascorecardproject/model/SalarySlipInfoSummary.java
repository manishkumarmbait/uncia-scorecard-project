package com.uncia.unciascorecardproject.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SalarySlipInfoSummary {

	@JsonProperty("Item")
	private String item;
	@JsonProperty("Details")
	private String details;
	@JsonProperty("Verification")
	private String verification;

	public SalarySlipInfoSummary() {
	}

	public SalarySlipInfoSummary(String item, String details, String verification) {
		this.item = item;
		this.details = details;
		this.verification = verification;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getVerification() {
		return verification;
	}

	public void setVerification(String verification) {
		this.verification = verification;
	}

}
