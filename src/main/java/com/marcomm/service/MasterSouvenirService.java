package com.marcomm.service;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcomm.dao.MasterSouvenirDao;
import com.marcomm.dao.MasterUnitDao;
import com.marcomm.dao.MasterUserDao;
import com.marcomm.model.MasterSouvenir;
import com.marcomm.model.MasterUnit;
import com.marcomm.model.MasterUser;
import com.marcomm.model.TransaksiSouvenir;

@Service
@Transactional
public class MasterSouvenirService {
	
	@Autowired
	MasterSouvenirDao masterSouvenirDao;
	@Autowired
	MasterUnitDao masterUnitDao;
	@Autowired
	MasterUserDao masterUserDao;
	
	public void save(MasterSouvenir masterSouvenir) {
		MasterUser userlogin= masterUserDao.getUserByUserLog();
		masterSouvenir.setCreatedBy(userlogin.getmRole().getRoleName());
		Date date = new Date();
		masterSouvenir.setCreatedDate(date);
		masterSouvenir.setDeleted(false);
		masterSouvenirDao.save(masterSouvenir);
	}
	 
	public String getCode() {
		return masterSouvenirDao.getCodeById();
	}
	
	public List<MasterSouvenir> gelAllSouvenir(){
		return masterSouvenirDao.gelAllSouvenir();
	}
	
	public MasterSouvenir getSouvenirById(int id) {
		MasterSouvenir masterSouvenir = masterSouvenirDao.getSouvenirById(id);
		/*Integer idMasterUnit = null;
		try{
			idMasterUnit = masterSouvenir.getMasterUnit().getId();
		}catch(Exception e){}
		
		MasterUnit masterUnit = masterUnitDao.getMasterUnitById(
				idMasterUnit = (idMasterUnit == null) ? 0 : idMasterUnit);
		masterSouvenir.setMasterUnit(masterUnit);*/
		return masterSouvenir;
	}
	public void update(MasterSouvenir masterSouvenir) {
		MasterUser userlogin= masterUserDao.getUserByUserLog();
		
		masterSouvenir.setUpdatedBy(userlogin.getmRole().getRoleName());
		Date date = new Date();
		masterSouvenir.setUpdatedDate(date);
		masterSouvenir.setDeleted(false);
		masterSouvenirDao.update(masterSouvenir);
	}
	
	public void updateDelete(MasterSouvenir masterSouvenir) {
		masterSouvenir.setDeleted(true);
		masterSouvenirDao.updateDelete(masterSouvenir);
	}

	public List<MasterSouvenir> getByName(String name) {
		// TODO Auto-generated method stub
		return masterSouvenirDao.getByName(name);
	}
	
	public List<MasterSouvenir> getAllSouvenirQtyOk(){
		return masterSouvenirDao.getAllSouvenirQtyOk();
	}

	

}
