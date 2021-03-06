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
		role1.setCode("RO0001");
		role1.setRoleName("Administrator"); 
		initDBService.saveRole(role1);
		role2.setRoleName("Staff");
		role2.setCode("RO0002");
		initDBService.saveRole(role2);
		role3.setRoleName("Requester");
		role3.setCode("RO0003");
		initDBService.saveRole(role3);
		
		//menu  
		MasterMenu masterMenu1= new MasterMenu();
		MasterMenu masterMenu2= new MasterMenu();
		MasterMenu masterMenu3= new MasterMenu();
		MasterMenu masterMenu4= new MasterMenu();
		MasterMenu masterMenu5= new MasterMenu();
		MasterMenu masterMenu6= new MasterMenu();
		MasterMenu masterMenu7= new MasterMenu();
		MasterMenu masterMenu8= new MasterMenu();
		MasterMenu masterMenu9= new MasterMenu();
		
		masterMenu1.setCode("ME0001");
		masterMenu1.setName("Master Product");
		masterMenu1.setController("product");
		masterMenu1.setParentId(1);
		
		masterMenu2.setCode("ME0002");
		masterMenu2.setName("Master User");
		masterMenu2.setController("user");
		masterMenu2.setParentId(1);
		
		masterMenu3.setCode("ME0003");
		masterMenu3.setName("Master Company");
		masterMenu3.setController("company");
		masterMenu3.setParentId(1);
		
		masterMenu4.setCode("ME0004");
		masterMenu4.setName("Master Employee");
		masterMenu4.setController("employee");
		masterMenu4.setParentId(1);
		
		masterMenu5.setCode("ME0005");
		masterMenu5.setName("Master Souvenir");
		masterMenu5.setController("souvenir");
		masterMenu5.setParentId(1);
		
		masterMenu6.setCode("ME0006");
		masterMenu6.setName("Master Unit");
		masterMenu6.setController("masterunit");
		masterMenu6.setParentId(1);
		
		masterMenu7.setCode("ME0007");
		masterMenu7.setName("Master Role");
		masterMenu7.setController("role");
		masterMenu7.setParentId(1);
		
		masterMenu8.setCode("ME0008");
		masterMenu8.setName("Master Access");
		masterMenu8.setController("access");
		masterMenu8.setParentId(1);
		
		masterMenu9.setCode("ME0009");
		masterMenu9.setName("Master Menu");
		masterMenu9.setController("menu");
		masterMenu9.setParentId(1);
		
		
		menuService.save(masterMenu1);
		menuService.save(masterMenu2);
		menuService.save(masterMenu3);
		menuService.save(masterMenu4);
		menuService.save(masterMenu5);
		menuService.save(masterMenu6);
		menuService.save(masterMenu7);
		menuService.save(masterMenu8);
		menuService.save(masterMenu9);
		
		
		//menu_acces
		MasterMenuAccess menuAccess1=new MasterMenuAccess();
		
		List<MasterMenu> menus=new ArrayList<MasterMenu>();
		menus.add(masterMenu3);
		menus.add(masterMenu2);
		menus.add(masterMenu1);
		menuAccess1.setRole(role1);
		menuAccess1.setMenus(menus);
		menuAccessService.save(menuAccess1);
		
		
		
		//COMPANY
		MasterCompany company1=new MasterCompany();
		MasterCompany company2=new MasterCompany();
		MasterCompany company3=new MasterCompany();
	 
		 
		 
		company1.setName("XSis Mitra Anggi");
		company1.setCode("CP0001");
		company1.setCreatedBy("anggi");
		company1.setCreatedDate(new Date());  
		company1.setIsDelete(false);
		
		company2.setName("Bank OCBC");
		company2.setCode("CP0002");
		company2.setCreatedBy("Diaz");
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
		employee2.setCompany(company2);
		
		employee3.setEmployeeName("Reza");
		employee3.setCompany(company2);
		
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
		MasterUser userAdmin2 = new MasterUser();
		MasterUser userAdmin3 = new MasterUser();
		userAdmin.setUsername("Administrator"); 
		userAdmin.setPassword(encodePassword("12345"));
		userAdmin.setEmployee(employee1);
		userAdmin.setmRole(role1);
		userAdmin.setCreatedBy("Administrator");
		userAdmin.setUpdatedBy ("Administrator");
		userAdmin2.setUsername("diazfatahillah"); 
		userAdmin2.setPassword(encodePassword("Abc123"));
		userAdmin2.setEmployee(employee2);
		userAdmin2.setmRole(role1);
		userAdmin2.setCreatedBy("Administrator");
		userAdmin2.setUpdatedBy ("Administrator");
		userAdmin3.setUsername("MamadHAHA"); 
		userAdmin3.setPassword(encodePassword("12345"));
		userAdmin3.setEmployee(employee3);
		userAdmin3.setmRole(role2);
		userAdmin3.setCreatedBy("Administrator");
		userAdmin3.setUpdatedBy ("Administrator");
		userService.save(userAdmin);
		userService.save(userAdmin2);
		userService.save(userAdmin3);
		 
		
	
 	 
	}
	
	public static String encodePassword(String pass){
		BCryptPasswordEncoder passwordEncode = new BCryptPasswordEncoder();
		String thePassword =  pass;/*passwordEncode.encode(pass);*/
		return thePassword;
	}
	
}




