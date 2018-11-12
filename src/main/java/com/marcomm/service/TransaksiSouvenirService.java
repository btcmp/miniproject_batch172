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
	public void updateTransSouvenir(TransaksiSouvenir transaksiSouvenir) {
		//DATA TABLE ATAS
		TransaksiSouvenir transaksiSouvenir2 = transaksiSouvenirDao.getById(transaksiSouvenir.getId());//mengambil repository lama
		
		transaksiSouvenir2.setCode(transaksiSouvenir.getCode());
		//transaksiSouvenir2.setReceivedBy(1); --> belum fix
		transaksiSouvenir2.setReceivedDate(transaksiSouvenir.getReceivedDate());
		transaksiSouvenir2.setNote(transaksiSouvenir.getNote());
		
		transaksiSouvenirDao.updateTransSouvenir(transaksiSouvenir2);
		
		//DATA TABLE ITEM
		List<TransaksiSouvenirItem> itemBaru = transaksiSouvenir.getTransaksiSouvenirItems();
		for(TransaksiSouvenirItem transaksiSouvenirItem : itemBaru) {
			//bagian save
			if(transaksiSouvenirItem.getId()==0) {
				TransaksiSouvenirItem tsi = new TransaksiSouvenirItem();
				MasterSouvenir masterSouvenir1 = transaksiSouvenirItem.getMasterSouvenir();
				tsi.setMasterSouvenir(masterSouvenirDao.getSouvenirById(masterSouvenir1.getId()));
				tsi.setQty(transaksiSouvenirItem.getQty());
				tsi.setNote(transaksiSouvenirItem.getNote());
				tsi.setDelete(false);
				transaksiSouvenirItemDao.save(tsi);
			}else {
				//bagian update
				TransaksiSouvenirItem itemLama = transaksiSouvenirItemDao.getSouvenirItemById(transaksiSouvenirItem.getId());
				
				itemLama.setId(transaksiSouvenirItem.getId());
				MasterSouvenir souvenirId = transaksiSouvenirItem.getMasterSouvenir();
				MasterSouvenir souvenirBaru = masterSouvenirDao.getSouvenirById(souvenirId.getId());
				itemLama.setMasterSouvenir(souvenirBaru);
				itemLama.setQty(transaksiSouvenirItem.getQty());
				itemLama.setNote(transaksiSouvenirItem.getNote());
				
				transaksiSouvenirItemDao.update(itemLama);
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
	
	/*GET BY ID*/
	public List<TransaksiSouvenirItem> getItemBySouvenirId(int id) {
		TransaksiSouvenir transaksiSouvenir = transaksiSouvenirDao.getById(id);
		List<TransaksiSouvenirItem> transaksiSouvenirItems = transaksiSouvenirItemDao.getItemBySouvenir(transaksiSouvenir);
		return transaksiSouvenirItems;
	}
	
	
	


}
