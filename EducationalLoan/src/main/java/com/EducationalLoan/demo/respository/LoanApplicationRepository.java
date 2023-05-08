package com.EducationalLoan.demo.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EducationalLoan.demo.model.LoanApplication;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication,Integer>{

}
