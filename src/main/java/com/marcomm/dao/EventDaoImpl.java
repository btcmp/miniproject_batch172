package com.marcomm.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.marcomm.model.Event;

@Repository
public class EventDaoImpl implements EventDao {

	@Autowired
	SessionFactory sessionFactory;

	public void save(Event event) {
		// TODO Auto-generated method stub
		event.setIsDelete(false);
		
		event.setCreatedBy("Sahid Triambudhi");
		event.setRequestBy(1);
		event.setStatus(1);
		
		Date now = new Date();
		event.setRequestDate(now);
		event.setCreatedDate(now);
		event.setStartDate(now);
		event.setEndDate(now);
		
		Session session = sessionFactory.getCurrentSession();
		session.save(event);
				
	}

	public List<Event> getAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Event.class);
		
		List<Event> events = criteria.add(Restrictions.eq("isDelete", false)).addOrder(Order.asc("id")).list();
		
		return events;
	}

	public String getCodeEvent() {
		// TODO Auto-generated method stub
		String hql = "from Event ORDER BY id DESC";
		Session session = sessionFactory.getCurrentSession();
		Event event = (Event) session.createQuery(hql).setMaxResults(1).uniqueResult();
		if(event==null) {
			return "TRWOEVDDMMYY00001";
		} else {
			String prefix = event.getCode().substring(0, 12);
			String angka = event.getCode().substring(12);
			int increment = Integer.valueOf(angka)+1;
			String endCode = prefix+String.format("%05d", increment);
			return endCode;
		}
		
	}
}
