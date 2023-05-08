package com.EducationalLoan.demo.serviceinterface;

import java.util.List;

import com.EducationalLoan.demo.model.LoanApplication;

public interface LoanApplicationInterface {

	List<LoanApplication> fetchLoanDetails();
	LoanApplication postLoanDetails(LoanApplication l);
	LoanApplication putLoanDetails(LoanApplication l);
	void deleteLoanDetails(int loanid);
}
