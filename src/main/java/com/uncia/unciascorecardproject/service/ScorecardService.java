package com.uncia.unciascorecardproject.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.uncia.unciascorecardproject.mapper.ScorecardMapper;
import com.uncia.unciascorecardproject.model.BankReport;
import com.uncia.unciascorecardproject.model.CreditSummaryScore;
import com.uncia.unciascorecardproject.model.EmployeeSalary;
import com.uncia.unciascorecardproject.model.SalarySlipInfo;

@Service
public class ScorecardService {

//	private final Logger logger = LoggerFactory.getLogger(ScorecardService.class);

	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private ObjectMapper objectMapper;

	public BankReport getCreditSummaryScore(String id) throws JsonMappingException, JsonProcessingException {

//		logger.info("Performing an action...");

		String apiUrl = "https://choriskopo.staging.autosift.cloud/api/work_orders/" + id + "/download/?file_type=json";
		HttpHeaders headers = new HttpHeaders();
		headers.set("client-id", "4fcdb49597a7666c");
		headers.set("client-secret", "fab905ce8f857237af96b0137d8ed543");
		HttpEntity<String> entity = new HttpEntity<>("", headers);
		ResponseEntity<String> response = restTemplate.exchange(apiUrl, HttpMethod.GET, entity, String.class);
		String jsonResponse = response.getBody();
		
		System.out.println("jsonResponse  >> "+jsonResponse);
		CreditSummaryScore creditSummaryScore = objectMapper.readValue(jsonResponse, CreditSummaryScore.class);
		BankReport bankReport = ScorecardMapper.CreditSummaryScoreToBankReport(creditSummaryScore);
//		logger.atTrace();
//		logger.debug("Action completed successfully.");

		return bankReport;
	}

	public EmployeeSalary getsalaryReport(String id) throws JsonMappingException, JsonProcessingException {

		String apiUrl = "https://choriskopo.staging.autosift.cloud/api/work_orders/" + id + "/download/?file_type=json";
		HttpHeaders headers = new HttpHeaders();
		headers.set("client-id", "4fcdb49597a7666c");
		headers.set("client-secret", "fab905ce8f857237af96b0137d8ed543");
		HttpEntity<String> entity = new HttpEntity<>("", headers);
		ResponseEntity<String> response = restTemplate.exchange(apiUrl, HttpMethod.GET, entity, String.class);
		String jsonResponse = response.getBody();
		SalarySlipInfo salarySlipInfo = objectMapper.readValue(jsonResponse, SalarySlipInfo.class);
		EmployeeSalary employeeSalaryReport = ScorecardMapper.employeeSalaryReport(salarySlipInfo);
		System.out.println(jsonResponse);
		System.out.println(salarySlipInfo);
		return employeeSalaryReport;

	}

}
