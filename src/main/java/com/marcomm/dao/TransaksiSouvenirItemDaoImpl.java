package com.marcomm.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.marcomm.model.TransaksiSouvenir;
import com.marcomm.model.TransaksiSouvenirItem;

@Repository
public class TransaksiSouvenirItemDaoImpl implements TransaksiSouvenirItemDao{
	
	@Autowired
	SessionFactory sessionFactory;

	public void save(TransaksiSouvenirItem transaksiSouvenirItem) {
		Session session=sessionFactory.getCurrentSession();
		session.save(transaksiSouvenirItem);
		
	}

	public List<TransaksiSouvenirItem> getAllSouvenirItem() {
		Session session =sessionFactory.getCurrentSession();
		Criteria cr = session.createCriteria(TransaksiSouvenirItem.class);
		@SuppressWarnings("unchecked")
		List<TransaksiSouvenirItem> transaksiSouvenirItems = cr.add(Restrictions.eq("isDelete", false)).list();
		return transaksiSouvenirItems;
	}

	public TransaksiSouvenirItem getSouvenirItemById(int id) {
		Session session =sessionFactory.getCurrentSession();
		TransaksiSouvenirItem transaksiSouvenirItem =session.get(TransaksiSouvenirItem.class, id);
		return transaksiSouvenirItem;
	}


	public void updateSettlement(TransaksiSouvenirItem transaksiSouvenirItem) {
		// TODO Auto-generated method stub
		
	}

	/*PUNYA MAMAD*/
	//Get Item By Souvenir
	public List<TransaksiSouvenirItem> getItemBySouvenir(TransaksiSouvenir transaksiSouvenir) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(TransaksiSouvenirItem.class);
		criteria.add(Restrictions.and(Restrictions.eq("transaksiSouvenir", transaksiSouvenir), Restrictions.eq("isDelete", false)));
		List<TransaksiSouvenirItem> transaksiSouvenirItems = criteria.list();
		return transaksiSouvenirItems;
	}

	/*UPDATE PUNYA MAMAD*/
	public void update(TransaksiSouvenirItem itemLama) {
		Session session = sessionFactory.getCurrentSession();
		session.update(itemLama);
		
	}



	
}

