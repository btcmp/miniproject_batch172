package com.marcomm.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository; 

import com.marcomm.model.TransaksiDesign;

 


@Repository
public class TransaksiDesignDaoImpl implements TransaksiDesignDao {
	
	@Autowired
	SessionFactory sessionFactory;



	
	
	public void save(TransaksiDesign tDesign) {
		Session session=sessionFactory.getCurrentSession();
		session.save(tDesign);	
	}

	public void delete(TransaksiDesign tDesign) {
		Session session=sessionFactory.getCurrentSession();
		session.update(tDesign);
	}
	

	public void update(TransaksiDesign tDesign) {
		// TODO Auto-generated method stub
		
	}

	public TransaksiDesign getById(int id) {
		Session session=sessionFactory.getCurrentSession();
		return session.get(TransaksiDesign.class, id);
	}

	
	public List<TransaksiDesign> getAll() {
		return null;
	}

}
