package com.uncia.unciascorecardproject.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreditSummaryScore {

	@JsonProperty("Summary - Scorecard")
	private List<SummaryScorecard> summaryScorecard;
	@JsonProperty("Summary - Fixed Income / Obligation")
	private List<SummaryFixedIncomeObligation> summaryFixedIncomeObligation;
	@JsonProperty("Scoring Details")
	private List<ScoringDetails> scoringDetails;

	public List<SummaryScorecard> getSummaryScorecard() {
		return summaryScorecard;
	}

	public void setSummaryScorecard(List<SummaryScorecard> summaryScorecard) {
		this.summaryScorecard = summaryScorecard;
	}

	public List<SummaryFixedIncomeObligation> getSummaryFixedIncomeObligation() {
		return summaryFixedIncomeObligation;
	}

	public void setSummaryFixedIncomeObligation(List<SummaryFixedIncomeObligation> summaryFixedIncomeObligation) {
		this.summaryFixedIncomeObligation = summaryFixedIncomeObligation;
	}

	public List<ScoringDetails> getScoringDetails() {
		return scoringDetails;
	}

	public void setScoringDetails(List<ScoringDetails> scoringDetails) {
		this.scoringDetails = scoringDetails;
	}

}
