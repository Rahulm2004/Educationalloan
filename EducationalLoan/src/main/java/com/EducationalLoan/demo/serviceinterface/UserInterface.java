package com.EducationalLoan.demo.serviceinterface;

import java.util.List;

import com.EducationalLoan.demo.model.User;

public interface UserInterface {

	List<User> getAllUserDetails();

	User postUserDetails(User id);

	User putUserDetails(User id);

	void deleteUserDetails(int id);

}
