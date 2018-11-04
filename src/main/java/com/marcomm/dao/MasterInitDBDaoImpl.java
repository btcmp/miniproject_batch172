package com.marcomm.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.marcomm.model.MasterEmployee;
import com.marcomm.model.MasterRole;

@Repository
public class MasterInitDBDaoImpl implements MasterInitDBDao{

	
	
	@Autowired
	SessionFactory sessionFactory;
	
	public void saveEmployee(MasterEmployee employee) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.save(employee);
	}

	public void saveRole(MasterRole role) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.save(role);
	}

	
	
}
