package com.marcomm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcomm.dao.MasterCompanyDao;
import com.marcomm.dao.MasterUserDao;
import com.marcomm.model.MasterCompany;
import com.marcomm.model.MasterUser;

@Service
@Transactional
public class MasterCompanyService {

	@Autowired
	MasterCompanyDao companyDao;
	
	@Autowired
	MasterUserDao userDao;

	public void saveCompany(MasterCompany company) {
		// TODO Auto-generated method stub
		MasterCompany masterCompany = new MasterCompany();
		masterCompany.setCreatedBy(company.getCreatedBy());
		companyDao.save(company);
	}

	public List<MasterCompany> getAllService() {
		// TODO Auto-generated method stub
		return companyDao.getAll();
	}

	public MasterCompany getCompanyById(int id) {
		// TODO Auto-generated method stub
		return companyDao.getCompanyById(id);
	}

	public void update(int id, MasterCompany company) {
		// TODO Auto-generated method stub
		MasterCompany comp = companyDao.getCompanyById(id);
		comp.setCode(company.getCode());
		comp.setName(company.getName());
		comp.setAddress(company.getAddress());
		comp.setPhone(company.getPhone());
		comp.setEmail(company.getEmail());
		comp.setIsDelete(company.getIsDelete());
		comp.setUpdateBy(company.getUpdateBy());
		comp.setUpdateDate(company.getUpdateDate());
		companyDao.update(comp);
	
	}

	public String getCode() {
		// TODO Auto-generated method stub
		return companyDao.getCodeCompany();
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		companyDao.delete(id);
	}

	public List<MasterCompany> getCompanyByName(String name) {
		// TODO Auto-generated method stub
		return companyDao.getCompanyByName(name);
	}

	public MasterUser getUser() {
		// TODO Auto-generated method stub
		return userDao.getUserByUserLog();
	}


}
