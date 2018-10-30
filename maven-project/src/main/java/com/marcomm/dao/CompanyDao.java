package com.marcomm.dao;

import java.util.List;

import com.marcomm.model.Company;

public interface CompanyDao {

	public void save(Company company);

	public List<Company> getAll();

	public Company getCompanyById(int id);

	public void update(Company comp);

	public String getCodeCompany();

	public void delete(int id);


	

}
