package com.marcomm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcomm.dao.TransaksiEventDao;
import com.marcomm.model.MasterEmployee;
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

	public TransaksiEvent getEventById(int id) {
		// TODO Auto-generated method stub
		return eventDao.getEventById(id);
	}

	public void updateEvent(int id, TransaksiEvent event) {
		// TODO Auto-generated method stub
		TransaksiEvent transaksiEvent = eventDao.getEventById(id);
		transaksiEvent.setCode(event.getCode());
		transaksiEvent.setEventName(event.getEventName());
		transaksiEvent.setStartDate(event.getStartDate());
		transaksiEvent.setEndDate(event.getEndDate());
		transaksiEvent.setPlace(event.getPlace());
		transaksiEvent.setBudget(event.getBudget());
		transaksiEvent.setNote(event.getNote());
		eventDao.update(transaksiEvent);
	}

	public void closeEvent(int id) {
		// TODO Auto-generated method stub
		eventDao.closeEvent(id);
	}

	public void acceptEvent(int id, TransaksiEvent event) {
		// TODO Auto-generated method stub
		TransaksiEvent transaksiEvent = eventDao.getEventById(id);
		transaksiEvent.setAssignTo(event.getAssignTo());
		eventDao.accept(transaksiEvent);
	}

	public void rejectEvent(int id, TransaksiEvent event) {
		// TODO Auto-generated method stub
		TransaksiEvent transaksiEvent = eventDao.getEventById(id);
		transaksiEvent.setRejectReason(event.getRejectReason());
		eventDao.reject(transaksiEvent);
	}
	
	public List<MasterEmployee> getAllEmployee(){
		return eventDao.getAllEmployee();
	}
	
}
