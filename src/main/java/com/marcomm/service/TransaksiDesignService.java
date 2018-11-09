package com.marcomm.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcomm.dao.MasterUserDao;
import com.marcomm.dao.TransaksiDesignDao;
import com.marcomm.dao.TransaksiDesignItemDao;
import com.marcomm.dao.TransaksiEventDao;
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
}
