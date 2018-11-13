package com.marcomm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.marcomm.dao.MasterUserDao;
import com.marcomm.model.FormSouvenir;
import com.marcomm.model.MasterEmployee;
import com.marcomm.model.MasterSouvenir;
import com.marcomm.model.MasterUser;
import com.marcomm.model.TransaksiEvent;
import com.marcomm.model.TransaksiSouvenir;
import com.marcomm.model.TransaksiSouvenirItem;
import com.marcomm.service.MasterSouvenirService;
import com.marcomm.service.SouvenirRequestService;
import com.marcomm.service.TransaksiEventService;
import com.marcomm.service.TransaksiSouvenirItemService;
 

@Controller
@RequestMapping(value="/souvenirrequest")
public class TransaksiSouvenirRequestController {
	
	@Autowired
	TransaksiSouvenirItemService transaksiSouvenirItemService;
	@Autowired
	MasterSouvenirService masterSouvenirService;
	@Autowired
	SouvenirRequestService souvenirRequestService;
	@Autowired
	TransaksiEventService transaksiEventService;
	@Autowired
	MasterUserDao masterUserDao;
	
	@RequestMapping
	public String index(Model model){
		List<MasterSouvenir> masterSouvenirs= masterSouvenirService.getAllSouvenirQtyOk();
		List<TransaksiEvent> transaksiEvents= transaksiEventService.getAllService();
		MasterUser user= masterUserDao.getUserByUserLog();
		//MasterEmployee 
		model.addAttribute("souvenirs", masterSouvenirs);
		model.addAttribute("events", transaksiEvents );
		model.addAttribute("userlogin", user );
		return "souvenirrequest";
	}
	
	
	//save All data
	@RequestMapping(value="/saveall", method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED) 
	@ResponseBody
	public TransaksiSouvenir saveAllData(@RequestBody TransaksiSouvenir transaksiSouvenir) {
		souvenirRequestService.saveAllData(transaksiSouvenir);
		return transaksiSouvenir;
	}

	//save
	@RequestMapping(value="/save", method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void saveTransaksiSouvenir (@RequestBody TransaksiSouvenir transaksiSouvenir) {
		souvenirRequestService.saveSouvenirRequest(transaksiSouvenir);
	}
	//get all request
	@RequestMapping(value="/getall", method=RequestMethod.GET)
	@ResponseBody
	public List<TransaksiSouvenir> getAllRequest(){
		return souvenirRequestService.getAll();
	}
	
	//get user log
	public MasterUser getUser() {
		MasterUser user = masterUserDao.getUserByUserLog();
		return user;
	}

	//get events avaliable
	@RequestMapping(value="/getevents", method=RequestMethod.GET)
	@ResponseBody
	public List<TransaksiEvent> getEvents(){
		return souvenirRequestService.getEvents();
	}
	
	/*@RequestMapping(value="/getrequest/{id}", method=RequestMethod.GET)
	@ResponseBody
	public TransaksiSouvenir getRequestById(@PathVariable("id") int id) {
		return souvenirRequestService.getRequestById(id);
	}*/
	
	/*@RequestMapping(value="/getitembyid/{id}", method=RequestMethod.GET)
	@ResponseBody
	public TransaksiSouvenirItem getItemById(@PathVariable("id") int id) {
		return souvenirRequestService.getItemById(id);
	}
	*/
	@RequestMapping(value="/getitemsbyid/{id}", method=RequestMethod.GET)
	@ResponseBody
	public List<TransaksiSouvenirItem> getItemsById(@PathVariable("id") int id) {
		return souvenirRequestService.getItemsById(id);
	}
	//save
		@RequestMapping(value="/update/{id}", method=RequestMethod.POST)
		@ResponseStatus(HttpStatus.CREATED)
		public void saveTransaksiSouvenir (@RequestBody TransaksiSouvenir transaksiSouvenir, @PathVariable("id") int id) {
			souvenirRequestService.updateSouvenirRequest(transaksiSouvenir, id);
		}

	//KOLOM REZA
		@RequestMapping(value="/approved/{id}",method=RequestMethod.POST)
		@ResponseStatus(HttpStatus.OK)
		public void approved(@PathVariable ("id")int id, @RequestBody TransaksiSouvenir souvenir) {
			souvenirRequestService.approved(id,souvenir);
			
		}
	
}

