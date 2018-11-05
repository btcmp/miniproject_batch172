package com.marcomm.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcomm.dao.MasterUserDao;
import com.marcomm.dao.TransaksiDesignDao;
import com.marcomm.model.MasterUser;
import com.marcomm.model.TransaksiDesign;

@Service
@Transactional
public class TransaksiDesignService {

	@Autowired
	TransaksiDesignDao tDesignDao;
	Date dateNow= new Date();
	
	
	public void add(TransaksiDesign tDesign) {
		tDesign.setCreatedDate(dateNow);
		tDesign.setUpdatedDate(dateNow);
		tDesign.setRequestDate(dateNow);
		tDesign.setCreatedBy(FungsiService.getUserLog());
		tDesign.setUpdatedBy(FungsiService.getUserLog());
		tDesign.setRequestBy(FungsiService.getUserLog());
		tDesign.setStatus("submitted");
		
		//code belum ya
		tDesignDao.save(tDesign);
		// TODO Auto-generated method stub
	}
	
	
	public void edit(TransaksiDesign tDesign) {
		
		TransaksiDesign tDesignOld=tDesignDao.getById(tDesign.getId());
		
		tDesignOld.setUpdatedDate(dateNow); 
		tDesignOld.setUpdatedBy(FungsiService.getUserLog());
		
		tDesignOld.settEventId(tDesign.gettEventId());
		tDesignOld.setTitleHeader(tDesign.getTitleHeader());
		tDesignOld.setNote(tDesign.getNote());
		
		tDesignDao.update(tDesignOld);
		// TODO Auto-generated method stub
	}
	
	public void approve(TransaksiDesign tDesign) {
		
		TransaksiDesign tDesignOld=tDesignDao.getById(tDesign.getId());
		tDesignOld.setUpdatedDate(dateNow); 
		tDesignOld.setApprovedDate(dateNow);
		tDesignOld.setUpdatedBy(FungsiService.getUserLog());
		tDesignOld.setApprovedBy(FungsiService.getUserLog());
		
		tDesignOld.setAssignTo(tDesign.getAssignTo());
		tDesignOld.setStatus("approved");
		
		tDesignDao.update(tDesignOld);
		// TODO Auto-generated method stub
	}	
	
	
	
	public void delete(TransaksiDesign tDesign) {
		tDesign.setCreatedDate(dateNow);
		tDesign.setUpdatedDate(dateNow); 
		tDesign.setUpdatedBy(FungsiService.getUserLog());
		tDesign.setIsDelete(true);
		
		tDesignDao.update(tDesign);
		// TODO Auto-generated method stub
	}
	
	public List<TransaksiDesign> getAll() {
		
		return tDesignDao.getAll();
	}

	
	public TransaksiDesign getById(int id) {
		// TODO Auto-generated method stub
		return tDesignDao.getById(id);
	}
	public String getCodeById() {
		return tDesignDao.getCodeById();
	}

	 

}
