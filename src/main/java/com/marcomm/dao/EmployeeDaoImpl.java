package com.marcomm.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.marcomm.model.MasterEmployee;
import com.marcomm.model.MasterUser;
@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	SessionFactory sessionFactory;

	public List<MasterEmployee> getAllEmployee() {
		// TODO Auto-generated method stub
		Session session= sessionFactory.getCurrentSession();
		return session.createCriteria(MasterEmployee.class).list();
	}

	public List<MasterEmployee> getEmployeesByUserNotUsed(List<Integer> ids) {
	Session session =sessionFactory.getCurrentSession();
	
	String hql ="select me from MasterEmployee as me where me.id not in (:ids)";
	Query query=session.createQuery(hql);
	query.setParameterList("ids", ids);
	
		return query.list();
	}
	
	

}
