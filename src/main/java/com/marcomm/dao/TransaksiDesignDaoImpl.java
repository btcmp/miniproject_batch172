package com.marcomm.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.marcomm.model.TransaksiDesign;

 


@Repository
public class TransaksiDesignDaoImpl implements TransaksiDesignDao {
	
	@Autowired
	SessionFactory sessionFactory;



	
	
	public void save(TransaksiDesign tDesign) {
		Session session=sessionFactory.getCurrentSession();
		session.save(tDesign);	
	}

	public void delete(TransaksiDesign tDesign) {
		Session session=sessionFactory.getCurrentSession();
		session.update(tDesign);
	}
	

	public void update(TransaksiDesign tDesign) {
		// TODO Auto-generated method stub
		
	}

	public TransaksiDesign getById(int id) {
		Session session=sessionFactory.getCurrentSession();
		return session.get(TransaksiDesign.class, id);
	}

	
	public List<TransaksiDesign> getAll() {
		return null;
	}

	public String getCodeById() {
		String hql = "from TransaksiDesign ORDER BY id DESC";
		SimpleDateFormat format = new SimpleDateFormat("ddMMyy");
		String currentDate = format.format(new Date());
		String kodeDepan ="TRWODS";
		Session session = sessionFactory.getCurrentSession();
		TransaksiDesign transaksiDesign = (TransaksiDesign) session.createQuery(hql).setMaxResults(1).uniqueResult();
		if(transaksiDesign==null) {
			String angka = "00001";
			String fullCode = kodeDepan+currentDate+angka;
			return fullCode;
		}else {
			String angka = transaksiDesign.getCode().substring(12);
			int increment = Integer.valueOf(angka)+1;
			String fullCode = kodeDepan+currentDate+String.format("%05d", increment);
		return fullCode;
		}
	}

}
