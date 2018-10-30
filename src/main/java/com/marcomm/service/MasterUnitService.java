package com.marcomm.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcomm.dao.MasterUnitDao;
import com.marcomm.model.MasterUnit;

@Service
@Transactional
public class MasterUnitService {

	@Autowired
	MasterUnitDao masterUnitDao;
	
	public void saveMasterUnit(MasterUnit masterUnit) {
		// TODO Auto-generated method stub
		//set date
		Date date = new Date();
		masterUnit.setCreatedDate(date);
		masterUnit.setUpdatedDate(date);
		masterUnit.setDelete(true);
		masterUnitDao.saveMasterUnit(masterUnit);
	}
	
}
