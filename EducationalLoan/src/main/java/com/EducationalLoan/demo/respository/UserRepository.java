package com.EducationalLoan.demo.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EducationalLoan.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

//	User findByEmail(String email);
//	Optional<User> findOneByEmailAndPassword(String email,String password);
	
}
