package com.marcomm.dao;

import java.util.List;

import com.marcomm.model.TransaksiEvent;

public interface TransaksiEventDao {

	public void save(TransaksiEvent event);

	public List<TransaksiEvent> getAll();

	public String getCodeEvent();

}
