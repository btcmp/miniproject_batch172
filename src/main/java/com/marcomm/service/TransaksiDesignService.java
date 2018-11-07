package com.marcomm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.marcomm.dao.TransaksiDesignDao;
import com.marcomm.dao.TransaksiDesignItemDao;
import com.marcomm.model.TransaksiDesign;
import com.marcomm.model.TransaksiDesignItem;


@Service
@Transactional
public class TransaksiDesignService {

	@Autowired
	TransaksiDesignDao transaksiDesignDao;
	@Autowired
	TransaksiDesignItemDao transaksiDesignItemDao;
		
	public List<TransaksiDesign> getAll() {
		return transaksiDesignDao.getAll();
	}

	public TransaksiDesign getById(int id) {
		// TODO Auto-generated method stub
		return transaksiDesignDao.getById(id);
	}

	public String getCodeById() {
		return transaksiDesignDao.getCodeById();
	}

	public int getId() {
		return transaksiDesignDao.getId();
	}
	public String getRequestBy() {
		return transaksiDesignDao.getRequestBy();
	}

	public List<TransaksiDesignItem> getAllItem() {
		return transaksiDesignItemDao.getAll();
	}

	public void save(TransaksiDesign transaksiDesign) {
		TransaksiDesign td = new TransaksiDesign();
		td.setCode(transaksiDesign.getCode());
		td.setRequestBy(transaksiDesign.getRequestBy());
		td.setTitleHeader(transaksiDesign.getTitleHeader());
		td.setNote(transaksiDesign.getNote());
		td.setTransaksiEvent(transaksiDesign.getTransaksiEvent());
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
	 

}
