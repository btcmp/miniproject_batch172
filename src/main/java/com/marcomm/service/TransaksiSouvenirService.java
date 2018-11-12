package com.marcomm.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcomm.dao.MasterSouvenirDao;
import com.marcomm.dao.MasterUserDao;
import com.marcomm.dao.TransaksiEventDao;
import com.marcomm.dao.TransaksiSouvenirDao;
import com.marcomm.dao.TransaksiSouvenirItemDao;
import com.marcomm.model.FormSouvenir;
import com.marcomm.model.MasterEmployee;
import com.marcomm.model.MasterSouvenir;
import com.marcomm.model.MasterUser;
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
	
	@Autowired
	MasterSouvenirDao masterSouvenirDao;
	
	@Autowired
	MasterUserDao masterUserDao;

	/*UPDATE*/
	public void updateTransSouvenir(TransaksiSouvenir transaksiSouvenir, int id) {
		//DATA TABLE ATAS
		TransaksiSouvenir transaksiSouvenir2 = transaksiSouvenirDao.getById(transaksiSouvenir.getId());//mengambil repository lama
		//transaksiSouvenir2.setCode(transaksiSouvenir.getCode());
		//transaksiSouvenir2.setReceivedBy(1); --> belum fix
		//transaksiSouvenir2.setReceivedDate(transaksiSouvenir.getReceivedDate());
		transaksiSouvenir2.setNote(transaksiSouvenir.getNote());
		
		transaksiSouvenirDao.updateTransSouvenir(transaksiSouvenir2);
		
		//DATA TABLE ITEM
		for(TransaksiSouvenirItem transaksiSouvenirItem : transaksiSouvenir.getTransaksiSouvenirItems()) {
			MasterSouvenir ms = masterSouvenirDao.getSouvenirById(transaksiSouvenirItem.getMasterSouvenir().getId());
			
			
			Long q = transaksiSouvenirItem.getQty();
			int quantityMS = ms.getQuantity()+Math.toIntExact(q);
			ms.setQuantity(quantityMS);
			masterSouvenirDao.update(ms);
			
			if(transaksiSouvenirItem.getId()==0) {
				TransaksiSouvenirItem tsi = new TransaksiSouvenirItem();
				TransaksiSouvenir tsu = transaksiSouvenirDao.getById(id);
				tsi.setTransaksiSouvenir(tsu);
				tsi.setMasterSouvenir(ms);
				tsi.setQty(transaksiSouvenirItem.getQty());
				tsi.setNote(transaksiSouvenirItem.getNote());
				transaksiSouvenirItemDao.save(tsi);
			}else {
				TransaksiSouvenirItem tsi = transaksiSouvenirItemDao.getSouvenirItemById(transaksiSouvenirItem.getId());
				tsi.setQty(transaksiSouvenirItem.getQty());
				tsi.setNote(transaksiSouvenirItem.getNote());
				tsi.setMasterSouvenir(ms);
				
				transaksiSouvenirItemDao.update(tsi);
			}
		}
		
		
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
		
		MasterUser masterUser = masterUserDao.getUserByUserLog();
		ts.setCreatedBy(masterUser.getEmployee());
		
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
			MasterSouvenir ms = masterSouvenirDao.getSouvenirById(transaksiSouvenirItem.getMasterSouvenir().getId());
			
			
			
			tsi.setMasterSouvenir(ms);
			tsi.setQty(transaksiSouvenirItem.getQty());
			tsi.setNote(transaksiSouvenirItem.getNote());
			tsi.setTransaksiSouvenir(ts);
			transaksiSouvenirItemDao.save(tsi);
			
			
			//save ke master souvenir
			Long jml = transaksiSouvenirItem.getQty();
			int quantity = ms.getQuantity()+ Math.toIntExact(jml);
			ms.setQuantity(quantity);
			ms.setUpdatedBy(masterUser.getmRole().getRoleName());
			ms.setUpdatedDate(date);
			masterSouvenirDao.update(ms);
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
	
	/*GET BY ID*/
	public List<TransaksiSouvenirItem> getItemBySouvenirId(int id) {
		TransaksiSouvenir transaksiSouvenir = transaksiSouvenirDao.getById(id);
		List<TransaksiSouvenirItem> transaksiSouvenirItems = transaksiSouvenirItemDao.getItemBySouvenir(transaksiSouvenir);
		return transaksiSouvenirItems;
	}
	
	
	


}
