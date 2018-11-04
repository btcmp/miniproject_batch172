package com.marcomm.dao;

import java.util.List;

import com.marcomm.model.TransDesign;

public interface TransDesignDao {

	public void save(TransDesign tDesign);
	public void delete (TransDesign tDesign);
	public void update (TransDesign tDesign);
	public TransDesign getById(int id);
	public List<TransDesign> getAll();
	
}
