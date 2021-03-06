package com.marcomm.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bankmega.traning.dao.EmployeeDao;
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
		TransaksiSouvenir ts = transaksiSouvenirDao.getById(transaksiSouvenir.getId());
		//transaksiSouvenir2.setCode(transaksiSouvenir.getCode());
		ts.setReceivedBy(transaksiSouvenir.getReceivedBy());
		ts.setReceivedDate(transaksiSouvenir.getReceivedDate());
		ts.setNote(transaksiSouvenir.getNote());
		
		transaksiSouvenirDao.updateTransSouvenir(ts);
		
		//DATA TABLE ITEM
		for(TransaksiSouvenirItem transaksiSouvenirItem : transaksiSouvenir.getTransaksiSouvenirItems()) {
			MasterSouvenir ms = masterSouvenirDao.getSouvenirById(transaksiSouvenirItem.getMasterSouvenir().getId());
			
			Long q;
			
			System.out.println("masuk update atas");
			
			if(transaksiSouvenirItem.getId()==0) {
				
				q = transaksiSouvenirItem.getQty();
				
				TransaksiSouvenirItem tsi = new TransaksiSouvenirItem();
				TransaksiSouvenir tsu = transaksiSouvenirDao.getById(transaksiSouvenir.getId());
				tsi.setTransaksiSouvenir(tsu);
				tsi.setMasterSouvenir(ms);
				tsi.setQty(transaksiSouvenirItem.getQty());
				tsi.setNote(transaksiSouvenirItem.getNote());
				//tsi.setDelete(false);
				transaksiSouvenirItemDao.save(tsi);
			}else {
				TransaksiSouvenirItem tsi = transaksiSouvenirItemDao.getSouvenirItemById(transaksiSouvenirItem.getId());
				
				q = transaksiSouvenirItem.getQty()-tsi.getQty();
				tsi.setQty(transaksiSouvenirItem.getQty());
				tsi.setNote(transaksiSouvenirItem.getNote());
				tsi.setMasterSouvenir(ms);
				
				
				transaksiSouvenirItemDao.update(tsi);
			}
			
			
			int quantityMS = ms.getQuantity()+Math.toIntExact(q);
			ms.setQuantity(quantityMS);
			masterSouvenirDao.update(ms);
			
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
		
		ts.setReceivedBy(transaksiSouvenir.getReceivedBy());
		
		
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
	
	
	/*GET BY ID TOK*/
	public TransaksiSouvenir getById(int id) {
		// TODO Auto-generated method stub
		return transaksiSouvenirDao.getById(id);
	}
	
	
	


}
