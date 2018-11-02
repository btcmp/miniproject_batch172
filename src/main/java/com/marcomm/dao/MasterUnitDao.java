package com.marcomm.dao;

import java.util.List;

import com.marcomm.model.MasterUnit;

public interface MasterUnitDao {

	/*save data*/
	public void saveMasterUnit(MasterUnit masterUnit);
	
	/*get unit by id*/
	public MasterUnit getUnitById(int id);
	
	/*get all unit*/
	public List<MasterUnit> getAllUnit();
	
	/*delete unit*/
	public void deleteUnit(MasterUnit masterUnit);

	/*update unit*/
	public void updateUnit(MasterUnit mut);
	
	/*get code*/
	public String getCode();
	
	/*get by name*/
	public List<MasterUnit> getByName(String kataPertama);

	
	
	
	
	


}
