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
import org.springframework.transaction.annotation.Transactional;

import com.marcomm.dao.MasterInitDBDao;
import com.marcomm.model.MasterEmployee;
import com.marcomm.model.MasterRole;
/*import com.marcomm.model.MasterRole;*/
import com.marcomm.model.MasterUser;
 

@Component 
public class InitDBMarcom {

	@Autowired
	MasterUserService userService;
	 @Autowired
	InitDBService initDBService;
	 
	@PostConstruct
	public void init(){
		 
		//Role
		MasterRole role1=new MasterRole();
		MasterRole role2=new MasterRole();
		MasterRole role3=new MasterRole();
		role1.setId(1);
		role1.setRoleName("ROLE_ADMIN"); 
		initDBService.saveRole(role1);
		role2.setRoleName("ROLE_STAFF");
		initDBService.saveRole(role2);
		role3.setRoleName("ROLE_REQUEST");
		initDBService.saveRole(role3);
		
		
		//insert user
		MasterUser userAdmin = new MasterUser();
		userAdmin.setUsername("aaaaa"); 
		userAdmin.setPassword(encodePassword("12345"));
		userAdmin.setmEmployeeId(1);
		userAdmin.setmRole(role1);
		userService.save(userAdmin);
		
		//Employee
		MasterEmployee employee1=new MasterEmployee();
		MasterEmployee employee2=new MasterEmployee();
		MasterEmployee employee3=new MasterEmployee();
		employee1.setId(1);
		employee1.setEmployeeName("anggi");
		initDBService.saveEmployee(employee1);
		employee2.setEmployeeName("diaz");
		initDBService.saveEmployee(employee2);
		employee3.setEmployeeName("Shinta");
		initDBService.saveEmployee(employee3);
		 
		
	
 	 
	}
	
	public static String encodePassword(String pass){
		BCryptPasswordEncoder passwordEncode = new BCryptPasswordEncoder();
		String thePassword =  pass;/*passwordEncode.encode(pass);*/
		return thePassword;
	}
	
}




