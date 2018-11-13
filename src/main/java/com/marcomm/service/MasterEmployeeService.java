package com.marcomm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcomm.dao.EmployeeDao;
import com.marcomm.dao.MasterUserDao;
import com.marcomm.model.MasterEmployee;
import com.marcomm.model.MasterRole;
import com.marcomm.model.MasterUser;

@Transactional
@Service
public class MasterEmployeeService {
	@Autowired
	EmployeeDao employeeDao;
	@Autowired
	MasterUserDao userDao;
	
	public List<MasterEmployee> getAllEmployee() {
		 
		return employeeDao.getAllEmployee();
	}
	
	public List<MasterEmployee> getEmployeesNotInUser(){
		List<MasterUser> users= userDao.getAll();
		List<Integer> idEmployees= new ArrayList();
		for(MasterUser user:users) {
			idEmployees.add(user.getEmployee().getId());
		} 
		
		List<MasterEmployee> employees= employeeDao.getEmployeesByUserNotUsed(idEmployees);
		
		
		return employees;
	}

	public List<MasterEmployee> getAllEmployeeStaff() {
		// TODO Auto-generated method stub
		List<MasterUser> users= userDao.getAll();
		System.out.println(users);
		List<MasterEmployee> employees=new ArrayList<MasterEmployee>();
		System.out.println("daftar employee staff");
		for (MasterUser masterUser : users) {
			MasterRole role= masterUser.getmRole();
			
			if(role.getRoleName().equals("Staff")) {
				employees.add(masterUser.getEmployee());
				System.out.println(masterUser.getEmployee());
			}
		}
		
		return employees;
	}
	
	
}
