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
	
	/*SAVE ADD */
	public void saveTransaksiSouvenir(FormSouvenir model) {
		
		TransaksiSouvenir dataHeader= model.getHeader();
		transaksiSouvenirDao.saveTransaksiSouvenir(dataHeader);
		
		for (TransaksiSouvenirItem itemDetail : model.getDetail()) {
			itemDetail.setTransaksiSouvenir(dataHeader);
			transaksiSouvenirItemDao.save(itemDetail);
		}
	
	}
	/*GET ALL*/
	public List<TransaksiSouvenir> getAllTransaksiSouvenir() {
		return transaksiSouvenirDao.getAllTransaksiSouvenir();
	}
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


}
