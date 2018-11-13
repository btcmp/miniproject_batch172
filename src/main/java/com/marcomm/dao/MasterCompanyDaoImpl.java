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

import com.marcomm.model.MasterCompany;
import com.marcomm.service.FungsiService;

@Repository
public class MasterCompanyDaoImpl implements MasterCompanyDao {

	@Autowired
	SessionFactory sessionFactory;

	public void save(MasterCompany company) {
		// TODO Auto-generated method stub
		company.setIsDelete(false);
		
		Date now = new Date();
		company.setCreatedDate(now);
		
		Session session = sessionFactory.getCurrentSession();
		session.save(company);
	}

	public List<MasterCompany> getAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(MasterCompany.class);
		
		List<MasterCompany> companies = criteria.add(Restrictions.eq("isDelete", false)).addOrder(Order.asc("id")).list();
	
		return companies;
	}
	
	public String getCodeCompany() {
		// TODO Auto-generated method stub
		String hql = "from MasterCompany ORDER BY id DESC";
		Session session = sessionFactory.getCurrentSession();
		MasterCompany comp = (MasterCompany) session.createQuery(hql).setMaxResults(1).uniqueResult();
		if(comp==null) {
			return "CP0001";
		}else {
			String prefix = comp.getCode().substring(0,2);
			String angka = comp.getCode().substring(2);
			int increment = Integer.valueOf(angka)+1;
			String endCode = prefix+String.format("%04d", increment);
			return endCode;
		}
	}

	public MasterCompany getCompanyById(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		MasterCompany comp = session.get(MasterCompany.class, id);
		return comp;
	}

	public void update(MasterCompany comp) {
		// TODO Auto-generated method stub
		comp.setIsDelete(false);
		
		Date now = new Date();
		comp.setUpdateDate(now);
		
		Session session = sessionFactory.getCurrentSession();
		session.update(comp);
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		MasterCompany company = new MasterCompany();
		company = getCompanyById(id);
		company.setIsDelete(true);
		Date now = new Date();
		company.setUpdateDate(now);
		
		Session session = sessionFactory.getCurrentSession();
		session.update(company);
	}

	
	public List<MasterCompany> getCompanyByName(String firstName) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(MasterCompany.class);
		
		Criterion criterionAnd = Restrictions.and(Restrictions.ilike("name", firstName+" %"), Restrictions.eq("isDelete", false));
		Criterion criterionOr = Restrictions.or(criterionAnd, Restrictions.ilike("name", firstName));
		List<MasterCompany> nameCompany = criteria.add(criterionOr).list();
		return nameCompany;
		
	}

	@Override
	public String getUser() {
		// TODO Auto-generated method stub
		String user = FungsiService.getUserLog();
		return user;
	}

}
