package com.marcomm.dao;

import java.util.List;

import com.marcomm.model.TransaksiDesign;
import com.marcomm.model.TransaksiEvent;

public interface TransaksiDesignDao {

	public void save(TransaksiDesign tDesign);
	public TransaksiDesign getById(int id);
	public String getCodeById();
	public List<TransaksiDesign> getAll();
	public String getRequestBy();
	public int getId();
	public List<TransaksiEvent> getEventAvailable();
	
}