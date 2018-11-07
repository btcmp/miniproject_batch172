package com.marcomm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.marcomm.model.FormSouvenir;
import com.marcomm.model.MasterSouvenir;
import com.marcomm.model.TransaksiEvent;
import com.marcomm.model.TransaksiSouvenir;
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
	
	@RequestMapping
	public String index(Model model){
		List<MasterSouvenir> masterSouvenirs= masterSouvenirService.getAllSouvenirQtyOk();
		List<TransaksiEvent> transaksiEvents= transaksiEventService.getAllService();
		model.addAttribute("souvenirs", masterSouvenirs);
		model.addAttribute("events", transaksiEvents );
		return "souvenirrequest";
	}
	
	
	//save All data
	@RequestMapping(value="/saveall", method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void saveAllData(@RequestBody TransaksiSouvenir transaksiSouvenir) {
		souvenirRequestService.saveAllData(transaksiSouvenir);
	}

	//save
	@RequestMapping(value="/save", method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void saveTransaksiSouvenir (@RequestBody TransaksiSouvenir transaksiSouvenir) {
		souvenirRequestService.saveSouvenirRequest(transaksiSouvenir);
		
	}
	//get All 
	@RequestMapping(value="/getall", method=RequestMethod.GET)
	@ResponseBody
	public List<TransaksiSouvenir> getAllTransaksiSouvenirRequest(){
		return souvenirRequestService.getAllSouvenirRequest();
	}
	
	
}

