package com.marcomm.service;

import java.util.List;

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
	public List<MasterProduct> getAll(){
		return productDao.getAll();
	}
	public void delete(MasterProduct masterProduct) {
		productDao.delete(masterProduct);
	}
	public void update(MasterProduct masterProduct) {
		productDao.update(masterProduct);
	}
	public MasterProduct getById(int id) {
		return productDao.getById(id);
	}
}
