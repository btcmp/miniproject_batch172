package com.marcomm.dao;

import java.util.List;

import com.marcomm.model.TransaksiSouvenirItem;

public interface TransaksiSouvenirItemDao {
	
	public void save(TransaksiSouvenirItem transaksiSouvenirItem);

	public TransaksiSouvenirItem getSouvenirItemById(int id);
	
	public void update(TransaksiSouvenirItem transaksiSouvenirItem);
	
	public void updateApproval(TransaksiSouvenirItem transaksiSouvenirItem);
	
	public void updateReceived(TransaksiSouvenirItem transaksiSouvenirItem);
	
	public void updateSettlement(TransaksiSouvenirItem transaksiSouvenirItem);
	
	public void updateSettlementApproval(TransaksiSouvenirItem transaksiSouvenirItem);
	
	public void updateCloseRequest(TransaksiSouvenirItem transaksiSouvenirItem);


	public List<TransaksiSouvenirItem> getAll();
	
	
	
}
