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

import com.marcomm.model.MasterProduct;
import com.marcomm.service.FungsiService;

@Repository
public class MasterProductDaoImpl implements MasterProductDao{

	@Autowired
	SessionFactory sessionFactory;	
	@Autowired
	FungsiService fungsiService;
	public void save(MasterProduct masterProduct) {
		// TODO save data
		masterProduct.setCreatedBy(FungsiService.getUserLog());
		Date now = new Date();
		masterProduct.setCreatedDate(now);
		Session session = sessionFactory.getCurrentSession();
		session.save(masterProduct);
	}

	public List<MasterProduct> getAll() {
		// TODO get data
		Session session = sessionFactory.getCurrentSession();
		Criteria cr = session.createCriteria(MasterProduct.class);
		@SuppressWarnings("unchecked")
		List<MasterProduct> listProduct = cr.add(Restrictions.eq("isDelete", false)).addOrder(Order.asc("id")).list();
		return listProduct;
	}

	public void delete(MasterProduct masterProduct) {
		// TODO delete data
		Session session = sessionFactory.getCurrentSession();
		session.update(masterProduct);
	}

	public void update(MasterProduct masterProduct) {
		// TODO update
		masterProduct.setUpdatedBy("Admin");
		Date now = new Date();
		masterProduct.setUpdatedDate(now);
		Session session = sessionFactory.getCurrentSession();
		session.update(masterProduct);
	}

	public String getCodeById() {
		// TODO get last code
				String hql = "from MasterProduct ORDER BY id DESC";
				Session session = sessionFactory.getCurrentSession();
				MasterProduct masterProduct = (MasterProduct) session.createQuery(hql).setMaxResults(1).uniqueResult();
				if (masterProduct==null) {
					return "PR0001";
				} else {
					System.out.println(masterProduct.getCode());
					String prefix = masterProduct.getCode().substring(0, 2);
					String angka = masterProduct.getCode().substring(2);
					int increment = Integer.valueOf(angka)+1;
					String endCode = prefix+String.format("%04d",increment);
					return endCode;
				}			
	}
	public MasterProduct getById(int id) {
		Session session = sessionFactory.getCurrentSession();
		MasterProduct master = session.get(MasterProduct.class, id);
		return master;
	}

	@SuppressWarnings("unchecked")
	public List<MasterProduct> getByName(String name) {
		// TODO get name
		Session session = sessionFactory.getCurrentSession();
		Criteria cr = session.createCriteria(MasterProduct.class);
			Criterion crAnd1 = Restrictions.and(Restrictions.ilike("name", name+" %"),Restrictions.eq("isDelete", false));
			Criterion crAnd2 = Restrictions.and(Restrictions.ilike("name", name),Restrictions.eq("isDelete", false));
			Criterion crOr = Restrictions.or(crAnd1,crAnd2);
			List<MasterProduct> nameProduct = cr.add(crOr).list();
			return nameProduct;
	}

}
