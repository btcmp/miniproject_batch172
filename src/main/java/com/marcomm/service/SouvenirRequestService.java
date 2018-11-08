package com.marcomm.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcomm.dao.MasterSouvenirDao;
import com.marcomm.dao.TransaksiEventDao;
import com.marcomm.dao.TransaksiSouvenirDao;
import com.marcomm.dao.TransaksiSouvenirItemDao;
import com.marcomm.model.FormSouvenir;
import com.marcomm.model.TransaksiDesignItem;
import com.marcomm.model.TransaksiSouvenir;
import com.marcomm.model.TransaksiSouvenirItem;

@Service
@Transactional
public class SouvenirRequestService {
	
	@Autowired
	TransaksiSouvenirDao transaksiSouvenirDao;
	
	@Autowired
	TransaksiSouvenirItemDao transaksiSouvenirItemDao;
	
	@Autowired
	TransaksiEventDao transaksiEventDao;
	
	@Autowired
	MasterSouvenirDao masterSouvenirDao;
	
	
	public void saveSouvenirRequest(TransaksiSouvenir transaksiSouvenir) {
		Date date = new Date();
		transaksiSouvenir.setCreatedBy(1);
		transaksiSouvenir.setCreatedDate(date);
		//transaksiSouvenir.setRequestBy(1);
		transaksiSouvenir.setRequestDate(date);
		transaksiSouvenir.setType("reduction");
		transaksiSouvenir.setStatus(1);
		/*transaksiSouvenirDao.saveTransaksiSouvenir(transaksiSouvenir);*/
		
	}
	public void saveAllData(TransaksiSouvenir transaksiSouvenir) {
		TransaksiSouvenir ts= new TransaksiSouvenir();
		Date date = new Date();
		ts.setCreatedBy(1);
		ts.setCreatedDate(date);
		//ts.setRequestBy(1);
		ts.setRequestDate(date);
		ts.setType("reduction");
		ts.setStatus(1);
		ts.setCode(transaksiSouvenir.getCode());
		ts.setRequestDueDate(transaksiSouvenir.getRequestDueDate());
		ts.setNote(transaksiSouvenir.getNote());
		ts.setTransaksiEvent(transaksiSouvenir.getTransaksiEvent());
		transaksiSouvenirDao.save(ts);
		for (TransaksiSouvenirItem transaksiSouvenirItem : transaksiSouvenir.getTransaksiSouvenirItems()) {
			TransaksiSouvenirItem tsi = new TransaksiSouvenirItem();
			tsi.setTransaksiSouvenir(ts);
			tsi.setMasterSouvenir(transaksiSouvenirItem.getMasterSouvenir());
			tsi.setQty(-(transaksiSouvenirItem.getQty()));
			tsi.setNote(transaksiSouvenirItem.getNote());
			tsi.setCreatedDate(date);
			tsi.setDelete(false);
			transaksiSouvenirItemDao.save(tsi);
		}
	} 
	//get all souvenir request
	public List<TransaksiSouvenir> getAll() {
		return transaksiSouvenirDao.getAllRequest();
	}

}
