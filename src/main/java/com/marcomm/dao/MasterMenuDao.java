package com.marcomm.dao;

import java.util.List;

import com.marcomm.model.MasterMenu;

public interface MasterMenuDao {

	public void save(MasterMenu masterMenu);
	public List<MasterMenu> getAll();
	public void delete(MasterMenu masterMenu);
	public MasterMenu getId(int id);
	public void update(MasterMenu menu);
	public String getCode();

}
