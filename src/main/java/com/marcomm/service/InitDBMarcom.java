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
import com.marcomm.model.MasterCompany;
import com.marcomm.model.MasterEmployee;
import com.marcomm.model.MasterRole;
/*import com.marcomm.model.MasterRole;*/
import com.marcomm.model.MasterUser;
 

@Component 
public class InitDBMarcom {

	@Autowired
	MasterUserService userService;
	@Autowired
	MasterCompanyService companyService;
	 @Autowired
	InitDBService initDBService;
	 
	@PostConstruct
	public void init(){
		 
		//Role
		MasterRole role1=new MasterRole();
		MasterRole role2=new MasterRole();
		MasterRole role3=new MasterRole();
	
		role1.setRoleName("Administrator"); 
		role2.setRoleName("Staff");
		role3.setRoleName("Requester");
	
		initDBService.saveRole(role1);
		initDBService.saveRole(role2);
		initDBService.saveRole(role3);
		
		//COMPANY
		MasterCompany company1=new MasterCompany();
		MasterCompany company2=new MasterCompany();
		MasterCompany company3=new MasterCompany();
	 
		 
		 
		company1.setName("XSis Mitra Anggi");
		company1.setCode("CP0001");
		company1.setCreatedBy("anggi");
		company1.setCreatedDate(new Date());  
		company1.setIsDelete(false);
		
		company2.setName("XSis Mitra Anggi1");
		company2.setCode("CP0002");
		company2.setCreatedBy("anggi1");
		company2.setCreatedDate(new Date());  
		company2.setIsDelete(false);
		
		company3.setName("XSis Mitra Anggi2");
		company3.setCode("CP0003");
		company3.setCreatedBy("anggi2");
		company3.setCreatedDate(new Date());  
		company3.setIsDelete(false);
		  
		companyService.saveCompany(company1);
		companyService.saveCompany(company2);
		companyService.saveCompany(company3);
		
		
		  
		//Employee
		MasterEmployee employee1=new MasterEmployee();
		MasterEmployee employee2=new MasterEmployee();
		MasterEmployee employee3=new MasterEmployee();
		MasterEmployee employee4=new MasterEmployee();
		MasterEmployee employee5=new MasterEmployee();
		MasterEmployee employee6=new MasterEmployee();
		employee1.setEmployeeName("Anggi");
		employee1.setCompany(company1);
		
		employee2.setEmployeeName("Diaz Fatahillah");
		employee2.setCompany(company1);
		
		employee3.setEmployeeName("Reza");
		employee3.setCompany(company1);
		
		employee4.setEmployeeName("Mamad");
		employee4.setCompany(company1);
		
		employee5.setEmployeeName("Tya");
		employee5.setCompany(company2);
		
		employee6.setEmployeeName("Pak Riza");
		employee6.setCompany(company2);
		
		initDBService.saveEmployee(employee1);
		initDBService.saveEmployee(employee2);
		initDBService.saveEmployee(employee3);
		initDBService.saveEmployee(employee4);
		initDBService.saveEmployee(employee5);
		initDBService.saveEmployee(employee6);
		
		//insert user
		MasterUser userAdmin = new MasterUser();
		userAdmin.setUsername("Administrator"); 
		userAdmin.setPassword(encodePassword("12345"));
		userAdmin.setEmployee(employee1);
		userAdmin.setmRole(role1);
		userService.save(userAdmin);
		
		 
		
	
 	 
	}
	
	public static String encodePassword(String pass){
		BCryptPasswordEncoder passwordEncode = new BCryptPasswordEncoder();
		String thePassword =  pass;/*passwordEncode.encode(pass);*/
		return thePassword;
	}
	
}




