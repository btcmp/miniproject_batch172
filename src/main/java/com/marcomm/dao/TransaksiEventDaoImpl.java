package com.marcomm.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.marcomm.model.TransaksiEvent;

@Repository
public class TransaksiEventDaoImpl implements TransaksiEventDao {

	@Autowired
	SessionFactory sessionFactory;

	public void save(TransaksiEvent event) {
		// TODO Auto-generated method stub
		event.setIsDelete(false);
		
		event.setCreatedBy("Sahid Triambudhi");
		event.setRequestBy(1);
		event.setStatus(1);
		
		Date now = new Date();
		event.setRequestDate(now);
		event.setCreatedDate(now);
		
		Session session = sessionFactory.getCurrentSession();
		session.save(event);
				
	}

	public List<TransaksiEvent> getAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(TransaksiEvent.class);
		
		List<TransaksiEvent> events = criteria.add(Restrictions.eq("isDelete", false)).addOrder(Order.asc("id")).list();
		
		return events;
	}

	public String getCodeEvent() {
		// TODO Auto-generated method stub
		String hql = "from TransaksiEvent ORDER BY id DESC";
		SimpleDateFormat format = new SimpleDateFormat("ddMMyy");
		String currentDate = format.format(new Date());
		String kodeDepan = "TRWOEV";
		Session session = sessionFactory.getCurrentSession();
		TransaksiEvent event = (TransaksiEvent) session.createQuery(hql).setMaxResults(1).uniqueResult();
		if(event==null) {
			String angka = "00001";
			String fullCode = kodeDepan+currentDate+angka;
			return fullCode;
		} else {
			String angka = event.getCode().substring(12);
			int increment = Integer.valueOf(angka)+1;
			String endCode = kodeDepan+currentDate+String.format("%05d", increment);
			return endCode;
		}
		
	}

	public TransaksiEvent getEventById(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		TransaksiEvent event = session.get(TransaksiEvent.class, id);
		return event;
	}

	public void update(TransaksiEvent event) {
		// TODO Auto-generated method stub
		event.setIsDelete(false);
		
		event.setCreatedBy("Sahid Triambudhi");
		event.setRequestBy(1);
		event.setStatus(1);
		
		Date now = new Date();
		event.setRequestDate(now);
		event.setCreatedDate(now);

		Session session = sessionFactory.getCurrentSession();
		session.update(event);
	}

	public void closeEvent(int id) {
		// TODO Auto-generated method stub
		TransaksiEvent event = new TransaksiEvent();
		event = getEventById(id);
		event.setStatus(3);
		Date now = new Date();
		event.setUpdatedDate(now);
		
		Session session = sessionFactory.getCurrentSession();
		session.update(event);
	}

	public void accept(TransaksiEvent event) {
		// TODO Auto-generated method stub
		event.setIsDelete(false);
		
		event.setCreatedBy("Sahid Triambudhi");
		event.setRequestBy(1);
		event.setStatus(2);
		
		Date now = new Date();
		event.setUpdatedDate(now);
		
		Session session = sessionFactory.getCurrentSession();
		session.update(event);
	}

	public void reject(TransaksiEvent event) {
		// TODO Auto-generated method stub
		event.setIsDelete(false);
		
		event.setCreatedBy("Sahid Triambudhi");
		event.setRequestBy(1);
		event.setStatus(0);
		
		Date now = new Date();
		event.setUpdatedDate(now);
		
		Session session = sessionFactory.getCurrentSession();
		session.update(event);
	}

}
