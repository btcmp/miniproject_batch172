package com.marcomm.dao;

import java.util.List;

import com.marcomm.model.TransaksiEvent;
import com.marcomm.model.TransaksiSouvenir;

public interface TransaksiSouvenirDao {	

	

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
	
	/*GET BY ID FOR SOUVENIR*/
	public TransaksiSouvenir getById(int id);
	
	/*UPATE*/
	public void updateTransSouvenir(TransaksiSouvenir transaksiSouvenir2);

	
	
	/*astya tambah*/
	//get EVENTS avaliable for request
	public List<TransaksiEvent> getEvents(List<Integer> eventId);
	/*astya end*/
}
