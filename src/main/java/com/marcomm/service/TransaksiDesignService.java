package com.marcomm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.marcomm.dao.TransaksiDesignDao;
import com.marcomm.dao.TransaksiDesignItemDao;
import com.marcomm.model.FormTransaksiDesign;
import com.marcomm.model.TransaksiDesign;
import com.marcomm.model.TransaksiDesignItem;

@Service
@Transactional
public class TransaksiDesignService {

	@Autowired
	TransaksiDesignDao transaksiDesignDao;
	@Autowired
	TransaksiDesignItemDao transaksiDesignItemDao;
		
	public void saveData(FormTransaksiDesign data) {
		TransaksiDesign transaksiDesign = data.getHeader();
		transaksiDesignDao.save(transaksiDesign);
		for (TransaksiDesignItem transaksiItem : data.getDetails()) {
			transaksiDesignItemDao.save(transaksiItem);
		}
	}
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


	public String getRequestBy() {
		return transaksiDesignDao.getRequestBy();
	}
	 

}
