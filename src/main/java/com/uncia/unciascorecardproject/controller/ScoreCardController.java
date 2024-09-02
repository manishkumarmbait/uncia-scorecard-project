package com.uncia.unciascorecardproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.uncia.unciascorecardproject.model.BankReport;
import com.uncia.unciascorecardproject.model.EmployeeSalary;
import com.uncia.unciascorecardproject.service.ScorecardService;

@RestController
@RequestMapping("/api")
public class ScoreCardController {

	@Autowired
	private ScorecardService scorecardService;

	@GetMapping("/bankReport")
	public ResponseEntity<BankReport> getCreditSummaryScore(@RequestParam String id)
			throws JsonMappingException, JsonProcessingException {
		BankReport bankReport = scorecardService.getCreditSummaryScore(id);
		return new ResponseEntity<>(bankReport, HttpStatus.OK);
	}

	@GetMapping("/salaryReport")
	public ResponseEntity<EmployeeSalary> getsalaryReport(@RequestParam String id)
			throws JsonMappingException, JsonProcessingException {
		EmployeeSalary salaryReport = scorecardService.getsalaryReport(id);
		return new ResponseEntity<>(salaryReport, HttpStatus.OK);
	}
}
