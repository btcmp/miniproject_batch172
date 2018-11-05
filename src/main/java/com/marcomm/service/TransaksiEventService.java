package com.marcomm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcomm.dao.TransaksiEventDao;
import com.marcomm.model.TransaksiEvent;

@Service
@Transactional
public class TransaksiEventService {

	@Autowired
	TransaksiEventDao eventDao;

	public void saveEvent(TransaksiEvent event) {
		// TODO Auto-generated method stub
		eventDao.save(event);
	}

	public List<TransaksiEvent> getAllService() {
		// TODO Auto-generated method stub
		return eventDao.getAll();
	}

	public String getCode() {
		// TODO Auto-generated method stub
		return eventDao.getCodeEvent();
	}
}
