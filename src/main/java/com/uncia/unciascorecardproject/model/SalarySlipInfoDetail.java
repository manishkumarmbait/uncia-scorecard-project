package com.uncia.unciascorecardproject.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SalarySlipInfoDetail {

	@JsonProperty("Months")
	private String months;
	@JsonProperty("Monthly Basic")
	private String monthlyBasic;
	@JsonProperty("Transport Allowances")
	private String transportAllowances;
	@JsonProperty("Other Allowances")
	private String otherAllowances;
	@JsonProperty("Deductions")
	private String deductions;
	@JsonProperty("Net Salary")
	private String netSalary;

	public SalarySlipInfoDetail() {
	}

	public SalarySlipInfoDetail(String months, String monthlyBasic, String transportAllowances, String otherAllowances,
			String deductions, String netSalary) {
		this.months = months;
		this.monthlyBasic = monthlyBasic;
		this.transportAllowances = transportAllowances;
		this.otherAllowances = otherAllowances;
		this.deductions = deductions;
		this.netSalary = netSalary;
	}

	public String getMonths() {
		return months;
	}

	public void setMonths(String months) {
		this.months = months;
	}

	public String getMonthlyBasic() {
		return monthlyBasic;
	}

	public void setMonthlyBasic(String monthlyBasic) {
		this.monthlyBasic = monthlyBasic;
	}

	public String getTransportAllowances() {
		return transportAllowances;
	}

	public void setTransportAllowances(String transportAllowances) {
		this.transportAllowances = transportAllowances;
	}

	public String getOtherAllowances() {
		return otherAllowances;
	}

	public void setOtherAllowances(String otherAllowances) {
		this.otherAllowances = otherAllowances;
	}

	public String getDeductions() {
		return deductions;
	}

	public void setDeductions(String deductions) {
		this.deductions = deductions;
	}

	public String getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(String netSalary) {
		this.netSalary = netSalary;
	}

}
