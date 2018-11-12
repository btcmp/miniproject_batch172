package com.marcomm.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bankmega.traning.model.User;
import com.marcomm.dao.MasterSouvenirDao;
import com.marcomm.dao.MasterUserDao;
import com.marcomm.dao.TransaksiEventDao;
import com.marcomm.dao.TransaksiSouvenirDao;
import com.marcomm.dao.TransaksiSouvenirItemDao;
import com.marcomm.model.FormSouvenir;
import com.marcomm.model.MasterSouvenir;
import com.marcomm.model.MasterUser;
import com.marcomm.model.TransaksiDesignItem;
import com.marcomm.model.TransaksiEvent;
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
	
	@Autowired
	MasterUserDao masterUserDao;
	
	public void saveSouvenirRequest(TransaksiSouvenir transaksiSouvenir) {
		Date date = new Date();

		MasterUser user = masterUserDao.getUserByUserLog();
		transaksiSouvenir.setCreatedBy(user.getEmployee());
		transaksiSouvenir.setCreatedDate(date);
		//transaksiSouvenir.setRequestBy(1);
		transaksiSouvenir.setRequestDate(date);
		transaksiSouvenir.setType("reduction");
		transaksiSouvenir.setStatus(1);
		/*transaksiSouvenirDao.saveTransaksiSouvenir(transaksiSouvenir);*/
		
	}
	public void saveAllData(TransaksiSouvenir transaksiSouvenir) {
		TransaksiSouvenir ts= new TransaksiSouvenir();
		MasterUser user = masterUserDao.getUserByUserLog();
		Date date = new Date();

		ts.setCreatedBy(user.getEmployee());
		ts.setCreatedDate(date);
		ts.setRequestBy(user.getEmployee());
		ts.setRequestDate(date);
		ts.setType("reduction");
		ts.setStatus(1);
		ts.setCode(transaksiSouvenir.getCode());
		ts.setRequestDueDate(transaksiSouvenir.getRequestDueDate());
		ts.setNote(transaksiSouvenir.getNote());
		ts.settEventId(transaksiSouvenir.gettEventId());
		transaksiSouvenirDao.save(ts);
		for (TransaksiSouvenirItem transaksiSouvenirItem : transaksiSouvenir.getTransaksiSouvenirItems()) {
			TransaksiSouvenirItem tsi = new TransaksiSouvenirItem();
			MasterSouvenir ms = masterSouvenirDao.getSouvenirById(transaksiSouvenirItem.getMasterSouvenir().getId());
			
			tsi.setTransaksiSouvenir(ts);
			tsi.setMasterSouvenir(ms);
			tsi.setQty(-(transaksiSouvenirItem.getQty()));
			tsi.setNote(transaksiSouvenirItem.getNote());
			tsi.setCreatedBy(user.getEmployee().getEmployeeName());
			tsi.setCreatedDate(date);
			tsi.setDelete(false);
			transaksiSouvenirItemDao.save(tsi);
		}
	} 
	//get all souvenir request
	public List<TransaksiSouvenir> getAll() {
		return transaksiSouvenirDao.getAllRequest();
	}
	
	/*public TransaksiSouvenir getRequestById(int id) {
		// TODO Auto-generated method stub
		return transaksiSouvenirDao.getTransaksiSouvenir(id);
	}*/
	
	public TransaksiSouvenirItem getItemById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	//get items by transaksi
	public List<TransaksiSouvenirItem> getItemsById(int id) {
		TransaksiSouvenir ts= transaksiSouvenirDao.getById(id);
		List<TransaksiSouvenirItem> souvenirItems= transaksiSouvenirItemDao.getItemBySouvenir(ts);
		return souvenirItems;
	}
	public List<TransaksiEvent> getEvents() {
		// TODO Auto-generated method stub
		return null;
	}
	public void updateSouvenirRequest(TransaksiSouvenir transaksiSouvenir, int id) {
		MasterUser user = masterUserDao.getUserByUserLog();
		//TransaksiSouvenir ts= new TransaksiSouvenir();
		TransaksiSouvenir ts = transaksiSouvenirDao.getById(id);
		Date date = new Date();
		//ts.setCreatedBy(1);
		//ts.setCreatedDate(date);
		//ts.setRequestBy(1);
		ts.setRequestDate(date);
		//ts.setType("reduction");
		//ts.setStatus(1);
		//ts.setCode(transaksiSouvenir.getCode());
		ts.setRequestDueDate(transaksiSouvenir.getRequestDueDate());
		ts.setNote(transaksiSouvenir.getNote());
		//ts.settEventId(transaksiSouvenir.gettEventId());
		ts.setUpdatedBy(user.getEmployee());
		ts.setUpdatedDate(date);
		transaksiSouvenirDao.updateTransSouvenir(ts);
		for (TransaksiSouvenirItem transaksiSouvenirItem : transaksiSouvenir.getTransaksiSouvenirItems()) {
			MasterSouvenir ms = masterSouvenirDao.getSouvenirById(transaksiSouvenirItem.getMasterSouvenir().getId());
			/*Long q = transaksiSouvenirItem.getQty();
			int quantityMS=ms.getQuantity()-Math.toIntExact(q);
			ms.setQuantity(quantityMS);
			masterSouvenirDao.update(ms);*/
			
			if(transaksiSouvenirItem.getId()==0) {
				System.out.println("save item tambahan");
				TransaksiSouvenirItem tsi = new TransaksiSouvenirItem();
				TransaksiSouvenir tsu= transaksiSouvenirDao.getById(id);
				tsi.setTransaksiSouvenir(tsu);
				tsi.setMasterSouvenir(ms);
				tsi.setQty(-(transaksiSouvenirItem.getQty()));
				tsi.setNote(transaksiSouvenirItem.getNote());
				tsi.setCreatedBy(user.getEmployee().getEmployeeName());
				tsi.setCreatedDate(date);
				tsi.setDelete(false);
				transaksiSouvenirItemDao.save(tsi);
			}
			else {
				TransaksiSouvenirItem tsi = transaksiSouvenirItemDao.getSouvenirItemById(transaksiSouvenirItem.getId());
				System.out.println("update item lama");		
				tsi.setQty(-(transaksiSouvenirItem.getQty()));
				tsi.setQtySettlement(0L);
				tsi.setNote(transaksiSouvenirItem.getNote());
				tsi.setDelete(transaksiSouvenirItem.isDelete());
				tsi.setUpdatedBy(user.getEmployee().getEmployeeName());
				tsi.setUpdatedDate(date);
				tsi.setMasterSouvenir(ms);
				//
				
				transaksiSouvenirItemDao.update(tsi);
			}
			
		}
		
	}

}
