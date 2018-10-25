package com.marcomm.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.marcomm.model.MasterProduct;

@Repository
public class MasterProductDaoImpl implements MasterProductDao{

	@Autowired
	SessionFactory sessionFactory;	
	
	public void save(MasterProduct masterProduct) {
		masterProduct.setCreatedBy("Admin");
		Date now = new Date();
		masterProduct.setCreatedDate(now);
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(masterProduct);
	}

	public List<MasterProduct> getAll(MasterProduct masterProduct) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(MasterProduct masterProduct) {
		// TODO Auto-generated method stub
		
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
					System.out.println(prefix);
					System.out.println(angka);
					System.out.println(endCode);
					return endCode;
				}
				
	}

}
