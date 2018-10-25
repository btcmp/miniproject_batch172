package com.marcomm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcomm.dao.MasterProductDao;
import com.marcomm.model.MasterProduct;

@Service
@Transactional
public class MasterProductService {
	
	@Autowired
	MasterProductDao productDao;
	
	public void save(MasterProduct masterProduct){
		productDao.save(masterProduct);
	}
	public String getCode() {
		return productDao.getCodeById();
	}
}
