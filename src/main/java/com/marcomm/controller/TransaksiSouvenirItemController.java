package com.marcomm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import com.marcomm.service.MasterSouvenirService;
import com.marcomm.service.TransaksiSouvenirItemService;
import com.marcomm.service.TransaksiSouvenirService;

@Controller
@RequestMapping(value="/souveniritem")
public class TransaksiSouvenirItemController {
	
	@Autowired
	TransaksiSouvenirItemService transaksiSouvenirItemService;
	@Autowired
	MasterSouvenirService masterSouvenirService;
	@Autowired
	TransaksiSouvenirService transaksiSouvenirService;
	
	
	@RequestMapping
	public String Index(){
	
		return "souveniritem";
		
	}

}
