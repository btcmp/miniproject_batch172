package com.marcomm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcomm.dao.MasterMenuDao;
import com.marcomm.model.MasterMenu;

@Service
@Transactional
public class MasterMenuService {
	
	@Autowired
	MasterMenuDao menuDao;

	public void save(MasterMenu masterMenu) {
		// TODO Auto-generated method stub
		menuDao.save(masterMenu);
	}
	public List<MasterMenu> getAll() {
		// TODO Auto-generated method stub
		return menuDao.getAll();
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		MasterMenu masterMenu=new MasterMenu();
		masterMenu.setId(id);
		menuDao.delete(masterMenu);
	}

	public MasterMenu getId(int id) {
		// TODO Auto-generated method stub
		return menuDao.getId(id);
	}

	public void update(int id, MasterMenu masterMenu) {
		// TODO Auto-generated method stub
		MasterMenu Menu=menuDao.getId(id);
		Menu.setName(masterMenu.getName());
		Menu.setController(masterMenu.getController());
		Menu.setParentId(masterMenu.getParentId());
		Menu.setCreatedBy(masterMenu.getCreatedBy());
		Menu.setUpdatedBy(masterMenu.getUpdatedBy());
		menuDao.update( Menu);
		
	}
	public String getCode() {
		// TODO Auto-generated method stub
		return menuDao.getCode();
	}

}
