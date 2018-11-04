package com.marcomm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcomm.dao.EventDao;
import com.marcomm.model.Event;

@Service
@Transactional
public class EventService {

	@Autowired
	EventDao eventDao;

	public void saveEvent(Event event) {
		// TODO Auto-generated method stub
		eventDao.save(event);
	}

	public List<Event> getAllService() {
		// TODO Auto-generated method stub
		return eventDao.getAll();
	}

	public String getCode() {
		// TODO Auto-generated method stub
		return eventDao.getCodeEvent();
	}
}
