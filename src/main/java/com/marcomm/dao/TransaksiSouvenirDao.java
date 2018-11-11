package com.marcomm.dao;

import java.util.List;

import com.marcomm.model.TransaksiSouvenir;

public interface TransaksiSouvenirDao {	

	
	
	
	/*GET BY ID*/
	public TransaksiSouvenir getTransaksiSouvenir(int id);

	/*UPDATE*/
	public void updateTransSouvenir(TransaksiSouvenir tRS);

	/*DELETE*/
	public void deleteTransSouvenir(TransaksiSouvenir transaksiSouvenir);
	
	/*GET CODE*/
	public String getCodeTrans();

	/*GET ALL REQUEST*/
	public List<TransaksiSouvenir> getAllRequest();
	
	/*GET ALL STOCK*/
	public List<TransaksiSouvenir> getAllStock();
	
	/*SAVE*/
	public void save(TransaksiSouvenir tSouvenir);
	
	/*GET ALL SOUVENIRS*/
	public List<TransaksiSouvenir> getAll();

	
	
	
}
