package com.marcomm.dao;

import java.util.List;

import com.marcomm.model.MasterCompany;

public interface MasterCompanyDao {

	public void save(MasterCompany company);

	public List<MasterCompany> getAll();

	public MasterCompany getCompanyById(int id);

	public void update(MasterCompany comp);

	public String getCodeCompany();

	public void delete(int id);

	public List<MasterCompany> getCompanyByName(String firstName);


	

}
