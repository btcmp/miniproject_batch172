package com.marcomm.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcomm.dao.TransaksiEventDao;
import com.marcomm.dao.TransaksiSouvenirDao;
import com.marcomm.dao.TransaksiSouvenirItemDao;
import com.marcomm.model.FormSouvenir;
import com.marcomm.model.TransaksiSouvenir;
import com.marcomm.model.TransaksiSouvenirItem;




@Service
@Transactional
public class TransaksiSouvenirService {
	
	@Autowired
	TransaksiSouvenirDao transaksiSouvenirDao;
	
	@Autowired
	TransaksiSouvenirItemDao transaksiSouvenirItemDao;
	
	@Autowired
	TransaksiEventDao transaksiEventDao;


	/*GET BY ID*/
	public TransaksiSouvenir getTransaksiSouvenir(int id) {
		return transaksiSouvenirDao.getTransaksiSouvenir(id);
	}
	/*UPDATE*/
	public void updateTransSouvenir(TransaksiSouvenir transaksiSouvenir) {
		TransaksiSouvenir tRS = transaksiSouvenir;
		tRS.setUpdatedBy(1);
		Date date = new Date();
		tRS.setUpdatedDate(date);
		transaksiSouvenirDao.updateTransSouvenir(tRS);
		
	}
	/*DELETE*/
	public void deleteTransSouvenir(int id) {
		TransaksiSouvenir transaksiSouvenir = new TransaksiSouvenir();
		transaksiSouvenir.setId(id);
		transaksiSouvenirDao.deleteTransSouvenir(transaksiSouvenir);
		
	}
	/*GET CODE*/
	public String getCodeTrans() {
		// TODO Auto-generated method stub
		return transaksiSouvenirDao.getCodeTrans();
	}
	
	/*SAVE*/
	public void save(TransaksiSouvenir transaksiSouvenir) {
		TransaksiSouvenir ts = new TransaksiSouvenir();
		ts.setCode(transaksiSouvenir.getCode());
		ts.setType("additional");
		ts.setDelete(false);
		//ts.setReceivedBy(transaksiSouvenir.getReceivedBy());
		ts.setReceivedDate(transaksiSouvenir.getReceivedDate());
		ts.setNote(transaksiSouvenir.getNote());
		//set created date
		Date date = new Date();
		ts.setCreatedDate(date);
		transaksiSouvenirDao.save(ts);
		//add table bawah
		for(TransaksiSouvenirItem transaksiSouvenirItem :transaksiSouvenir.getTransaksiSouvenirItems()) {
			TransaksiSouvenirItem tsi = new TransaksiSouvenirItem();
			tsi.setMasterSouvenir(transaksiSouvenirItem.getMasterSouvenir());
			tsi.setQty(transaksiSouvenirItem.getQty());
			tsi.setNote(transaksiSouvenirItem.getNote());
			tsi.setTransaksiSouvenir(ts);
			transaksiSouvenirItemDao.save(tsi);
		}
	}
	
	/*GET ALL STOCK*/
	public List<TransaksiSouvenir> getAllStock() {
		return transaksiSouvenirDao.getAllStock();
	}
	
	/*GET ALL SOUVENIRS (STOCK+REQUEST)*/
	public List<TransaksiSouvenir> getAll() {
		return transaksiSouvenirDao.getAll();
	}
	


}
