package com.marcomm.service;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcomm.dao.EmployeeDao;
import com.marcomm.dao.MasterCompanyDao;
import com.marcomm.dao.MasterUserDao;
import com.marcomm.model.MasterEmployee;
import com.marcomm.model.MasterRole;
import com.marcomm.model.MasterUser;

@Service
@Transactional
public class MasterUserService {
	
	@Autowired
	MasterUserDao userDao;

	@Autowired
	EmployeeDao employeeDao;
	
	
	public void save(MasterUser masterUser) {
		
		userDao.save(masterUser);
		// TODO Auto-generated method stub
		
	}

	public List<MasterUser> getAll() {
		 
		return userDao.getAll();
	}

	public MasterUser getById(int id) {
		// TODO Auto-generated method stub
		return userDao.getById(id);
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		userDao.delete(id);
	}

	public void update(MasterUser masterUser) {
		// TODO Auto-generated method stub
		userDao.update(masterUser);
	}

	public List<MasterRole> getAllRole() {
		 
		return userDao.getAllRole();
	}

	public List<MasterEmployee> getAllEmployee() {
	 
		return userDao.getAllEmployee();
	}

	public List<MasterUser> getByName(String username) {
		// TODO Auto-generated method stub
		return userDao.getByName(username);
	}

	public String getRole() {
		
		return userDao.getRole();
	}

}
