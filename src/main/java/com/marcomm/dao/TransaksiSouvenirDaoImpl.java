package com.marcomm.dao;

import java.text.SimpleDateFormat;
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

import com.marcomm.model.TransaksiSouvenir;

@Repository
public class TransaksiSouvenirDaoImpl implements TransaksiSouvenirDao{

	@Autowired
	SessionFactory sessionFactory;

	/*GETALL SEMUA TRANSAKSI REQUEST&STOCK*/
	public List<TransaksiSouvenir> getAllTransaksiSouvenir() {
		Session session = sessionFactory.getCurrentSession();
		Criteria cr = session.createCriteria(TransaksiSouvenir.class);
		Criterion criterionAnd = Restrictions.and(Restrictions.eq("isDelete", false));
		List<TransaksiSouvenir> listTranSou = cr.add(criterionAnd).list();
		return listTranSou;
	}
	
	/*GETALL STOCK*/
	public List<TransaksiSouvenir> getAllStock() {
		Session session = sessionFactory.getCurrentSession();
		Criteria cr = session.createCriteria(TransaksiSouvenir.class);
		Criterion criterionAnd = Restrictions.and(Restrictions.eq("isDelete", false),Restrictions.eq("type", "additional"));
		List<TransaksiSouvenir> listTranSou = cr.add(criterionAnd).list();
		return listTranSou;
	}
	
	/*GETALL REQUEST*/
	public List<TransaksiSouvenir> getAllRequest() {
		Session session = sessionFactory.getCurrentSession();
		Criteria cr = session.createCriteria(TransaksiSouvenir.class);
		Criterion criterionAnd = Restrictions.and(Restrictions.eq("isDelete", false),Restrictions.eq("type", "reduction")); 
		List<TransaksiSouvenir> listTranSou = cr.add(criterionAnd).list();
		return listTranSou;
		
	}
	
	/*GET BY ID*/
	public TransaksiSouvenir getTransaksiSouvenir(int id) {
		Session session = sessionFactory.getCurrentSession();
		TransaksiSouvenir transaksiSouvenir = session.get(TransaksiSouvenir.class, id);
		return transaksiSouvenir;
	}

	/*UPDATE*/
	public void updateTransSouvenir(TransaksiSouvenir tRS) {
		Session session = sessionFactory.getCurrentSession();
		session.update(tRS);
		
	}
	/*DELETE*/
	public void deleteTransSouvenir(TransaksiSouvenir transaksiSouvenir) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(transaksiSouvenir);
		
	}

	/*GET CODE*/
	public String getCodeTrans() {
		String hql = "from TransaksiSouvenir ORDER BY id DESC";
		SimpleDateFormat format = new SimpleDateFormat("ddMMyy");
		String currentDate = format.format(new Date());
		String kodeAwal = "TRSV";
		Session session = sessionFactory.getCurrentSession();
		TransaksiSouvenir transaksiSouvenir = (TransaksiSouvenir) session.createQuery(hql).setMaxResults(1).uniqueResult();
		if(transaksiSouvenir==null) {
			String angka = "00001";
			String fullCode = kodeAwal+currentDate+angka;
			return fullCode;
		}else {
			String angka = transaksiSouvenir.getCode().substring(12);
			int increment = Integer.valueOf(angka)+1;
			String fullCode = kodeAwal+currentDate+String.format("%05d", increment);
			return fullCode;
		}
	}

	/*SAVE*/
	public void save(TransaksiSouvenir tSouvenir) {
		Session session = sessionFactory.getCurrentSession();
		session.save(tSouvenir);
		
	}



	
	
	
	
	
}
