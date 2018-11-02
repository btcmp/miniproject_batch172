package com.marcomm.dao;

import java.util.List;

import com.marcomm.model.MasterMenu;
import com.marcomm.model.MasterMenuAccess;

public interface MasterMenuAccessDao {

	public void save(MasterMenuAccess menuAccess);
	public MasterMenuAccess getId(int id);
	public List<MasterMenuAccess> getAll();
	public String getCode();
	public void update(MasterMenuAccess menu);
	public void delete(MasterMenuAccess menuAccess);
	public List<MasterMenu> getMenu();

}
