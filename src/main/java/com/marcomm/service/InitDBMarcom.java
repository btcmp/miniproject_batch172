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
import com.marcomm.model.MasterMenu;
import com.marcomm.model.MasterMenuAccess;
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
	@Autowired
	MasterMenuService menuService;
	@Autowired
	MasterMenuAccessService menuAccessService;
	
	@PostConstruct
	public void init(){
		 
		//Role
		MasterRole role1=new MasterRole();
		MasterRole role2=new MasterRole();
		MasterRole role3=new MasterRole();
		role1.setId(1);
		role1.setRoleName("ROLE_ADMIN");
		role1.setCode("RO0001");
		role1.setRoleName("Administrator"); 
		role2.setRoleName("Staff");
		role3.setRoleName("Requester");
		initDBService.saveRole(role1);
		role2.setRoleName("ROLE_STAFF");
		role2.setCode("RO0002");
		initDBService.saveRole(role2);
		role3.setRoleName("ROLE_REQUEST");
		role3.setCode("RO0003");
		initDBService.saveRole(role3);
		
		//menu  
		MasterMenu masterMenu1= new MasterMenu();
		MasterMenu masterMenu2= new MasterMenu();
		MasterMenu masterMenu3= new MasterMenu();
		
		masterMenu1.setCode("ME0001");
		masterMenu1.setName("Menu Product");
		masterMenu1.setController("product");
		masterMenu1.setParentId(1);
		
		masterMenu2.setCode("ME0002");
		masterMenu2.setName("Menu User");
		masterMenu2.setController("user");
		masterMenu2.setParentId(1);
		
		masterMenu3.setCode("ME0003");
		masterMenu3.setName("Menu Company");
		masterMenu3.setController("company");
		masterMenu3.setParentId(1);
		
		menuService.save(masterMenu1);
		menuService.save(masterMenu2);
		menuService.save(masterMenu3);
		
		
		//menu_acces
		MasterMenuAccess menuAccess1=new MasterMenuAccess();
	 
		
		
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




