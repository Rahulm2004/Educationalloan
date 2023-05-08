package com.EducationalLoan.demo.service;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.EducationalLoan.demo.dto.UserLoginDTO;
import com.EducationalLoan.demo.model.User;
import com.EducationalLoan.demo.respository.UserRepository;
import com.EducationalLoan.demo.serviceinterface.UserInterface;

@Service
public class UserService implements UserInterface {
    
	@Autowired
	UserRepository ur;
	
	@Override
	public List<User> getAllUserDetails() {
		
		return ur.findAll();
	}

	@Override
	public User postUserDetails(User id) {
		
		return ur.save(id);
	}

	@Override
	public User putUserDetails(User id) {
		
		return ur.save(id);
	}

	@Override
	public void deleteUserDetails(int id) {
		
		ur.deleteById(id);
	}
	
//	@Override
//    public LoginMessage userLogin(UserLoginDTO loginDTO) {
//        User user1 = ur.findByEmail(loginDTO.getEmail());
//        if (user1 != null) {
//        	
//            String password = loginDTO.getPassword();
//    
//            if (password.equals(password)) {
//            	
//                Optional<User> user = ur.findOneByEmailAndPassword(loginDTO.getEmail(), password);
//                
//                if (user.isPresent()) {
//                	
//                    return new LoginMessage("Login Success", true);
//                } 
//                else {
//                	
//                    return new LoginMessage("Password not match", false);
//                }
//            } 
//            else {
// 
//                return new LoginMessage("Email not exist", false);
//            }
//        }
//        else {
//        	
//            return new LoginMessage("check your email and password", false);
//        }
//    }
}
