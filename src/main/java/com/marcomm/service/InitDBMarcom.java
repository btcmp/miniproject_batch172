package com.marcomm.service;

 
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.marcomm.model.MasterUser;
 

@Component
public class InitDBMarcom {

	@Autowired
	MasterUserService userService;
	 
	 
	@PostConstruct
	public void init(){
		 
		//insert user
		MasterUser userAdmin = new MasterUser();
		userAdmin.setUsername("anggiNugrohoHebat"); 
		userAdmin.setPassword(encodePassword("12345"));
		userAdmin.setmEmployeeId("Anggi Nugroho");
		userAdmin.setmRoleId("ROLE_ADMIN");
		userService.save(userAdmin);
		 
	}
	
	public static String encodePassword(String pass){
		BCryptPasswordEncoder passwordEncode = new BCryptPasswordEncoder();
		String thePassword = passwordEncode.encode(pass);
		return thePassword;
	}
	
}




