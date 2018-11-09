package com.marcomm.dao;

import java.util.List;

import com.marcomm.model.MasterEmployee;
import com.marcomm.model.TransaksiEvent;

public interface TransaksiEventDao {

	public void save(TransaksiEvent event);

	public List<TransaksiEvent> getAll();

	public String getCodeEvent();

	public TransaksiEvent getEventById(int id);

	public void update(TransaksiEvent event);

	public void closeEvent(int id);

	public void accept(TransaksiEvent transaksiEvent);

	public void reject(TransaksiEvent transaksiEvent);

	public List<MasterEmployee> getAllEmployee();

}
