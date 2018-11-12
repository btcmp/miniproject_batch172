package com.marcomm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcomm.dao.MasterCompanyDao;
import com.marcomm.model.MasterCompany;

@Service
@Transactional
public class MasterCompanyService {

	@Autowired
	MasterCompanyDao companyDao;

	public void saveCompany(MasterCompany company) {
		// TODO Auto-generated method stub
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


}
