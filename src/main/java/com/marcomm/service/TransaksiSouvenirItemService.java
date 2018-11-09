package com.marcomm.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcomm.dao.MasterSouvenirDao;
import com.marcomm.dao.TransaksiSouvenirDao;
import com.marcomm.dao.TransaksiSouvenirItemDao;
import com.marcomm.model.TransaksiSouvenirItem;

@Service
@Transactional
public class TransaksiSouvenirItemService {
	
	@Autowired
	TransaksiSouvenirItemDao transaksiSouvenirItemDao;
	@Autowired
	MasterSouvenirDao masterSouvenirDao;
	@Autowired
	TransaksiSouvenirDao transaksiSouvenirDao;
	
	public void save(TransaksiSouvenirItem transaksiSouvenirItem) {
		Date date = new Date();
		//transaksiSouvenirItem.setCreatedBy(createdBy);
		transaksiSouvenirItem.setCreatedDate(date);
		transaksiSouvenirItem.setDelete(false);
		transaksiSouvenirItemDao.save(transaksiSouvenirItem);
		
	}
	
	public void update(TransaksiSouvenirItem transaksiSouvenirItem) {
		
	}


}
