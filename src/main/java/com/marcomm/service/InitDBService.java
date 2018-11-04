package com.marcomm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcomm.dao.MasterInitDBDao;
import com.marcomm.dao.MasterInitDBDaoImpl;
import com.marcomm.model.MasterEmployee;
import com.marcomm.model.MasterRole;

@Service
@Transactional
public class InitDBService {

	@Autowired
	MasterInitDBDao masterInit;
	
	
	public void saveEmployee (MasterEmployee employee) {
		masterInit.saveEmployee(employee);
	}
	
	public void saveRole (MasterRole role) {
		masterInit.saveRole(role);
	}
}
