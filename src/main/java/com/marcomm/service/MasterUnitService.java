package com.marcomm.service;


import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcomm.dao.MasterUnitDao;
import com.marcomm.dao.MasterUserDao;
import com.marcomm.model.MasterUnit;
import com.marcomm.model.MasterUser;

@Service
@Transactional
public class MasterUnitService {

	@Autowired
	MasterUnitDao masterUnitDao;
	
	@Autowired
	MasterUserDao masterUserDao;
	
	/*save*/
	public void saveMasterUnit(MasterUnit masterUnit) {
		MasterUser mu = masterUserDao.getUserByUserLog();
		masterUnit.setCreatedBy(mu.getmRole().getRoleName());
		masterUnitDao.saveMasterUnit(masterUnit);
	}
	
	/*get unit by id*/
	public MasterUnit getUnitById(int id) {
		return masterUnitDao.getUnitById(id);
	}
	
	/*get all unit*/
	public List<MasterUnit> getAllUnit() {
		return masterUnitDao.getAllUnit();
	}
	
	/*delete unit*/
	public void deleteUnit(int id) {
		MasterUnit masterUnit = new MasterUnit();
		masterUnit.setId(id);
		masterUnitDao.deleteUnit(masterUnit);
		
	}
	
	/*update unit*/
	public void updateUnit(MasterUnit masterUnit) {
		MasterUnit mut = masterUnit;
		MasterUser mu = masterUserDao.getUserByUserLog();
		mut.setUpdatedBy(mu.getmRole().getRoleName());
		Date date = new Date();
		mut.setUpdatedDate(date);
		masterUnitDao.updateUnit(mut);
	}
	
	/*get code*/
	public String getCode() {
		// TODO Auto-generated method stub
		return masterUnitDao.getCode();
	}
	/*get by name*/
	public List<MasterUnit> getByName(String name) {
		return masterUnitDao.getByName(name);
	}
	
	
	
	
}
