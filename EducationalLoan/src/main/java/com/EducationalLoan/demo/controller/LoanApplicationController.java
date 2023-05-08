package com.EducationalLoan.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EducationalLoan.demo.model.LoanApplication;
import com.EducationalLoan.demo.service.LoanApplicationService;

@RestController
public class LoanApplicationController {
     
	@Autowired
	LoanApplicationService ls;
	
	@GetMapping("/fetchLoanDetails")
    public List<LoanApplication> fetchLoanDetails() {
		
		return ls.fetchLoanDetails();
	}
	
	@PostMapping("/postLoanDetails")
	public LoanApplication postLoanDetails(LoanApplication l) {
		
		return ls.postLoanDetails(l);
	}
	
	@PutMapping("/putLoanDetails")
	public LoanApplication putLoanDetails(LoanApplication l) {
		
		return ls.putLoanDetails(l);
	}
	
	@DeleteMapping("/deleteLoanDetails")
	public String deleteLoanDetails(int loanid) {
		
		ls.deleteLoanDetails(loanid);
		return "LoanDetails deleted";
	}
}
