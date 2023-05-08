package com.EducationalLoan.demo.model;

import jakarta.persistence.Id;

public class Login {

	@Id
	private String Email;
	private String Password;
	Login(){}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
}
