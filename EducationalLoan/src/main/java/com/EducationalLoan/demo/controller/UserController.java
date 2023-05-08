package com.EducationalLoan.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EducationalLoan.demo.model.User;
import com.EducationalLoan.demo.service.UserService;


@RestController
@CrossOrigin("*")
public class UserController {

	@Autowired
	UserService us;
	
	@GetMapping("/getAllUserDetails")
    public List<User> getAllUserDetails() {
		
		return us.getAllUserDetails();
	}

	@PostMapping("/postUserDetails")
	public User postUserDetails(User id) {
		
		return us.postUserDetails(id);
	}

	@PutMapping("/putUserDetails")
	public String putUserDetails(User id) {
		
		us.putUserDetails(id);
		return "User details are Updated";
	}

	@DeleteMapping("/deleteUserDetails")
	public String deleteUserDetails(int id) {
		
		us.deleteUserDetails(id);
		return "User details are deleted";
	}
	
}
