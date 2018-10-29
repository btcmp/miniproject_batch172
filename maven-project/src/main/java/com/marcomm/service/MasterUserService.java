package com.marcomm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcomm.dao.MasterUserDao;
import com.marcomm.model.MasterUser;

@Service
@Transactional
public class MasterUserService {
	
	@Autowired
	MasterUserDao userDao;

	public void save(MasterUser masterUser) {
		userDao.save(masterUser);
		// TODO Auto-generated method stub
		
	}

	public List<MasterUser> getAll() {
		 
		return userDao.getAll();
	}

	public MasterUser getById(int id) {
		// TODO Auto-generated method stub
		return userDao.getById(id);
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		userDao.delete(id);
	}

	public void update(MasterUser masterUser) {
		// TODO Auto-generated method stub
		userDao.update(masterUser);
	}
	
	 
}
