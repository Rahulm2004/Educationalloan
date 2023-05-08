package com.EducationalLoan.demo.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EducationalLoan.demo.model.Admin;

public interface AdminRepository extends JpaRepository<Admin,Integer>{

}
