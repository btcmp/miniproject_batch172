package com.marcomm.dao;

import java.util.List;

import com.marcomm.model.TransaksiSouvenir;

public interface TransaksiSouvenirDao {	

	/*SAVE*/
	public void saveTransaksiSouvenir(TransaksiSouvenir transaksiSouvenir);

	/*GET ALL*/
	public List<TransaksiSouvenir> getAllTransaksiSouvenir();

	/*GET BY ID*/
	public TransaksiSouvenir getTransaksiSouvenir(int id);

	/*UPDATE*/
	public void updateTransSouvenir(TransaksiSouvenir tRS);

	/*DELETE*/
	public void deleteTransSouvenir(TransaksiSouvenir transaksiSouvenir);
	
	/*GET CODE*/
	public String getCodeTrans();

	
	
}
