package com.EducationalLoan.demo.serviceinterface;

import java.util.List;

import com.EducationalLoan.demo.model.Admin;

public interface AdminInterface {
	List<Admin> fetchAdminDetails();
	Admin postAdminDetails(Admin a);
	Admin putAdminDetails(Admin a);
	void deleteAdminDetails(int id);
}
