package com.marcomm.dao;

import com.marcomm.model.MasterEmployee;
import com.marcomm.model.MasterRole;

public interface MasterInitDBDao {

	public void saveEmployee (MasterEmployee employee);
	public void saveRole (MasterRole role);

}

