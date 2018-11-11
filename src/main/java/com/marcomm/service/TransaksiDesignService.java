package com.marcomm.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bankmega.traning.service.EmployeeService;
import com.marcomm.dao.MasterProductDao;
import com.marcomm.dao.MasterUserDao;
import com.marcomm.dao.TransaksiDesignDao;
import com.marcomm.dao.TransaksiDesignItemDao;
import com.marcomm.dao.TransaksiEventDao;
import com.marcomm.model.MasterEmployee;
import com.marcomm.model.MasterProduct;
import com.marcomm.model.MasterUser;
import com.marcomm.model.TransaksiDesign;
import com.marcomm.model.TransaksiDesignItem;
import com.marcomm.model.TransaksiEvent;


@Service
@Transactional
public class TransaksiDesignService {

	@Autowired
	TransaksiDesignDao transaksiDesignDao;
	@Autowired
	TransaksiDesignItemDao transaksiDesignItemDao;
	@Autowired
	TransaksiEventDao transaksiEventDao;
	@Autowired
	MasterUserDao masterUserDao;
	@Autowired
	MasterProductDao masterProductDao;
	@Autowired
	MasterEmployeeService employeeService;
	
		
	public List<TransaksiDesign> getAll() {
		return transaksiDesignDao.getAll();
	}

	public TransaksiDesign getById(int id) {
		// TODO Auto-generated method stub
		return transaksiDesignDao.getById(id);
	}
	public TransaksiDesignItem getByIdItem(int id) {
		return transaksiDesignItemDao.getById(id);
	}

	public String getCodeById() {
		return transaksiDesignDao.getCodeById();
	}
	public MasterUser getRequestBy() {
		return masterUserDao.getUserByUserLog();
	}

	public List<TransaksiDesignItem> getAllItem() {
		return transaksiDesignItemDao.getAll();
	}

	public void save(TransaksiDesign transaksiDesign) {
		TransaksiDesign td = new TransaksiDesign();
		td.setCode(transaksiDesign.getCode());
		td.setRequestDate(transaksiDesign.getRequestDate());
		td.setRequestBy(transaksiDesign.getRequestBy());
		td.setTitleHeader(transaksiDesign.getTitleHeader());
		td.setNote(transaksiDesign.getNote());
		td.setTransaksiEvent(transaksiDesign.getTransaksiEvent());
		td.setCreatedDate(new Date());
		td.setCreatedBy(transaksiDesign.getCreatedBy());
		td.setStatus(1);
		transaksiDesignDao.save(td);
		for (TransaksiDesignItem transaksiDesignItem : transaksiDesign.getTransaksiDesignItems()) {
			TransaksiDesignItem tdi = new TransaksiDesignItem();
			tdi.setMasterProduct(transaksiDesignItem.getMasterProduct());
			tdi.setTitleItem(transaksiDesignItem.getTitleItem());
			tdi.setRequestPic(transaksiDesignItem.getRequestPic());
			tdi.setRequestDueDate(transaksiDesignItem.getRequestDueDate());
			tdi.setNote(transaksiDesignItem.getNote());
			tdi.setTransaksiDesign(td);
			
			transaksiDesignItemDao.save(tdi);
		}
	}
	public List<TransaksiEvent> getEventAvailable(){
		List<TransaksiDesign> transaksiDesign = transaksiDesignDao.getAll();
		if (transaksiDesign.isEmpty()) {
		return transaksiEventDao.getAll();
		}else {
		List<Integer> eventId = new ArrayList<>();
		for (TransaksiDesign td : transaksiDesign) {
			eventId.add(td.getTransaksiEvent().getId());
		}
		return transaksiDesignDao.getEventAvailable(eventId);
		}
	}
	public List<TransaksiDesignItem> getItemByDesignId(int id){
		TransaksiDesign transaksiDesign = transaksiDesignDao.getById(id);
		List<TransaksiDesignItem> transaksiDesignItems = transaksiDesignItemDao.getItemByDesign(transaksiDesign);
		return transaksiDesignItems;
	}

	
//	KOLOM ANGGI
	public void update(TransaksiDesign transaksiDesign) {
		//MENGIRIM KE TABEL DESIGN
		TransaksiDesign transaksiDesign1= transaksiDesignDao.getById(transaksiDesign.getId());//untuk mengambil repositori lama
		TransaksiEvent transaksiEvent = transaksiDesign.getTransaksiEvent();//ini adalah event baru yg akan ditambahkan
		TransaksiEvent transEvent=transaksiEventDao.getEventById(transaksiEvent.getId());//INI ADALAH EVENT BARU dr database src by event id
		
		transaksiDesign1.setTransaksiEvent(transEvent);
		transaksiDesign1.setTitleHeader(transaksiDesign.getTitleHeader());
		transaksiDesign1.setNote(transaksiDesign.getNote());
		
		transaksiDesignDao.update(transaksiDesign1);
		//MENGIRIM KE TABLE ITEM
		List<TransaksiDesignItem> itemsBaru=transaksiDesign.getTransaksiDesignItems();
		for (TransaksiDesignItem transaksiDesignItem : itemsBaru) {			
			if( transaksiDesignItem.getId()==0 ) {
				System.out.println("anda masuk save");
				TransaksiDesignItem tdi = new TransaksiDesignItem();
				MasterProduct masterProduct1= transaksiDesignItem.getMasterProduct();
				tdi.setMasterProduct(masterProductDao.getById(masterProduct1.getId()));
				tdi.setTitleItem(transaksiDesignItem.getTitleItem());
				tdi.setRequestPic(transaksiDesignItem.getRequestPic());
				tdi.setRequestDueDate(transaksiDesignItem.getRequestDueDate());
				tdi.setStartDate(transaksiDesignItem.getStartDate()); 
				tdi.setEndDate(transaksiDesignItem.getEndDate()); 
				tdi.setNote(transaksiDesignItem.getNote());
				tdi.setDelete(false);
				tdi.setTransaksiDesign(transaksiDesignDao.getById(transaksiDesign1.getId()));
				transaksiDesignItemDao.save(tdi);
				
			}else {
				System.out.println("anda masuk update");
			TransaksiDesignItem  itemLama= transaksiDesignItemDao.getById(transaksiDesignItem.getId());
			
			itemLama.setId(transaksiDesignItem.getId());
			itemLama.setNote(transaksiDesignItem.getNote());
			itemLama.setEndDate(transaksiDesignItem.getEndDate());
			itemLama.setStartDate(transaksiDesignItem.getStartDate());
			itemLama.setRequestDueDate(transaksiDesignItem.getRequestDueDate());
			itemLama.setRequestPic(transaksiDesignItem.getRequestPic());
			itemLama.setTitleItem(transaksiDesignItem.getTitleItem());
			itemLama.setDelete(transaksiDesignItem.isDelete());
			MasterProduct productId= transaksiDesignItem.getMasterProduct();
			MasterProduct productBaru= masterProductDao.getById(productId.getId());
			itemLama.setMasterProduct(productBaru);
			
			transaksiDesignItemDao.update(itemLama); 
				
			}
		}
		
	}

	public void approved(TransaksiDesign transaksiDesign) {
		TransaksiDesign transaksiDesign1= transaksiDesignDao.getById(transaksiDesign.getId());//untuk mengambil repositori lama
		
		if(transaksiDesign.getStatus()==2) {
			MasterEmployee employeeAssignTo= transaksiDesign.getAssignTo();
			transaksiDesign1.setAssignTo(employeeAssignTo);
			transaksiDesign1.setStatus(transaksiDesign.getStatus());
			
		}else {
			transaksiDesign1.setStatus(transaksiDesign.getStatus());
			transaksiDesign1.setRejectReason(transaksiDesign.getRejectReason());;
		}
		
		System.out.println(transaksiDesign.getRejectReason());
		transaksiDesignDao.update(transaksiDesign1);
		
	}
}
