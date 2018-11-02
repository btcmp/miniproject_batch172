package com.marcomm.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.marcomm.model.MasterUnit;

@Repository
public class MasterUnitDaoImpl implements MasterUnitDao{

	@Autowired
	SessionFactory sessionFactory;
	
	/*save data*/
	public void saveMasterUnit(MasterUnit masterUnit) {
		//set date
		Date date = new Date();
		masterUnit.setCreatedDate(date);
		masterUnit.setUpdatedDate(date);
		//set is delete
		masterUnit.setDelete(false);
		//set code
		//masterUnit.setCode(getCode());
		//session user login ---> belum fix
		masterUnit.setCreatedBy("admin");
		masterUnit.setUpdatedBy("admin");
		Session session = sessionFactory.getCurrentSession();
		session.save(masterUnit);	
	}
	/*get by id*/
	public MasterUnit getUnitById(int id) {
		Session session = sessionFactory.getCurrentSession();
		MasterUnit masterUnit = session.get(MasterUnit.class, id);
		return masterUnit;
	}
	/*get all unit*/
	public List<MasterUnit> getAllUnit() {
		Session session = sessionFactory.getCurrentSession();
		Criteria cr = session.createCriteria(MasterUnit.class);
		List<MasterUnit> listUnit = cr.add(Restrictions.eq("isDelete", false)).addOrder(Order.asc("id")).list();
		return listUnit;
	}
	/*get code*/
	public String getCode() {
		String hql = "from MasterUnit ORDER BY id DESC";
		Session session = sessionFactory.getCurrentSession();
		MasterUnit masterUnit = (MasterUnit) session.createQuery(hql).setMaxResults(1).uniqueResult();
		
		if(masterUnit==null) {
			return "UN0001";
		}else {
			 String prefix = masterUnit.getCode().substring(0, 2);
			 String angka = masterUnit.getCode().substring(2);
			 System.out.println(angka);
			 int increment = Integer.valueOf(angka)+1;
			 String endCode = prefix+String.format("%04d", increment);
			 return endCode;
		}
	}
	/*delete unit*/
	public void deleteUnit(MasterUnit masterUnit) {
		//masterUnit.setDelete(1);
		Session session = sessionFactory.getCurrentSession();
		session.delete(masterUnit);
	}
	
	/*update unit*/
	public void updateUnit(MasterUnit mut) {
		Session session = sessionFactory.getCurrentSession();
		session.update(mut);
		
	}
	/*get by name*/
	public List<MasterUnit> getByName(String kataPertama) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(MasterUnit.class);
		
			Criterion criterionAnd = Restrictions.and(Restrictions.ilike("name", kataPertama+" %"),Restrictions.eq("isDelete", false));
			Criterion criterionOr = Restrictions.or(criterionAnd,Restrictions.ilike("name", kataPertama));
			List<MasterUnit> nameUnit = criteria.add(criterionOr).list();
			return nameUnit;
		
		/*if(index==1) {
			List<MasterUnit> nameUnit = criteria.add(Restrictions.or(Restrictions.and(Restrictions.ilike("name", kataPertama+" %"),Restrictions.eq("isDelete", false)),Restrictions.eq("name", kataPertama))).list();
			return nameUnit;
		}else {
			List<MasterUnit> nameUnit = criteria.add(Restrictions.or(Restrictions.and(Restrictions.ilike("name", kataPertama+"%"),Restrictions.eq("isDelete", false)),Restrictions.eq("name", kataPertama))).list();
			return nameUnit;
		}*/
	}
	
		
}
