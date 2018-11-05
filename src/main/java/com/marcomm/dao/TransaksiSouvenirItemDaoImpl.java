package com.marcomm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
		// TODO Auto-generated method stub
		return null;
	}

	public TransaksiSouvenirItem getSouvenirItemById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(TransaksiSouvenirItem transaksiSouvenirItem) {
		// TODO Auto-generated method stub
		
	}

	public void updateApproval(TransaksiSouvenirItem transaksiSouvenirItem) {
		// TODO Auto-generated method stub
		
	}

	public void updateReceived(TransaksiSouvenirItem transaksiSouvenirItem) {
		// TODO Auto-generated method stub
		
	}

	public void updateSettlement(TransaksiSouvenirItem transaksiSouvenirItem) {
		// TODO Auto-generated method stub
		
	}

	public void updateSettlementApproval(TransaksiSouvenirItem transaksiSouvenirItem) {
		// TODO Auto-generated method stub
		
	}

	public void updateCloseRequest(TransaksiSouvenirItem transaksiSouvenirItem) {
		// TODO Auto-generated method stub
		
	}

	
}

