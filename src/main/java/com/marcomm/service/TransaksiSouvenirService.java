package com.marcomm.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcomm.dao.TransaksiSouvenirDao;
import com.marcomm.model.TransaksiSouvenir;




@Service
@Transactional
public class TransaksiSouvenirService {
	
	@Autowired
	TransaksiSouvenirDao transaksiSouvenirDao;
	
	/*SAVE*/
	public void saveTransaksiSouvenir(TransaksiSouvenir transaksiSouvenir) {
		transaksiSouvenirDao.saveTransaksiSouvenir(transaksiSouvenir);
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


}
