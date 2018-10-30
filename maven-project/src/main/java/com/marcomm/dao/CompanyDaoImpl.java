package com.marcomm.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.marcomm.model.Company;

@Repository
public class CompanyDaoImpl implements CompanyDao {

	@Autowired
	SessionFactory sessionFactory;

	public void save(Company company) {
		// TODO Auto-generated method stub
		company.setIsDelete(false);
		
		company.setCreatedBy("Administrator");
		company.setUpdateBy("Administrator");
		
		Date now = new Date();
		company.setCreatedDate(now);
		company.setUpdateDate(now);
		
		Session session = sessionFactory.getCurrentSession();
		session.save(company);
	}

	public List<Company> getAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Company.class);
		
		List<Company> companies = criteria.add(Restrictions.eq("isDelete", false)).addOrder(Order.asc("id")).list();
	
		return companies;
	}
	
	public String getCodeCompany() {
		// TODO Auto-generated method stub
		String hql = "from Company ORDER BY id DESC";
		Session session = sessionFactory.getCurrentSession();
		Company comp = (Company) session.createQuery(hql).setMaxResults(1).uniqueResult();
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

	public Company getCompanyById(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Company comp = session.get(Company.class, id);
		return comp;
	}

	public void update(Company comp) {
		// TODO Auto-generated method stub
		comp.setIsDelete(false);
	
		comp.setCreatedBy("Administrator");
		comp.setUpdateBy("Administrator");
		
		Date now = new Date();
		comp.setCreatedDate(now);
		comp.setUpdateDate(now);
		
		Session session = sessionFactory.getCurrentSession();
		session.update(comp);
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		Company company = new Company();
		company = getCompanyById(id);
		company.setIsDelete(true);
		Date now = new Date();
		company.setUpdateDate(now);
		
		Session session = sessionFactory.getCurrentSession();
		session.update(company);
	}

}
