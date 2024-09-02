package com.uncia.unciascorecardproject.model;

public class BankReport {

	private String totalCreditAmount;
	private String debitTransactions;
	private String avgDebitAmount;
	private String totalDebitAmount;
	private String creditTransaction;
	private String avgCreditAmount;
	private String salary;
	private String probableSalary;
	private String emi;
	private String name;
	private String accountNumber;
	private String bankName;
	private String ifscCode;
	private String startDate;
	private String endDate;
	private String micrCode;
	private String avgMonthlyBalance;
	private String openingBalance;
	private String closingBalance;

	public BankReport() {
	}

	public BankReport(String totalCreditAmount, String debitTransactions, String avgDebitAmount,
			String totalDebitAmount, String salary, String probableSalary, String emi, String name,
			String accountNumber, String bankName, String ifscCode, String startDate, String endDate, String micrCode,
			String avgMonthlyBalance, String openingBalance, String closingBalance) {
		super();
		this.totalCreditAmount = totalCreditAmount;
		this.debitTransactions = debitTransactions;
		this.avgDebitAmount = avgDebitAmount;
		this.totalDebitAmount = totalDebitAmount;
		this.salary = salary;
		this.probableSalary = probableSalary;
		this.emi = emi;
		this.name = name;
		this.accountNumber = accountNumber;
		this.bankName = bankName;
		this.ifscCode = ifscCode;
		this.startDate = startDate;
		this.endDate = endDate;
		this.micrCode = micrCode;
		this.avgMonthlyBalance = avgMonthlyBalance;
		this.openingBalance = openingBalance;
		this.closingBalance = closingBalance;
	}

	public String getTotalCreditAmount() {
		return totalCreditAmount;
	}

	public void setTotalCreditAmount(String totalCreditAmount) {
		this.totalCreditAmount = totalCreditAmount;
	}

	public String getDebitTransactions() {
		return debitTransactions;
	}

	public void setDebitTransactions(String debitTransactions) {
		this.debitTransactions = debitTransactions;
	}

	public String getAvgDebitAmount() {
		return avgDebitAmount;
	}

	public void setAvgDebitAmount(String avgDebitAmount) {
		this.avgDebitAmount = avgDebitAmount;
	}

	public String getTotalDebitAmount() {
		return totalDebitAmount;
	}

	public void setTotalDebitAmount(String totalDebitAmount) {
		this.totalDebitAmount = totalDebitAmount;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getProbableSalary() {
		return probableSalary;
	}

	public void setProbableSalary(String probableSalary) {
		this.probableSalary = probableSalary;
	}

	public String getEmi() {
		return emi;
	}

	public void setEmi(String emi) {
		this.emi = emi;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getMicrCode() {
		return micrCode;
	}

	public void setMicrCode(String micrCode) {
		this.micrCode = micrCode;
	}

	public String getAvgMonthlyBalance() {
		return avgMonthlyBalance;
	}

	public void setAvgMonthlyBalance(String avgMonthlyBalance) {
		this.avgMonthlyBalance = avgMonthlyBalance;
	}

	public String getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(String openingBalance) {
		this.openingBalance = openingBalance;
	}

	public String getClosingBalance() {
		return closingBalance;
	}

	public void setClosingBalance(String closingBalance) {
		this.closingBalance = closingBalance;
	}

	public String getCreditTransaction() {
		return creditTransaction;
	}

	public void setCreditTransaction(String creditTransaction) {
		this.creditTransaction = creditTransaction;
	}

	public String getAvgCreditAmount() {
		return avgCreditAmount;
	}

	public void setAvgCreditAmount(String avgCreditAmount) {
		this.avgCreditAmount = avgCreditAmount;
	}

}
