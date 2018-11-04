package com.marcomm.dao;

import java.util.List;

import com.marcomm.model.Event;

public interface EventDao {

	public void save(Event event);

	public List<Event> getAll();

	public String getCodeEvent();

}
