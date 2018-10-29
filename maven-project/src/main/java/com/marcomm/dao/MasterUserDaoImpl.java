package com.marcomm.dao;

import java.util.Date;
import java.util.List;

import org.bouncycastle.asn1.isismtt.x509.Restriction;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.marcomm.model.MasterUser;

@Repository
public  class MasterUserDaoImpl implements MasterUserDao{

	@Autowired
	SessionFactory sessionFactory;
 
	
	public void save(MasterUser masterUser) {
		// TODO Auto-generated method stub
		Date date= new Date();
		masterUser.setUpdatedDate(date);
		masterUser.setCreatedDate(date);
		masterUser.setCreatedBy("admin");
		masterUser.setUpdatedBy("admin");
		masterUser.setIsDelete(0);
		Session session= sessionFactory.getCurrentSession();
		session.save(masterUser);
	}

	public List<MasterUser> getAll() {
		Session session= sessionFactory.getCurrentSession();
		Criteria cr= session.createCriteria(MasterUser.class);
		List<MasterUser> listUser= cr.add(Restrictions.eq ("isDelete", 0)).addOrder(Order.asc("id")).list();
		return  listUser;
	}

	public MasterUser getById(int id) {
		Session session= sessionFactory.getCurrentSession();
		return session.get(MasterUser.class, id);
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		MasterUser masterUser=new MasterUser();
		masterUser=getById(id);
		masterUser.setIsDelete(1);
		Date date= new Date();
		masterUser.setUpdatedDate(date);
		Session session=sessionFactory.getCurrentSession();
		session.update(masterUser);
		
	}

	public void update(MasterUser masterUser) {
		// TODO Auto-generated method stub
		
		Date date= new Date();
		masterUser.setUpdatedDate(date);
		masterUser.setCreatedDate(date);
		masterUser.setUpdatedBy("admin");
		masterUser.setIsDelete(0);
		Session session=sessionFactory.getCurrentSession();
		session.update(masterUser);
	}

 

}
