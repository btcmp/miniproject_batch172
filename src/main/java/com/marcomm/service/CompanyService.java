package com.marcomm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcomm.dao.CompanyDao;
import com.marcomm.model.Company;

@Service
@Transactional
public class CompanyService {

	@Autowired
	CompanyDao companyDao;

	public void saveCompany(Company company) {
		// TODO Auto-generated method stub
		companyDao.save(company);
	}

	public List<Company> getAllService() {
		// TODO Auto-generated method stub
		return companyDao.getAll();
	}

	public Company getCompanyById(int id) {
		// TODO Auto-generated method stub
		return companyDao.getCompanyById(id);
	}

	public void update(int id, Company company) {
		// TODO Auto-generated method stub
		Company comp = companyDao.getCompanyById(id);
		comp.setCode(company.getCode());
		comp.setName(company.getName());
		comp.setAddress(company.getAddress());
		comp.setPhone(company.getPhone());
		comp.setEmail(company.getEmail());
		comp.setIsDelete(company.getIsDelete());
		comp.setCreatedBy(company.getCreatedBy());
		comp.setCreatedDate(company.getCreatedDate());
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

	public List<Company> getCompanyByName(String name) {
		// TODO Auto-generated method stub
		return companyDao.getCompanyByName(name);
	}


}
