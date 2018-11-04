package com.marcomm.dao;

import java.util.List;

import com.marcomm.model.MasterSouvenir;

public interface MasterSouvenirDao {

	public void save(MasterSouvenir masterSouvenir);
	
	public String getCodeById();
	
	public List<MasterSouvenir> gelAllSouvenir();
	
	public MasterSouvenir getSouvenirById(int id);
	
	public void update(MasterSouvenir masterSouvenir);
	
	public void updateDelete(MasterSouvenir masterSouvenir);

	public List<MasterSouvenir> getByName(String name);
	
	
	
	
	
}
