package com.marcomm.dao;

import java.util.List;

import com.marcomm.model.TransaksiDesign;

public interface TransaksiDesignDao {

	public void save(TransaksiDesign tDesign);
	public void delete (TransaksiDesign tDesign);
	public void update (TransaksiDesign tDesign);
	public TransaksiDesign getById(int id);
	public List<TransaksiDesign> getAll();
	
}
