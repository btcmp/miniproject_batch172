package com.marcomm.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.marcomm.model.MasterUnit;

@Repository
public class MasterUnitDaoImpl implements MasterUnitDao{

	@Autowired
	SessionFactory sessionFactory;
	
	//save data
	public void saveMasterUnit(MasterUnit masterUnit) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(masterUnit);
		
	}
	
	

}
