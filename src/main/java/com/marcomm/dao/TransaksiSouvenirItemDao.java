package com.marcomm.dao;

import java.util.List;

import com.marcomm.model.TransaksiSouvenirItem;

public interface TransaksiSouvenirItemDao {
	
	public void save(TransaksiSouvenirItem transaksiSouvenirItem);
	
	
	public List<TransaksiSouvenirItem> getAllSouvenirItem();
	
	
	public TransaksiSouvenirItem getSouvenirItemById(int id);
	
	public void update(TransaksiSouvenirItem transaksiSouvenirItem);
	
	public void updateSettlement(TransaksiSouvenirItem transaksiSouvenirItem);

}
