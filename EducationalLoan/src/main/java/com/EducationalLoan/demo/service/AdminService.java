package com.EducationalLoan.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EducationalLoan.demo.model.Admin;
import com.EducationalLoan.demo.respository.AdminRepository;
import com.EducationalLoan.demo.serviceinterface.AdminInterface;

@Service
public class AdminService implements AdminInterface {

	@Autowired
	AdminRepository ar;
	@Override
	public List<Admin> fetchAdminDetails() {
		return ar.findAll();
	}

	@Override
	public Admin postAdminDetails(Admin a) {
	
		return ar.save(a);
	}

	@Override
	public Admin putAdminDetails(Admin a) {
		
		return ar.save(a);
	}

	@Override
	public void deleteAdminDetails(int id) {
		ar.deleteById(id);

	}

}
