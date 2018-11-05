package com.marcomm.dao;

import java.util.List;

import com.marcomm.model.MasterEmployee;
import com.marcomm.model.MasterUser;

public interface EmployeeDao {
	
	public List<MasterEmployee> getAllEmployee();
	public List<MasterEmployee> getEmployeesByUserNotUsed(List<Integer> idEmployees);

}
