package com.EducationalLoan.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EducationalLoan.demo.model.LoanApplication;
import com.EducationalLoan.demo.respository.LoanApplicationRepository;
import com.EducationalLoan.demo.serviceinterface.LoanApplicationInterface;

@Service
public class LoanApplicationService implements LoanApplicationInterface {

	@Autowired
	LoanApplicationRepository lr;
	@Override
	public List<LoanApplication> fetchLoanDetails() {
		
		return lr.findAll();
	}

	@Override
	public LoanApplication postLoanDetails(LoanApplication l) {
		
		return lr.save(l);
	}

	@Override
	public LoanApplication putLoanDetails(LoanApplication l) {
		
		return lr.save(l);
	}

	@Override
	public void deleteLoanDetails(int loanid) {
		
		lr.deleteById(loanid);
	}

}
