package com.marcomm.dao;

import java.util.List;

import com.marcomm.model.MasterEmployee;
import com.marcomm.model.MasterRole;
import com.marcomm.model.MasterUser;

public interface MasterUserDao {
	public void save(MasterUser masterUser);

	public List<MasterUser> getAll();

	public MasterUser getById(int id);

	public void delete(int id);

	public void update(MasterUser masterUser);

	public List<MasterRole> getAllRole();

	public List<MasterEmployee> getAllEmployee();
 
}
