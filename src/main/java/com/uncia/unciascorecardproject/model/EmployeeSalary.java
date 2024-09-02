package com.uncia.unciascorecardproject.model;

import java.util.Date;

public class EmployeeSalary {

	private String employeeName; // — ANKUR KADAIN
	private String employerName; // — FLUENTGRID LIMITED
	private String dateOfJoining; // — 2021-11-24
	private String uniqueIdentificationNumber; // — 100200855660
	private String salaryCreditedTo; // — UNION BANK OF INDIA
	private String bankAccountNumber; // — 509102010009720
	private String months; // — April
	private String monthlyBasic; // — 32466.0
	private String netSalary; // — 104121.0

	public EmployeeSalary() {
	}

	public EmployeeSalary(String employeeName, String employerName, String dateOfJoining,
			String uniqueIdentificationNumber, String salaryCreditedTo, String bankAccountNumber, String months,
			String monthlyBasic, String netSalary) {
		super();
		this.employeeName = employeeName;
		this.employerName = employerName;
		this.dateOfJoining = dateOfJoining;
		this.uniqueIdentificationNumber = uniqueIdentificationNumber;
		this.salaryCreditedTo = salaryCreditedTo;
		this.bankAccountNumber = bankAccountNumber;
		this.months = months;
		this.monthlyBasic = monthlyBasic;
		this.netSalary = netSalary;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getUniqueIdentificationNumber() {
		return uniqueIdentificationNumber;
	}

	public void setUniqueIdentificationNumber(String uniqueIdentificationNumber) {
		this.uniqueIdentificationNumber = uniqueIdentificationNumber;
	}

	public String getSalaryCreditedTo() {
		return salaryCreditedTo;
	}

	public void setSalaryCreditedTo(String salaryCreditedTo) {
		this.salaryCreditedTo = salaryCreditedTo;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
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

	public String getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(String netSalary) {
		this.netSalary = netSalary;
	}

}
