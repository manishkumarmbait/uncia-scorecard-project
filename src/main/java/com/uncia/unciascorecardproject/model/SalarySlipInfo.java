package com.uncia.unciascorecardproject.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SalarySlipInfo {

	@JsonProperty("Salary Slip Info - Summary")
	private List<SalarySlipInfoSummary> salarySlipInfoSummary;
	@JsonProperty("Salary Slip Info - Details")
	private List<SalarySlipInfoDetail> salarySlipInfoDetails;

	public SalarySlipInfo() {
	}

	public SalarySlipInfo(List<SalarySlipInfoSummary> salarySlipInfoSummary,
			List<SalarySlipInfoDetail> salarySlipInfoDetails) {
		this.salarySlipInfoSummary = salarySlipInfoSummary;
		this.salarySlipInfoDetails = salarySlipInfoDetails;
	}

	public List<SalarySlipInfoSummary> getSalarySlipInfoSummary() {
		return salarySlipInfoSummary;
	}

	public void setSalarySlipInfoSummary(List<SalarySlipInfoSummary> salarySlipInfoSummary) {
		this.salarySlipInfoSummary = salarySlipInfoSummary;
	}

	public List<SalarySlipInfoDetail> getSalarySlipInfoDetails() {
		return salarySlipInfoDetails;
	}

	public void setSalarySlipInfoDetails(List<SalarySlipInfoDetail> salarySlipInfoDetails) {
		this.salarySlipInfoDetails = salarySlipInfoDetails;
	}

}
