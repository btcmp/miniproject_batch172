package com.marcomm.dao;

import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.marcomm.model.MasterProduct;

@Repository
public class MasterProductDaoImpl implements MasterProductDao{

	@Autowired
	SessionFactory sessionFactory;	
	
	public void save(MasterProduct masterProduct) {
		// TODO save data
		masterProduct.setCreatedBy("Admin");
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
//		String hql = "UPDATE MasterProduct SET isDelete = :isDelete" + "WHERE id = :id";
//			   int id = masterProduct.getId();
//			   System.out.println(id);
//		Session session = sessionFactory.getCurrentSession();
//		Query query = session.createQuery(hql);
//		query.setParameter("isDelete", true);
//		query.setParameter("id", id);
//		int result = query.executeUpdate();
//		System.out.println(result);
		Session session = sessionFactory.getCurrentSession();
		session.update(masterProduct);
	}

	public void update(MasterProduct masterProduct) {
		// TODO Auto-generated method stub
		
	}

	public String getCodeById() {
		// TODO get last code
				String hql = "from MasterProduct ORDER BY id DESC";
				Session session = sessionFactory.getCurrentSession();
				MasterProduct masterProduct = (MasterProduct) session.createQuery(hql).setMaxResults(1).uniqueResult();
				if (masterProduct==null) {
					return "PR0001";
				} else {
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

}
