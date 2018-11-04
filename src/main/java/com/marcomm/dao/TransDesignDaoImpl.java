package com.marcomm.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository; 

import com.marcomm.model.TransDesign;

 


@Repository
public class TransDesignDaoImpl implements TransDesignDao {
	
	@Autowired
	SessionFactory sessionFactory;



	
	
	public void save(TransDesign tDesign) {
		Session session=sessionFactory.getCurrentSession();
		session.save(tDesign);	
	}

	public void delete(TransDesign tDesign) {
		Session session=sessionFactory.getCurrentSession();
		session.update(tDesign);
	}
	

	public void update(TransDesign tDesign) {
		// TODO Auto-generated method stub
		
	}

	public TransDesign getById(int id) {
		Session session=sessionFactory.getCurrentSession();
		return session.get(TransDesign.class, id);
	}

	
	public List<TransDesign> getAll() {
		return null;
	}

}
