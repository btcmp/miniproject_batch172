package com.marcomm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcomm.dao.MasterMenuAccessDao;
import com.marcomm.model.MasterMenu;
import com.marcomm.model.MasterMenuAccess;
import com.marcomm.model.MasterRole;

@Service
@Transactional
public class MasterMenuAccessService {
	
	@Autowired
	MasterMenuAccessDao accessDao;
	

	public void save(MasterMenuAccess menuAccess) {
		// TODO Auto-generated method stub
		accessDao.save(menuAccess);
	}

	public MasterMenuAccess getId(int id) {
		// TODO Auto-generated method stub
		return accessDao.getId(id);
	}

	public List<MasterMenuAccess> getAll() {
		// TODO Auto-generated method stub
		return accessDao.getAll();
	}

	public String getCode() {
		// TODO Auto-generated method stub
		return accessDao.getCode();
	}

	public void update(int id, MasterMenuAccess menuAccess) {
		// TODO Auto-generated method stub
		MasterMenuAccess menu=accessDao.getId(id);
	/*	menu.setmRoleId(menuAccess.getmRoleId());*/
		/*menu.setmMenuId(menuAccess.getmMenuId());*/
		/*menu.setCreatedBy(menuAccess.getCreatedBy());
		menu.setUpdatedBy(menuAccess.getUpdatedBy());*/
		accessDao.update(menu);
		
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		MasterMenuAccess menuAccess=new MasterMenuAccess();
		menuAccess.setId(id);
		accessDao.delete(menuAccess);
	}

	public List<MasterMenu> getMenu() {
		// TODO Auto-generated method stub
		return accessDao.getMenu();
	}

	public List<MasterRole> getRole() {
		// TODO Auto-generated method stub
		return accessDao.getRole();
	}

}
