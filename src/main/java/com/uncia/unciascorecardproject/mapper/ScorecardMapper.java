package com.uncia.unciascorecardproject.mapper;

import java.util.List;

import com.uncia.unciascorecardproject.model.BankReport;
import com.uncia.unciascorecardproject.model.CreditSummaryScore;
import com.uncia.unciascorecardproject.model.EmployeeSalary;
import com.uncia.unciascorecardproject.model.SalarySlipInfo;
import com.uncia.unciascorecardproject.model.SalarySlipInfoDetail;
import com.uncia.unciascorecardproject.model.SalarySlipInfoSummary;
import com.uncia.unciascorecardproject.model.ScoringDetails;
import com.uncia.unciascorecardproject.model.SummaryFixedIncomeObligation;
import com.uncia.unciascorecardproject.model.SummaryScorecard;

public class ScorecardMapper {

	public static BankReport CreditSummaryScoreToBankReport(CreditSummaryScore creditSummaryScore) {

		BankReport bankReport = new BankReport();
		List<ScoringDetails> scoringDetails = creditSummaryScore.getScoringDetails();
		for (ScoringDetails scoringDetail : scoringDetails) {
			if (scoringDetail.getDescription().equals("Average Credit Transactions")) {
				bankReport.setAvgCreditAmount(scoringDetail.getValue());
			}
			if (scoringDetail.getDescription().equals("Total Count of Credit Transactions")) {
				bankReport.setCreditTransaction(scoringDetail.getValue());
			}
			if (scoringDetail.getDescription().equals("Total Credit Amount")) {
				bankReport.setTotalCreditAmount(scoringDetail.getValue());
			}
			if (scoringDetail.getDescription().equals("Total Count of Debit Transactions")) {
				bankReport.setDebitTransactions(scoringDetail.getValue());
			}
			if (scoringDetail.getDescription().equals("Average Debit Transactions")) {
				bankReport.setAvgDebitAmount(scoringDetail.getValue());
			}
			if (scoringDetail.getDescription().equals("Total Debit Amount")) {
				bankReport.setTotalDebitAmount(scoringDetail.getValue());
			}
		}

		List<SummaryScorecard> summaryScorecards = creditSummaryScore.getSummaryScorecard();
		for (SummaryScorecard summaryScorecard : summaryScorecards) {
			if (summaryScorecard.getItem().equals("Customer Name")) {
				bankReport.setName(summaryScorecard.getDetails());
			}
			if (summaryScorecard.getItem().equals("Account Number")) {
				bankReport.setAccountNumber(summaryScorecard.getDetails());
			}
			if (summaryScorecard.getItem().equals("Bank")) {
				bankReport.setBankName(summaryScorecard.getDetails());
			}
			if (summaryScorecard.getItem().equals("IFSC Code")) {
				bankReport.setIfscCode(summaryScorecard.getDetails());
			}
			if (summaryScorecard.getItem().equals("Start Date")) {
				bankReport.setStartDate(summaryScorecard.getDetails());
			}
			if (summaryScorecard.getItem().equals("End Date")) {
				bankReport.setEndDate(summaryScorecard.getDetails());
			}
			if (summaryScorecard.getItem().equals("MICR Code")) {
				bankReport.setMicrCode(summaryScorecard.getDetails());
			}
			if (summaryScorecard.getItem().equals("Monthly Average Balance")) {
				bankReport.setAvgMonthlyBalance(summaryScorecard.getDetails());
			}
			if (summaryScorecard.getItem().equals("Opening Balance")) {
				bankReport.setOpeningBalance(summaryScorecard.getDetails());
			}
			if (summaryScorecard.getItem().equals("Closing Balance")) {
				bankReport.setClosingBalance(summaryScorecard.getDetails());
			}
		}

		List<SummaryFixedIncomeObligation> summaryFixedIncomeObligations = creditSummaryScore
				.getSummaryFixedIncomeObligation();
		for (SummaryFixedIncomeObligation summFxIncomeObli : summaryFixedIncomeObligations) {
			if (summFxIncomeObli.getType().equals("Salary") && summFxIncomeObli.getTypeIdentified().equals("Yes")) {
				bankReport.setSalary(summFxIncomeObli.getAmount());
			}
			if (summFxIncomeObli.getType().equals("Probable Salary")
					&& summFxIncomeObli.getTypeIdentified().equals("Yes")) {
				bankReport.setProbableSalary(summFxIncomeObli.getAmount());
			}
			if (summFxIncomeObli.getType().equals("EMI/LOAN") && summFxIncomeObli.getTypeIdentified().equals("Yes")) {
				bankReport.setEmi(summFxIncomeObli.getAmount());
			}
		}
		return bankReport;
	}

	public static EmployeeSalary employeeSalaryReport(SalarySlipInfo salarySlipInfo) {

		EmployeeSalary employeeSalary = new EmployeeSalary();

		List<SalarySlipInfoSummary> salarySlipInfoSummaryList = salarySlipInfo.getSalarySlipInfoSummary();
		if (salarySlipInfoSummaryList != null) {
			for (SalarySlipInfoSummary salarySlipInfoSummary : salarySlipInfoSummaryList) {
				if (salarySlipInfoSummary.getItem().equals("Employee Name")) {
					employeeSalary.setEmployeeName(salarySlipInfoSummary.getDetails());
				}
				if (salarySlipInfoSummary.getItem().equals("Employer Name")) {
					employeeSalary.setEmployerName(salarySlipInfoSummary.getDetails());
				}
				if (salarySlipInfoSummary.getItem().equals("Date of Joining")) {
					employeeSalary.setDateOfJoining(salarySlipInfoSummary.getDetails());
				}

				if (salarySlipInfoSummary.getItem().equals("Unique Identification Number")) {
					employeeSalary.setUniqueIdentificationNumber(salarySlipInfoSummary.getDetails());
				}

				if (salarySlipInfoSummary.getItem().equals("Salary Credited To")) {
					employeeSalary.setSalaryCreditedTo(salarySlipInfoSummary.getDetails());
				}

				if (salarySlipInfoSummary.getItem().equals("Bank Account Number")) {
					employeeSalary.setBankAccountNumber(salarySlipInfoSummary.getDetails());
				}
			}
		}

		List<SalarySlipInfoDetail> salarySlipInfoDetailsList = salarySlipInfo.getSalarySlipInfoDetails();
		if (salarySlipInfoDetailsList != null) {
			for (SalarySlipInfoDetail salarySlipInfoDetails : salarySlipInfoDetailsList) {
				employeeSalary.setMonths(salarySlipInfoDetails.getMonths());
				employeeSalary.setMonthlyBasic(salarySlipInfoDetails.getMonthlyBasic());
				employeeSalary.setNetSalary(salarySlipInfoDetails.getNetSalary());
			}
		}

		return employeeSalary;
	}
}
